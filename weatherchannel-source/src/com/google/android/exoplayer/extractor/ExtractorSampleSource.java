// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.extractor;

import android.net.Uri;
import android.os.SystemClock;
import android.util.SparseArray;
import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.MediaFormatHolder;
import com.google.android.exoplayer.SampleHolder;
import com.google.android.exoplayer.SampleSource;
import com.google.android.exoplayer.drm.DrmInitData;
import com.google.android.exoplayer.upstream.Allocator;
import com.google.android.exoplayer.upstream.DataSource;
import com.google.android.exoplayer.upstream.DefaultAllocator;
import com.google.android.exoplayer.upstream.Loader;
import com.google.android.exoplayer.util.Assertions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer.extractor:
//            ExtractorOutput, Extractor, SeekMap, TrackOutput

public final class ExtractorSampleSource
    implements SampleSource, com.google.android.exoplayer.SampleSource.SampleSourceReader, ExtractorOutput, com.google.android.exoplayer.upstream.Loader.Callback
{

    private static final List DEFAULT_EXTRACTOR_CLASSES;
    public static final int DEFAULT_MIN_LOADABLE_RETRY_COUNT_LIVE = 6;
    public static final int DEFAULT_MIN_LOADABLE_RETRY_COUNT_ON_DEMAND = 3;
    private static final int MIN_RETRY_COUNT_DEFAULT_FOR_MEDIA = -1;
    private static final long NO_RESET_PENDING = 0x8000000000000000L;
    private final Allocator allocator;
    private IOException currentLoadableException;
    private int currentLoadableExceptionCount;
    private long currentLoadableExceptionTimestamp;
    private final DataSource dataSource;
    private long downstreamPositionUs;
    private volatile DrmInitData drmInitData;
    private int enabledTrackCount;
    private int extractedSampleCount;
    private int extractedSampleCountAtStartOfLoad;
    private final ExtractorHolder extractorHolder;
    private boolean havePendingNextSampleUs;
    private long lastSeekPositionUs;
    private ExtractingLoadable loadable;
    private Loader loader;
    private boolean loadingFinished;
    private long maxTrackDurationUs;
    private MediaFormat mediaFormats[];
    private final int minLoadableRetryCount;
    private boolean pendingDiscontinuities[];
    private boolean pendingMediaFormat[];
    private long pendingNextSampleUs;
    private long pendingResetPositionUs;
    private boolean prepared;
    private int remainingReleaseCount;
    private final int requestedBufferSize;
    private final SparseArray sampleQueues;
    private long sampleTimeOffsetUs;
    private volatile SeekMap seekMap;
    private boolean trackEnabledStates[];
    private volatile boolean tracksBuilt;
    private final Uri uri;

    public transient ExtractorSampleSource(Uri uri1, DataSource datasource, int i, int j, Extractor aextractor[])
    {
        this(uri1, datasource, ((Allocator) (new DefaultAllocator(0x10000))), i, j, aextractor);
    }

    public transient ExtractorSampleSource(Uri uri1, DataSource datasource, int i, Extractor aextractor[])
    {
        this(uri1, datasource, ((Allocator) (new DefaultAllocator(0x10000))), i, aextractor);
    }

    public transient ExtractorSampleSource(Uri uri1, DataSource datasource, Allocator allocator1, int i, int j, Extractor aextractor[])
    {
label0:
        {
            super();
            uri = uri1;
            dataSource = datasource;
            allocator = allocator1;
            requestedBufferSize = i;
            minLoadableRetryCount = j;
            if (aextractor != null)
            {
                uri1 = aextractor;
                if (aextractor.length != 0)
                {
                    break label0;
                }
            }
            datasource = new Extractor[DEFAULT_EXTRACTOR_CLASSES.size()];
            i = 0;
            do
            {
                uri1 = datasource;
                if (i >= datasource.length)
                {
                    break;
                }
                try
                {
                    datasource[i] = (Extractor)((Class)DEFAULT_EXTRACTOR_CLASSES.get(i)).newInstance();
                }
                // Misplaced declaration of an exception variable
                catch (Uri uri1)
                {
                    throw new IllegalStateException("Unexpected error creating default extractor", uri1);
                }
                // Misplaced declaration of an exception variable
                catch (Uri uri1)
                {
                    throw new IllegalStateException("Unexpected error creating default extractor", uri1);
                }
                i++;
            } while (true);
        }
    /* block-local class not found */
    class ExtractorHolder {}

        extractorHolder = new ExtractorHolder(uri1, this);
        sampleQueues = new SparseArray();
        pendingResetPositionUs = 0x8000000000000000L;
    }

    public transient ExtractorSampleSource(Uri uri1, DataSource datasource, Allocator allocator1, int i, Extractor aextractor[])
    {
        this(uri1, datasource, allocator1, i, -1, aextractor);
    }

    private void clearState()
    {
        for (int i = 0; i < sampleQueues.size(); i++)
        {
    /* block-local class not found */
    class InternalTrackOutput {}

            ((InternalTrackOutput)sampleQueues.valueAt(i)).clear();
        }

        loadable = null;
        currentLoadableException = null;
        currentLoadableExceptionCount = 0;
    }

    private ExtractingLoadable createLoadableFromPositionUs(long l)
    {
    /* block-local class not found */
    class ExtractingLoadable {}

        return new ExtractingLoadable(uri, dataSource, extractorHolder, allocator, requestedBufferSize, seekMap.getPosition(l));
    }

    private ExtractingLoadable createLoadableFromStart()
    {
        return new ExtractingLoadable(uri, dataSource, extractorHolder, allocator, requestedBufferSize, 0L);
    }

    private void discardSamplesForDisabledTracks(long l)
    {
        for (int i = 0; i < trackEnabledStates.length; i++)
        {
            if (!trackEnabledStates[i])
            {
                ((InternalTrackOutput)sampleQueues.valueAt(i)).discardUntil(l);
            }
        }

    }

    private long getRetryDelayMillis(long l)
    {
        return Math.min((l - 1L) * 1000L, 5000L);
    }

    private boolean haveFormatsForAllTracks()
    {
        for (int i = 0; i < sampleQueues.size(); i++)
        {
            if (!((InternalTrackOutput)sampleQueues.valueAt(i)).hasFormat())
            {
                return false;
            }
        }

        return true;
    }

    private boolean isCurrentLoadableExceptionFatal()
    {
    /* block-local class not found */
    class UnrecognizedInputFormatException {}

        return currentLoadableException instanceof UnrecognizedInputFormatException;
    }

    private boolean isPendingReset()
    {
        return pendingResetPositionUs != 0x8000000000000000L;
    }

    private void maybeStartLoading()
    {
        boolean flag = false;
        if (!loadingFinished && !loader.isLoading()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (currentLoadableException == null) goto _L4; else goto _L3
_L3:
        if (isCurrentLoadableExceptionFatal()) goto _L1; else goto _L5
_L5:
        if (loadable != null)
        {
            flag = true;
        }
        Assertions.checkState(flag);
        if (SystemClock.elapsedRealtime() - currentLoadableExceptionTimestamp < getRetryDelayMillis(currentLoadableExceptionCount)) goto _L1; else goto _L6
_L6:
        currentLoadableException = null;
        if (prepared) goto _L8; else goto _L7
_L7:
        for (int i = 0; i < sampleQueues.size(); i++)
        {
            ((InternalTrackOutput)sampleQueues.valueAt(i)).clear();
        }

        loadable = createLoadableFromStart();
_L9:
        extractedSampleCountAtStartOfLoad = extractedSampleCount;
        loader.startLoading(loadable, this);
        return;
_L8:
        if (!seekMap.isSeekable() && maxTrackDurationUs == -1L)
        {
            for (int j = 0; j < sampleQueues.size(); j++)
            {
                ((InternalTrackOutput)sampleQueues.valueAt(j)).clear();
            }

            loadable = createLoadableFromStart();
            pendingNextSampleUs = downstreamPositionUs;
            havePendingNextSampleUs = true;
        }
        if (true) goto _L9; else goto _L4
_L4:
        sampleTimeOffsetUs = 0L;
        havePendingNextSampleUs = false;
        if (!prepared)
        {
            loadable = createLoadableFromStart();
        } else
        {
            Assertions.checkState(isPendingReset());
            if (maxTrackDurationUs != -1L && pendingResetPositionUs >= maxTrackDurationUs)
            {
                loadingFinished = true;
                pendingResetPositionUs = 0x8000000000000000L;
                return;
            }
            loadable = createLoadableFromPositionUs(pendingResetPositionUs);
            pendingResetPositionUs = 0x8000000000000000L;
        }
        extractedSampleCountAtStartOfLoad = extractedSampleCount;
        loader.startLoading(loadable, this);
        return;
    }

    private void restartFrom(long l)
    {
        pendingResetPositionUs = l;
        loadingFinished = false;
        if (loader.isLoading())
        {
            loader.cancelLoading();
            return;
        } else
        {
            clearState();
            maybeStartLoading();
            return;
        }
    }

    public boolean continueBuffering(int i, long l)
    {
        Assertions.checkState(prepared);
        Assertions.checkState(trackEnabledStates[i]);
        downstreamPositionUs = l;
        discardSamplesForDisabledTracks(downstreamPositionUs);
        if (loadingFinished)
        {
            return true;
        }
        maybeStartLoading();
        if (isPendingReset())
        {
            return false;
        }
        boolean flag;
        if (!((InternalTrackOutput)sampleQueues.valueAt(i)).isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

    public void disable(int i)
    {
label0:
        {
            Assertions.checkState(prepared);
            Assertions.checkState(trackEnabledStates[i]);
            enabledTrackCount = enabledTrackCount - 1;
            trackEnabledStates[i] = false;
            if (enabledTrackCount == 0)
            {
                downstreamPositionUs = 0x8000000000000000L;
                if (!loader.isLoading())
                {
                    break label0;
                }
                loader.cancelLoading();
            }
            return;
        }
        clearState();
        allocator.trim(0);
    }

    public void drmInitData(DrmInitData drminitdata)
    {
        drmInitData = drminitdata;
    }

    public void enable(int i, long l)
    {
        Assertions.checkState(prepared);
        boolean flag;
        if (!trackEnabledStates[i])
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.checkState(flag);
        enabledTrackCount = enabledTrackCount + 1;
        trackEnabledStates[i] = true;
        pendingMediaFormat[i] = true;
        pendingDiscontinuities[i] = false;
        if (enabledTrackCount == 1)
        {
            if (!seekMap.isSeekable())
            {
                l = 0L;
            }
            downstreamPositionUs = l;
            lastSeekPositionUs = l;
            restartFrom(l);
        }
    }

    public void endTracks()
    {
        tracksBuilt = true;
    }

    public long getBufferedPositionUs()
    {
        long l1;
        if (loadingFinished)
        {
            l1 = -3L;
        } else
        {
            if (isPendingReset())
            {
                return pendingResetPositionUs;
            }
            long l = 0x8000000000000000L;
            for (int i = 0; i < sampleQueues.size(); i++)
            {
                l = Math.max(l, ((InternalTrackOutput)sampleQueues.valueAt(i)).getLargestParsedTimestampUs());
            }

            l1 = l;
            if (l == 0x8000000000000000L)
            {
                return downstreamPositionUs;
            }
        }
        return l1;
    }

    public MediaFormat getFormat(int i)
    {
        Assertions.checkState(prepared);
        return mediaFormats[i];
    }

    public int getTrackCount()
    {
        return sampleQueues.size();
    }

    public void maybeThrowError()
        throws IOException
    {
        if (currentLoadableException != null)
        {
            if (isCurrentLoadableExceptionFatal())
            {
                throw currentLoadableException;
            }
            int i;
            if (minLoadableRetryCount != -1)
            {
                i = minLoadableRetryCount;
            } else
            if (seekMap != null && !seekMap.isSeekable())
            {
                i = 6;
            } else
            {
                i = 3;
            }
            if (currentLoadableExceptionCount > i)
            {
                throw currentLoadableException;
            }
        }
    }

    public void onLoadCanceled(com.google.android.exoplayer.upstream.Loader.Loadable loadable1)
    {
        if (enabledTrackCount > 0)
        {
            restartFrom(pendingResetPositionUs);
            return;
        } else
        {
            clearState();
            allocator.trim(0);
            return;
        }
    }

    public void onLoadCompleted(com.google.android.exoplayer.upstream.Loader.Loadable loadable1)
    {
        loadingFinished = true;
    }

    public void onLoadError(com.google.android.exoplayer.upstream.Loader.Loadable loadable1, IOException ioexception)
    {
        currentLoadableException = ioexception;
        int i;
        if (extractedSampleCount > extractedSampleCountAtStartOfLoad)
        {
            i = 1;
        } else
        {
            i = currentLoadableExceptionCount + 1;
        }
        currentLoadableExceptionCount = i;
        currentLoadableExceptionTimestamp = SystemClock.elapsedRealtime();
        maybeStartLoading();
    }

    public boolean prepare(long l)
    {
        if (prepared)
        {
            return true;
        }
        if (loader == null)
        {
            loader = new Loader("Loader:ExtractorSampleSource");
        }
        maybeStartLoading();
        if (seekMap != null && tracksBuilt && haveFormatsForAllTracks())
        {
            int j = sampleQueues.size();
            trackEnabledStates = new boolean[j];
            pendingDiscontinuities = new boolean[j];
            pendingMediaFormat = new boolean[j];
            mediaFormats = new MediaFormat[j];
            maxTrackDurationUs = -1L;
            for (int i = 0; i < j; i++)
            {
                MediaFormat mediaformat = ((InternalTrackOutput)sampleQueues.valueAt(i)).getFormat();
                mediaFormats[i] = mediaformat;
                if (mediaformat.durationUs != -1L && mediaformat.durationUs > maxTrackDurationUs)
                {
                    maxTrackDurationUs = mediaformat.durationUs;
                }
            }

            prepared = true;
            return true;
        } else
        {
            return false;
        }
    }

    public int readData(int i, long l, MediaFormatHolder mediaformatholder, SampleHolder sampleholder, boolean flag)
    {
        downstreamPositionUs = l;
        if (pendingDiscontinuities[i])
        {
            pendingDiscontinuities[i] = false;
            return -5;
        }
        if (flag || isPendingReset())
        {
            return -2;
        }
        InternalTrackOutput internaltrackoutput = (InternalTrackOutput)sampleQueues.valueAt(i);
        if (pendingMediaFormat[i])
        {
            mediaformatholder.format = internaltrackoutput.getFormat();
            mediaformatholder.drmInitData = drmInitData;
            pendingMediaFormat[i] = false;
            return -4;
        }
        if (internaltrackoutput.getSample(sampleholder))
        {
            int j;
            if (sampleholder.timeUs < lastSeekPositionUs)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            j = sampleholder.flags;
            if (i != 0)
            {
                i = 0x8000000;
            } else
            {
                i = 0;
            }
            sampleholder.flags = i | j;
            if (havePendingNextSampleUs)
            {
                sampleTimeOffsetUs = pendingNextSampleUs - sampleholder.timeUs;
                havePendingNextSampleUs = false;
            }
            sampleholder.timeUs = sampleholder.timeUs + sampleTimeOffsetUs;
            return -3;
        }
        return !loadingFinished ? -2 : -1;
    }

    public com.google.android.exoplayer.SampleSource.SampleSourceReader register()
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
        if (i == 0 && loader != null)
        {
            loader.release();
            loader = null;
        }
    }

    public void seekMap(SeekMap seekmap)
    {
        seekMap = seekmap;
    }

    public void seekToUs(long l)
    {
        Assertions.checkState(prepared);
        long l1;
        boolean flag2;
        if (enabledTrackCount > 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        Assertions.checkState(flag2);
        if (!seekMap.isSeekable())
        {
            l = 0L;
        }
        if (isPendingReset())
        {
            l1 = pendingResetPositionUs;
        } else
        {
            l1 = downstreamPositionUs;
        }
        downstreamPositionUs = l;
        lastSeekPositionUs = l;
        if (l1 != l)
        {
            int i;
            boolean flag;
            boolean flag1;
            if (!isPendingReset())
            {
                i = 1;
            } else
            {
                i = 0;
            }
            flag1 = false;
            flag = i;
            for (i = ((flag1) ? 1 : 0); flag && i < sampleQueues.size(); i++)
            {
                flag &= ((InternalTrackOutput)sampleQueues.valueAt(i)).skipToKeyframeBefore(l);
            }

            if (!flag)
            {
                restartFrom(l);
            }
            i = 0;
            while (i < pendingDiscontinuities.length) 
            {
                pendingDiscontinuities[i] = true;
                i++;
            }
        }
    }

    public TrackOutput track(int i)
    {
        InternalTrackOutput internaltrackoutput1 = (InternalTrackOutput)sampleQueues.get(i);
        InternalTrackOutput internaltrackoutput = internaltrackoutput1;
        if (internaltrackoutput1 == null)
        {
            internaltrackoutput = new InternalTrackOutput(allocator);
            sampleQueues.put(i, internaltrackoutput);
        }
        return internaltrackoutput;
    }

    static 
    {
        DEFAULT_EXTRACTOR_CLASSES = new ArrayList();
        try
        {
            DEFAULT_EXTRACTOR_CLASSES.add(Class.forName("com.google.android.exoplayer.extractor.webm.WebmExtractor").asSubclass(com/google/android/exoplayer/extractor/Extractor));
        }
        catch (ClassNotFoundException classnotfoundexception5) { }
        try
        {
            DEFAULT_EXTRACTOR_CLASSES.add(Class.forName("com.google.android.exoplayer.extractor.mp4.FragmentedMp4Extractor").asSubclass(com/google/android/exoplayer/extractor/Extractor));
        }
        catch (ClassNotFoundException classnotfoundexception4) { }
        try
        {
            DEFAULT_EXTRACTOR_CLASSES.add(Class.forName("com.google.android.exoplayer.extractor.mp4.Mp4Extractor").asSubclass(com/google/android/exoplayer/extractor/Extractor));
        }
        catch (ClassNotFoundException classnotfoundexception3) { }
        try
        {
            DEFAULT_EXTRACTOR_CLASSES.add(Class.forName("com.google.android.exoplayer.extractor.mp3.Mp3Extractor").asSubclass(com/google/android/exoplayer/extractor/Extractor));
        }
        catch (ClassNotFoundException classnotfoundexception2) { }
        try
        {
            DEFAULT_EXTRACTOR_CLASSES.add(Class.forName("com.google.android.exoplayer.extractor.ts.AdtsExtractor").asSubclass(com/google/android/exoplayer/extractor/Extractor));
        }
        catch (ClassNotFoundException classnotfoundexception1) { }
        try
        {
            DEFAULT_EXTRACTOR_CLASSES.add(Class.forName("com.google.android.exoplayer.extractor.ts.TsExtractor").asSubclass(com/google/android/exoplayer/extractor/Extractor));
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            return;
        }
    }


/*
    static int access$008(ExtractorSampleSource extractorsamplesource)
    {
        int i = extractorsamplesource.extractedSampleCount;
        extractorsamplesource.extractedSampleCount = i + 1;
        return i;
    }

*/
}
