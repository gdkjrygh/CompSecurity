// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;

import com.google.android.exoplayer.util.Assertions;
import com.google.android.exoplayer.util.Util;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class MediaFormat
{

    public static final int NO_VALUE = -1;
    public static final long OFFSET_SAMPLE_RELATIVE = 0x7fffffffffffffffL;
    public final boolean adaptive;
    public final int bitrate;
    public final int channelCount;
    public final long durationUs;
    private android.media.MediaFormat frameworkMediaFormat;
    private int hashCode;
    public final int height;
    public final List initializationData;
    public final String language;
    public final int maxHeight;
    public final int maxInputSize;
    public final int maxWidth;
    public final String mimeType;
    public final float pixelWidthHeightRatio;
    public final int rotationDegrees;
    public final int sampleRate;
    public final long subsampleOffsetUs;
    public final int trackId;
    public final int width;

    MediaFormat(int i, String s, int j, int k, long l, int i1, 
            int j1, int k1, float f, int l1, int i2, String s1, long l2, List list, boolean flag, int j2, int k2)
    {
        trackId = i;
        mimeType = Assertions.checkNotEmpty(s);
        bitrate = j;
        maxInputSize = k;
        durationUs = l;
        width = i1;
        height = j1;
        rotationDegrees = k1;
        pixelWidthHeightRatio = f;
        channelCount = l1;
        sampleRate = i2;
        language = s1;
        subsampleOffsetUs = l2;
        s = list;
        if (list == null)
        {
            s = Collections.emptyList();
        }
        initializationData = s;
        adaptive = flag;
        maxWidth = j2;
        maxHeight = k2;
    }

    public static MediaFormat createAudioFormat(int i, String s, int j, int k, long l, int i1, int j1, 
            List list, String s1)
    {
        return new MediaFormat(i, s, j, k, l, -1, -1, -1, -1F, i1, j1, s1, 0x7fffffffffffffffL, list, false, -1, -1);
    }

    public static MediaFormat createFormatForMimeType(int i, String s, int j, long l)
    {
        return new MediaFormat(i, s, j, -1, l, -1, -1, -1, -1F, -1, -1, null, 0x7fffffffffffffffL, null, false, -1, -1);
    }

    public static MediaFormat createTextFormat(int i, String s, int j, long l, String s1)
    {
        return createTextFormat(i, s, j, l, s1, 0x7fffffffffffffffL);
    }

    public static MediaFormat createTextFormat(int i, String s, int j, long l, String s1, long l1)
    {
        return new MediaFormat(i, s, j, -1, l, -1, -1, -1, -1F, -1, -1, s1, l1, null, false, -1, -1);
    }

    public static MediaFormat createVideoFormat(int i, String s, int j, int k, long l, int i1, int j1, 
            List list)
    {
        return createVideoFormat(i, s, j, k, l, i1, j1, list, -1, -1F);
    }

    public static MediaFormat createVideoFormat(int i, String s, int j, int k, long l, int i1, int j1, 
            List list, int k1, float f)
    {
        return new MediaFormat(i, s, j, k, l, i1, j1, k1, f, -1, -1, null, 0x7fffffffffffffffL, list, false, -1, -1);
    }

    private static final void maybeSetIntegerV16(android.media.MediaFormat mediaformat, String s, int i)
    {
        if (i != -1)
        {
            mediaformat.setInteger(s, i);
        }
    }

    private static final void maybeSetStringV16(android.media.MediaFormat mediaformat, String s, String s1)
    {
        if (s1 != null)
        {
            mediaformat.setString(s, s1);
        }
    }

    public MediaFormat copyAsAdaptive()
    {
        return new MediaFormat(trackId, mimeType, -1, -1, durationUs, -1, -1, -1, -1F, -1, -1, null, 0x7fffffffffffffffL, null, true, maxWidth, maxHeight);
    }

    public MediaFormat copyWithDurationUs(long l)
    {
        return new MediaFormat(trackId, mimeType, bitrate, maxInputSize, l, width, height, rotationDegrees, pixelWidthHeightRatio, channelCount, sampleRate, language, subsampleOffsetUs, initializationData, adaptive, maxWidth, maxHeight);
    }

    public MediaFormat copyWithMaxInputSize(int i)
    {
        return new MediaFormat(trackId, mimeType, bitrate, i, durationUs, width, height, rotationDegrees, pixelWidthHeightRatio, channelCount, sampleRate, language, subsampleOffsetUs, initializationData, adaptive, maxWidth, maxHeight);
    }

    public MediaFormat copyWithMaxVideoDimensions(int i, int j)
    {
        return new MediaFormat(trackId, mimeType, bitrate, maxInputSize, durationUs, width, height, rotationDegrees, pixelWidthHeightRatio, channelCount, sampleRate, language, subsampleOffsetUs, initializationData, adaptive, i, j);
    }

    public MediaFormat copyWithSubsampleOffsetUs(long l)
    {
        return new MediaFormat(trackId, mimeType, bitrate, maxInputSize, durationUs, width, height, rotationDegrees, pixelWidthHeightRatio, channelCount, sampleRate, language, l, initializationData, adaptive, maxWidth, maxHeight);
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }
        obj = (MediaFormat)obj;
        if (adaptive != ((MediaFormat) (obj)).adaptive || bitrate != ((MediaFormat) (obj)).bitrate || maxInputSize != ((MediaFormat) (obj)).maxInputSize || width != ((MediaFormat) (obj)).width || height != ((MediaFormat) (obj)).height || rotationDegrees != ((MediaFormat) (obj)).rotationDegrees || pixelWidthHeightRatio != ((MediaFormat) (obj)).pixelWidthHeightRatio || maxWidth != ((MediaFormat) (obj)).maxWidth || maxHeight != ((MediaFormat) (obj)).maxHeight || channelCount != ((MediaFormat) (obj)).channelCount || sampleRate != ((MediaFormat) (obj)).sampleRate || trackId != ((MediaFormat) (obj)).trackId || !Util.areEqual(language, ((MediaFormat) (obj)).language) || !Util.areEqual(mimeType, ((MediaFormat) (obj)).mimeType) || initializationData.size() != ((MediaFormat) (obj)).initializationData.size())
        {
            return false;
        }
        for (int i = 0; i < initializationData.size(); i++)
        {
            if (!Arrays.equals((byte[])initializationData.get(i), (byte[])((MediaFormat) (obj)).initializationData.get(i)))
            {
                return false;
            }
        }

        return true;
    }

    public final android.media.MediaFormat getFrameworkMediaFormatV16()
    {
        if (frameworkMediaFormat == null)
        {
            android.media.MediaFormat mediaformat = new android.media.MediaFormat();
            mediaformat.setString("mime", mimeType);
            maybeSetStringV16(mediaformat, "language", language);
            maybeSetIntegerV16(mediaformat, "max-input-size", maxInputSize);
            maybeSetIntegerV16(mediaformat, "width", width);
            maybeSetIntegerV16(mediaformat, "height", height);
            maybeSetIntegerV16(mediaformat, "rotation-degrees", rotationDegrees);
            maybeSetIntegerV16(mediaformat, "max-width", maxWidth);
            maybeSetIntegerV16(mediaformat, "max-height", maxHeight);
            maybeSetIntegerV16(mediaformat, "channel-count", channelCount);
            maybeSetIntegerV16(mediaformat, "sample-rate", sampleRate);
            for (int i = 0; i < initializationData.size(); i++)
            {
                mediaformat.setByteBuffer((new StringBuilder()).append("csd-").append(i).toString(), ByteBuffer.wrap((byte[])initializationData.get(i)));
            }

            if (durationUs != -1L)
            {
                mediaformat.setLong("durationUs", durationUs);
            }
            frameworkMediaFormat = mediaformat;
        }
        return frameworkMediaFormat;
    }

    public int hashCode()
    {
        int k = 0;
        if (hashCode == 0)
        {
            int l = trackId;
            int i;
            int j;
            int i1;
            int j1;
            int k1;
            int l1;
            int i2;
            int j2;
            int k2;
            int l2;
            int i3;
            int j3;
            int k3;
            if (mimeType == null)
            {
                i = 0;
            } else
            {
                i = mimeType.hashCode();
            }
            i1 = bitrate;
            j1 = maxInputSize;
            k1 = width;
            l1 = height;
            i2 = rotationDegrees;
            j2 = Float.floatToRawIntBits(pixelWidthHeightRatio);
            k2 = (int)durationUs;
            if (adaptive)
            {
                j = 1231;
            } else
            {
                j = 1237;
            }
            l2 = maxWidth;
            i3 = maxHeight;
            j3 = channelCount;
            k3 = sampleRate;
            if (language != null)
            {
                k = language.hashCode();
            }
            j = ((((((((((((((l + 527) * 31 + i) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + k2) * 31 + j) * 31 + l2) * 31 + i3) * 31 + j3) * 31 + k3) * 31 + k;
            for (i = 0; i < initializationData.size(); i++)
            {
                j = j * 31 + Arrays.hashCode((byte[])initializationData.get(i));
            }

            hashCode = j;
        }
        return hashCode;
    }

    final void setFrameworkFormatV16(android.media.MediaFormat mediaformat)
    {
        frameworkMediaFormat = mediaformat;
    }

    public String toString()
    {
        return (new StringBuilder()).append("MediaFormat(").append(trackId).append(", ").append(mimeType).append(", ").append(bitrate).append(", ").append(maxInputSize).append(", ").append(width).append(", ").append(height).append(", ").append(rotationDegrees).append(", ").append(pixelWidthHeightRatio).append(", ").append(channelCount).append(", ").append(sampleRate).append(", ").append(language).append(", ").append(durationUs).append(", ").append(adaptive).append(", ").append(maxWidth).append(", ").append(maxHeight).append(")").toString();
    }
}
