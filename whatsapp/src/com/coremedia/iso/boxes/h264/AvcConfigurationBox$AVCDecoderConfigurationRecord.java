// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.h264;

import com.coremedia.iso.Hex;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBuffer;
import com.googlecode.mp4parser.h264.model.PictureParameterSet;
import com.googlecode.mp4parser.h264.model.SeqParameterSet;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.coremedia.iso.boxes.h264:
//            AvcConfigurationBox

public static class bitDepthChromaMinus8
{

    public int avcLevelIndication;
    public int avcProfileIndication;
    public int bitDepthChromaMinus8;
    public int bitDepthChromaMinus8PaddingBits;
    public int bitDepthLumaMinus8;
    public int bitDepthLumaMinus8PaddingBits;
    public int chromaFormat;
    public int chromaFormatPaddingBits;
    public int configurationVersion;
    public boolean hasExts;
    public int lengthSizeMinusOne;
    public int lengthSizeMinusOnePaddingBits;
    public int numberOfSequenceParameterSetsPaddingBits;
    public List pictureParameterSets;
    public int profileCompatibility;
    public List sequenceParameterSetExts;
    public List sequenceParameterSets;

    public void getContent(ByteBuffer bytebuffer)
    {
        Object obj;
        IsoTypeWriter.writeUInt8(bytebuffer, configurationVersion);
        IsoTypeWriter.writeUInt8(bytebuffer, avcProfileIndication);
        IsoTypeWriter.writeUInt8(bytebuffer, profileCompatibility);
        IsoTypeWriter.writeUInt8(bytebuffer, avcLevelIndication);
        obj = new BitWriterBuffer(bytebuffer);
        ((BitWriterBuffer) (obj)).writeBits(lengthSizeMinusOnePaddingBits, 6);
        ((BitWriterBuffer) (obj)).writeBits(lengthSizeMinusOne, 2);
        ((BitWriterBuffer) (obj)).writeBits(numberOfSequenceParameterSetsPaddingBits, 3);
        ((BitWriterBuffer) (obj)).writeBits(pictureParameterSets.size(), 5);
        obj = sequenceParameterSets.iterator();
_L7:
        if (((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
        IsoTypeWriter.writeUInt8(bytebuffer, pictureParameterSets.size());
        obj = pictureParameterSets.iterator();
_L8:
        if (((Iterator) (obj)).hasNext()) goto _L4; else goto _L3
_L3:
        if (!hasExts || avcProfileIndication != 100 && avcProfileIndication != 110 && avcProfileIndication != 122 && avcProfileIndication != 144) goto _L6; else goto _L5
_L5:
        obj = new BitWriterBuffer(bytebuffer);
        ((BitWriterBuffer) (obj)).writeBits(chromaFormatPaddingBits, 6);
        ((BitWriterBuffer) (obj)).writeBits(chromaFormat, 2);
        ((BitWriterBuffer) (obj)).writeBits(bitDepthLumaMinus8PaddingBits, 5);
        ((BitWriterBuffer) (obj)).writeBits(bitDepthLumaMinus8, 3);
        ((BitWriterBuffer) (obj)).writeBits(bitDepthChromaMinus8PaddingBits, 5);
        ((BitWriterBuffer) (obj)).writeBits(bitDepthChromaMinus8, 3);
        obj = sequenceParameterSetExts.iterator();
_L9:
        if (((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_312;
        }
_L6:
        return;
_L2:
        byte abyte0[] = (byte[])((Iterator) (obj)).next();
        IsoTypeWriter.writeUInt16(bytebuffer, abyte0.length);
        bytebuffer.put(abyte0);
          goto _L7
_L4:
        byte abyte1[] = (byte[])((Iterator) (obj)).next();
        IsoTypeWriter.writeUInt16(bytebuffer, abyte1.length);
        bytebuffer.put(abyte1);
          goto _L8
        byte abyte2[] = (byte[])((Iterator) (obj)).next();
        IsoTypeWriter.writeUInt16(bytebuffer, abyte2.length);
        bytebuffer.put(abyte2);
          goto _L9
    }

    public long getContentSize()
    {
        Iterator iterator;
        long l;
        l = 5L + 1L;
        iterator = sequenceParameterSets.iterator();
_L9:
        if (iterator.hasNext()) goto _L2; else goto _L1
_L1:
        l++;
        iterator = pictureParameterSets.iterator();
_L10:
        if (iterator.hasNext()) goto _L4; else goto _L3
_L3:
        long l1 = l;
        if (!hasExts) goto _L6; else goto _L5
_L5:
        if (avcProfileIndication == 100 || avcProfileIndication == 110 || avcProfileIndication == 122) goto _L8; else goto _L7
_L7:
        l1 = l;
        if (avcProfileIndication != 144) goto _L6; else goto _L8
_L8:
        l += 4L;
_L11:
        for (iterator = sequenceParameterSetExts.iterator(); iterator.hasNext();)
        {
            break MISSING_BLOCK_LABEL_171;
        }

        l1 = l;
_L6:
        return l1;
_L2:
        l = l + 2L + (long)((byte[])iterator.next()).length;
          goto _L9
_L4:
        l = l + 2L + (long)((byte[])iterator.next()).length;
          goto _L10
        l = l + 2L + (long)((byte[])iterator.next()).length;
          goto _L11
    }

    public String[] getPPS()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = pictureParameterSets.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return (String[])arraylist.toArray(new String[arraylist.size()]);
            }
            byte abyte0[] = (byte[])iterator.next();
            String s;
            try
            {
                s = PictureParameterSet.read(new ByteArrayInputStream(abyte0, 1, abyte0.length - 1)).toString();
            }
            catch (IOException ioexception)
            {
                throw new RuntimeException(ioexception);
            }
            arraylist.add(s);
        } while (true);
    }

    public List getPictureParameterSetsAsStrings()
    {
        ArrayList arraylist = new ArrayList(pictureParameterSets.size());
        Iterator iterator = pictureParameterSets.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return arraylist;
            }
            arraylist.add(Hex.encodeHex((byte[])iterator.next()));
        } while (true);
    }

