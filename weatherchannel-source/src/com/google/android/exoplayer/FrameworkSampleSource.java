// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;

import android.content.Context;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import com.google.android.exoplayer.drm.DrmInitData;
import com.google.android.exoplayer.extractor.mp4.PsshAtomUtil;
import com.google.android.exoplayer.util.Assertions;
import com.google.android.exoplayer.util.Util;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

// Referenced classes of package com.google.android.exoplayer:
//            SampleSource, MediaFormat, MediaFormatHolder, SampleHolder, 
//            CryptoInfo

public final class FrameworkSampleSource
    implements SampleSource, SampleSource.SampleSourceReader
{

    private static final int ALLOWED_FLAGS_MASK = 3;
    private static final int TRACK_STATE_DISABLED = 0;
    private static final int TRACK_STATE_ENABLED = 1;
    private static final int TRACK_STATE_FORMAT_SENT = 2;
    private final Context context;
    private MediaExtractor extractor;
    private final FileDescriptor fileDescriptor;
    private final long fileDescriptorLength;
    private final long fileDescriptorOffset;
    private final Map headers;
    private boolean pendingDiscontinuities[];
    private IOException preparationError;
    private boolean prepared;
    private int remainingReleaseCount;
    private long seekPositionUs;
    private com.google.android.exoplayer.MediaFormat trackFormats[];
    private int trackStates[];
    private final Uri uri;

    public FrameworkSampleSource(Context context1, Uri uri1, Map map)
    {
        boolean flag;
        if (Util.SDK_INT >= 16)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.checkState(flag);
        context = (Context)Assertions.checkNotNull(context1);
        uri = (Uri)Assertions.checkNotNull(uri1);
        headers = map;
        fileDescriptor = null;
        fileDescriptorOffset = 0L;
        fileDescriptorLength = 0L;
    }

    public FrameworkSampleSource(FileDescriptor filedescriptor, long l, long l1)
    {
        boolean flag;
        if (Util.SDK_INT >= 16)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.checkState(flag);
        fileDescriptor = (FileDescriptor)Assertions.checkNotNull(filedescriptor);
        fileDescriptorOffset = l;
        fileDescriptorLength = l1;
        context = null;
        uri = null;
        headers = null;
    }

    private static com.google.android.exoplayer.MediaFormat createMediaFormat(MediaFormat mediaformat)
    {
        Object obj = mediaformat.getString("mime");
        String s = getOptionalStringV16(mediaformat, "language");
        int j = getOptionalIntegerV16(mediaformat, "max-input-size");
        int k = getOptionalIntegerV16(mediaformat, "width");
        int l = getOptionalIntegerV16(mediaformat, "height");
        int i1 = getOptionalIntegerV16(mediaformat, "rotation-degrees");
        int j1 = getOptionalIntegerV16(mediaformat, "channel-count");
        int k1 = getOptionalIntegerV16(mediaformat, "sample-rate");
        ArrayList arraylist = new ArrayList();
        for (int i = 0; mediaformat.containsKey((new StringBuilder()).append("csd-").append(i).toString()); i++)
        {
            ByteBuffer bytebuffer = mediaformat.getByteBuffer((new StringBuilder()).append("csd-").append(i).toString());
            byte abyte0[] = new byte[bytebuffer.limit()];
            bytebuffer.get(abyte0);
            arraylist.add(abyte0);
            bytebuffer.flip();
        }

        long l1;
        if (mediaformat.containsKey("durationUs"))
        {
            l1 = mediaformat.getLong("durationUs");
        } else
        {
            l1 = -1L;
        }
        obj = new com.google.android.exoplayer.MediaFormat(-1, ((String) (obj)), -1, j, l1, k, l, i1, -1F, j1, k1, s, 0x7fffffffffffffffL, arraylist, false, -1, -1);
        ((com.google.android.exoplayer.MediaFormat) (obj)).setFrameworkFormatV16(mediaformat);
        return ((com.google.android.exoplayer.MediaFormat) (obj));
    }

    private DrmInitData getDrmInitDataV18()
    {
        Map map = extractor.getPsshInfo();
        if (map != null && !map.isEmpty()) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((DrmInitData) (obj));
_L2:
        com.google.android.exoplayer.drm.DrmInitData.Mapped mapped = new com.google.android.exoplayer.drm.DrmInitData.Mapped("video/mp4");
        Iterator iterator = map.keySet().iterator();
        do
        {
            obj = mapped;
            if (!iterator.hasNext())
            {
                continue;
            }
            obj = (UUID)iterator.next();
            mapped.put(((UUID) (obj)), PsshAtomUtil.buildPsshAtom(((UUID) (obj)), (byte[])map.get(obj)));
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static final int getOptionalIntegerV16(MediaFormat mediaformat, String s)
    {
        if (mediaformat.containsKey(s))
        {
            return mediaformat.getInteger(s);
        } else
        {
            return -1;
        }
    }

    private static final String getOptionalStringV16(MediaFormat mediaformat, String s)
    {
        if (mediaformat.containsKey(s))
        {
            return mediaformat.getString(s);
        } else
        {
            return null;
        }
    }

    private void seekToUsInternal(long l, boolean flag)
    {
        if (flag || seekPositionUs != l)
        {
            seekPositionUs = l;
            extractor.seekTo(l, 0);
            for (int i = 0; i < trackStates.length; i++)
            {
                if (trackStates[i] != 0)
                {
                    pendingDiscontinuities[i] = true;
                }
            }

        }
    }

    public boolean continueBuffering(int i, long l)
    {
        return true;
    }

    public void disable(int i)
    {
        Assertions.checkState(prepared);
        boolean flag;
        if (trackStates[i] != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.checkState(flag);
        extractor.unselectTrack(i);
        pendingDiscontinuities[i] = false;
        trackStates[i] = 0;
    }

    public void enable(int i, long l)
    {
        boolean flag1 = true;
        Assertions.checkState(prepared);
        boolean flag;
        if (trackStates[i] == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.checkState(flag);
        trackStates[i] = 1;
        extractor.selectTrack(i);
        if (l != 0L)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        seekToUsInternal(l, flag);
    }

    public long getBufferedPositionUs()
    {
        Assertions.checkState(prepared);
        long l = extractor.getCachedDuration();
        if (l == -1L)
        {
            return -1L;
        }
        long l1 = extractor.getSampleTime();
        if (l1 == -1L)
        {
            return -3L;
        } else
        {
            return l1 + l;
        }
    }

    public com.google.android.exoplayer.MediaFormat getFormat(int i)
    {
        Assertions.checkState(prepared);
        return trackFormats[i];
    }

    public int getTrackCount()
    {
        Assertions.checkState(prepared);
        return trackStates.length;
    }

    public void maybeThrowError()
        throws IOException
    {
        if (preparationError != null)
        {
            throw preparationError;
        } else
        {
            return;
        }
    }

    public boolean prepare(long l)
    {
        if (prepared)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        if (preparationError != null)
        {
            return false;
        }
        extractor = new MediaExtractor();
        if (context == null) goto _L2; else goto _L1
_L1:
        extractor.setDataSource(context, uri, headers);
_L4:
        trackStates = new int[extractor.getTrackCount()];
        pendingDiscontinuities = new boolean[trackStates.length];
        trackFormats = new com.google.android.exoplayer.MediaFormat[trackStates.length];
        for (int i = 0; i < trackStates.length; i++)
        {
            trackFormats[i] = createMediaFormat(extractor.getTrackFormat(i));
        }

        break; /* Loop/switch isn't completed */
_L2:
        try
        {
            extractor.setDataSource(fileDescriptor, fileDescriptorOffset, fileDescriptorLength);
        }
        catch (IOException ioexception)
        {
            preparationError = ioexception;
            return false;
        }
        if (true) goto _L4; else goto _L3
_L3:
        prepared = true;
        return true;
    }

    public int readData(int i, long l, MediaFormatHolder mediaformatholder, SampleHolder sampleholder, boolean flag)
    {
        byte byte0 = -2;
        Assertions.checkState(prepared);
        boolean flag1;
        if (trackStates[i] != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Assertions.checkState(flag1);
        if (pendingDiscontinuities[i])
        {
            pendingDiscontinuities[i] = false;
            byte0 = -5;
        } else
        if (!flag)
        {
            if (trackStates[i] != 2)
            {
                mediaformatholder.format = trackFormats[i];
                if (Util.SDK_INT >= 18)
                {
                    sampleholder = getDrmInitDataV18();
                } else
                {
                    sampleholder = null;
                }
                mediaformatholder.drmInitData = sampleholder;
                trackStates[i] = 2;
                return -4;
            }
            int j = extractor.getSampleTrackIndex();
            if (j == i)
            {
                if (sampleholder.data != null)
                {
                    i = sampleholder.data.position();
                    sampleholder.size = extractor.readSampleData(sampleholder.data, i);
                    sampleholder.data.position(sampleholder.size + i);
                } else
                {
                    sampleholder.size = 0;
                }
                sampleholder.timeUs = extractor.getSampleTime();
                sampleholder.flags = extractor.getSampleFlags() & 3;
                if (sampleholder.isEncrypted())
                {
                    sampleholder.cryptoInfo.setFromExtractorV16(extractor);
                }
                seekPositionUs = -1L;
                extractor.advance();
                return -3;
            }
            if (j < 0)
            {
                i = -1;
            } else
            {
                i = -2;
            }
            return i;
        }
        return byte0;
    }

    public SampleSource.SampleSourceReader register()
    {
        remainingReleaseCount = remainingReleaseCount + 1;
        return this;
    }

    public void release()
    {
        int i;
        boolean flag;
        if (remainingReleaseCount > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.checkState(flag);
        i = remainingReleaseCount - 1;
        remainingReleaseCount = i;
        if (i == 0 && extractor != null)
        {
            extractor.release();
            extractor = null;
        }
    }

    public void seekToUs(long l)
    {
        Assertions.checkState(prepared);
        seekToUsInternal(l, false);
    }
}
