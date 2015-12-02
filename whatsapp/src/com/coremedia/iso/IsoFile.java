// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso;

import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.MovieBox;
import com.googlecode.mp4parser.BasicContainer;
import com.googlecode.mp4parser.util.Logger;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.coremedia.iso:
//            PropertyBoxParserImpl, BoxParser

public class IsoFile extends BasicContainer
    implements Closeable
{

    private static Logger LOG = Logger.getLogger(com/coremedia/iso/IsoFile);

    public IsoFile(String s)
        throws IOException
    {
        this((new FileInputStream(s)).getChannel());
    }

    public IsoFile(FileChannel filechannel)
        throws IOException
    {
        parseContainer(filechannel, filechannel.size(), new PropertyBoxParserImpl(new String[0]));
    }

    public IsoFile(FileChannel filechannel, BoxParser boxparser)
        throws IOException
    {
        fileChannel = filechannel;
        boxParser = boxparser;
    }

    public static String bytesToFourCC(byte abyte0[])
    {
        byte abyte1[] = new byte[4];
        if (abyte0 != null)
        {
            System.arraycopy(abyte0, 0, abyte1, 0, Math.min(abyte0.length, 4));
        }
        try
        {
            abyte0 = new String(abyte1, "ISO-8859-1");
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new Error("Required character encoding is missing", abyte0);
        }
        return abyte0;
    }

    public static byte[] fourCCtoBytes(String s)
    {
        byte abyte0[] = new byte[4];
        if (s == null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L5:
        if (i < Math.min(4, s.length())) goto _L3; else goto _L2
_L2:
        return abyte0;
_L3:
        abyte0[i] = (byte)s.charAt(i);
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void close()
        throws IOException
    {
        fileChannel.close();
    }

    public void getBox(WritableByteChannel writablebytechannel)
        throws IOException
    {
        writeContainer(writablebytechannel);
    }

    public MovieBox getMovieBox()
    {
        Iterator iterator = getBoxes().iterator();
        Box box;
        do
        {
            if (!iterator.hasNext())
            {
                return null;
            }
            box = (Box)iterator.next();
        } while (!(box instanceof MovieBox));
        return (MovieBox)box;
    }

    public long getSize()
    {
        return getContainerSize();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("IsoFile[").append(fileChannel.toString()).append("]");
        return stringbuilder.toString();
    }

}