    public String[] getSPS()
    {
        ArrayList arraylist;
        Iterator iterator;
        arraylist = new ArrayList();
        iterator = sequenceParameterSets.iterator();
_L2:
        String s;
        byte abyte0[];
        if (!iterator.hasNext())
        {
            return (String[])arraylist.toArray(new String[arraylist.size()]);
        }
        abyte0 = (byte[])iterator.next();
        s = "not parsable";
        String s1 = SeqParameterSet.read(new ByteArrayInputStream(abyte0, 1, abyte0.length - 1)).toString();
        s = s1;
_L3:
        arraylist.add(s);
        if (true) goto _L2; else goto _L1
_L1:
        IOException ioexception;
        ioexception;
          goto _L3
    }

    public List getSequenceParameterSetExtsAsStrings()
    {
        ArrayList arraylist = new ArrayList(sequenceParameterSetExts.size());
        Iterator iterator = sequenceParameterSetExts.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return arraylist;
            }
            arraylist.add(Hex.encodeHex((byte[])iterator.next()));
        } while (true);
    }

    public List getSequenceParameterSetsAsStrings()
    {
        ArrayList arraylist = new ArrayList(sequenceParameterSets.size());
        Iterator iterator = sequenceParameterSets.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return arraylist;
            }
            arraylist.add(Hex.encodeHex((byte[])iterator.next()));
        } while (true);
    }

    public ()
    {
        sequenceParameterSets = new ArrayList();
        pictureParameterSets = new ArrayList();
        hasExts = true;
        chromaFormat = 1;
        bitDepthLumaMinus8 = 0;
        bitDepthChromaMinus8 = 0;
        sequenceParameterSetExts = new ArrayList();
        lengthSizeMinusOnePaddingBits = 63;
        numberOfSequenceParameterSetsPaddingBits = 7;
        chromaFormatPaddingBits = 31;
        bitDepthLumaMinus8PaddingBits = 31;
        bitDepthChromaMinus8PaddingBits = 31;
    }

    public bitDepthChromaMinus8PaddingBits(ByteBuffer bytebuffer)
    {
        int i;
        int j;
        sequenceParameterSets = new ArrayList();
        pictureParameterSets = new ArrayList();
        hasExts = true;
        chromaFormat = 1;
        bitDepthLumaMinus8 = 0;
        bitDepthChromaMinus8 = 0;
        sequenceParameterSetExts = new ArrayList();
        lengthSizeMinusOnePaddingBits = 63;
        numberOfSequenceParameterSetsPaddingBits = 7;
        chromaFormatPaddingBits = 31;
        bitDepthLumaMinus8PaddingBits = 31;
        bitDepthChromaMinus8PaddingBits = 31;
        configurationVersion = IsoTypeReader.readUInt8(bytebuffer);
        avcProfileIndication = IsoTypeReader.readUInt8(bytebuffer);
        profileCompatibility = IsoTypeReader.readUInt8(bytebuffer);
        avcLevelIndication = IsoTypeReader.readUInt8(bytebuffer);
        BitReaderBuffer bitreaderbuffer = new BitReaderBuffer(bytebuffer);
        lengthSizeMinusOnePaddingBits = bitreaderbuffer.readBits(6);
        lengthSizeMinusOne = bitreaderbuffer.readBits(2);
        numberOfSequenceParameterSetsPaddingBits = bitreaderbuffer.readBits(3);
        j = bitreaderbuffer.readBits(5);
        i = 0;
_L8:
        if (i < j) goto _L2; else goto _L1
_L1:
        long l;
        l = IsoTypeReader.readUInt8(bytebuffer);
        i = 0;
_L5:
        if ((long)i < l) goto _L4; else goto _L3
_L3:
        if (bytebuffer.remaining() < 4)
        {
            hasExts = false;
        }
        if (!hasExts || avcProfileIndication != 100 && avcProfileIndication != 110 && avcProfileIndication != 122 && avcProfileIndication != 144)
        {
            break MISSING_BLOCK_LABEL_420;
        }
        BitReaderBuffer bitreaderbuffer1 = new BitReaderBuffer(bytebuffer);
        chromaFormatPaddingBits = bitreaderbuffer1.readBits(6);
        chromaFormat = bitreaderbuffer1.readBits(2);
        bitDepthLumaMinus8PaddingBits = bitreaderbuffer1.readBits(5);
        bitDepthLumaMinus8 = bitreaderbuffer1.readBits(3);
        bitDepthChromaMinus8PaddingBits = bitreaderbuffer1.readBits(5);
        bitDepthChromaMinus8 = bitreaderbuffer1.readBits(3);
        l = IsoTypeReader.readUInt8(bytebuffer);
        i = 0;
_L6:
        if ((long)i >= l)
        {
            return;
        }
        break MISSING_BLOCK_LABEL_389;
_L2:
        byte abyte0[] = new byte[IsoTypeReader.readUInt16(bytebuffer)];
        bytebuffer.get(abyte0);
        sequenceParameterSets.add(abyte0);
        i++;
        continue; /* Loop/switch isn't completed */
_L4:
        byte abyte1[] = new byte[IsoTypeReader.readUInt16(bytebuffer)];
        bytebuffer.get(abyte1);
        pictureParameterSets.add(abyte1);
        i++;
          goto _L5
        byte abyte2[] = new byte[IsoTypeReader.readUInt16(bytebuffer)];
        bytebuffer.get(abyte2);
        sequenceParameterSetExts.add(abyte2);
        i++;
          goto _L6
        chromaFormat = -1;
        bitDepthLumaMinus8 = -1;
        bitDepthChromaMinus8 = -1;
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }
}
