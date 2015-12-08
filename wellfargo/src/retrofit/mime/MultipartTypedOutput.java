// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit.mime;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

// Referenced classes of package retrofit.mime:
//            TypedOutput

public final class MultipartTypedOutput
    implements TypedOutput
{

    private final String boundary;
    private final byte footer[];
    private long length;
    private final List mimeParts;

    public MultipartTypedOutput()
    {
        this(UUID.randomUUID().toString());
    }

    MultipartTypedOutput(String s)
    {
        mimeParts = new LinkedList();
        boundary = s;
        footer = buildBoundary(s, false, true);
        length = footer.length;
    }

    private static byte[] buildBoundary(String s, boolean flag, boolean flag1)
    {
        StringBuilder stringbuilder;
        try
        {
            stringbuilder = new StringBuilder();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException("Unable to write multipart boundary", s);
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        stringbuilder.append("\r\n");
        stringbuilder.append("--");
        stringbuilder.append(s);
        if (!flag1) goto _L2; else goto _L1
_L1:
        stringbuilder.append("--");
_L4:
        return stringbuilder.toString().getBytes("UTF-8");
_L2:
        stringbuilder.append("\r\n");
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static byte[] buildHeader(String s, TypedOutput typedoutput)
    {
        try
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("Content-Disposition: form-data; name=\"");
            stringbuilder.append(s);
            if (typedoutput.fileName() != null)
            {
                stringbuilder.append("\"; filename=\"");
                stringbuilder.append(typedoutput.fileName());
            }
            stringbuilder.append("\"\r\nContent-Type: ");
            stringbuilder.append(typedoutput.mimeType());
            if (typedoutput.length() != -1L)
            {
                stringbuilder.append("\r\nContent-Length: ").append(typedoutput.length());
            }
            stringbuilder.append("\r\nContent-Transfer-Encoding: binary\r\n\r\n");
            s = stringbuilder.toString().getBytes("UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException("Unable to write multipart header", s);
        }
        return s;
    }

    public void addPart(String s, TypedOutput typedoutput)
    {
        if (s == null)
        {
            throw new NullPointerException("Part name must not be null.");
        }
        if (typedoutput == null)
        {
            throw new NullPointerException("Part body must not be null.");
        }
        s = new MimePart(s, typedoutput, boundary, mimeParts.isEmpty());
        mimeParts.add(s);
        long l = s.size();
        if (l == -1L)
        {
            length = -1L;
        } else
        if (length != -1L)
        {
            length = l + length;
            return;
        }
    }

    public String fileName()
    {
        return null;
    }

    public int getPartCount()
    {
        return mimeParts.size();
    }

    List getParts()
    {
        ArrayList arraylist = new ArrayList(mimeParts.size());
        ByteArrayOutputStream bytearrayoutputstream;
        for (Iterator iterator = mimeParts.iterator(); iterator.hasNext(); arraylist.add(bytearrayoutputstream.toByteArray()))
        {
            MimePart mimepart = (MimePart)iterator.next();
            bytearrayoutputstream = new ByteArrayOutputStream();
            mimepart.writeTo(bytearrayoutputstream);
        }

        return arraylist;
    }

    public long length()
    {
        return length;
    }

    public String mimeType()
    {
        return (new StringBuilder()).append("multipart/form-data; boundary=").append(boundary).toString();
    }

    public void writeTo(OutputStream outputstream)
    {
        for (Iterator iterator = mimeParts.iterator(); iterator.hasNext(); ((MimePart)iterator.next()).writeTo(outputstream)) { }
        outputstream.write(footer);
    }



    private class MimePart
    {

        private final TypedOutput body;
        private final String boundary;
        private boolean isBuilt;
        private final boolean isFirst;
        private final String name;
        private byte partBoundary[];
        private byte partHeader[];

        private void build()
        {
            if (isBuilt)
            {
                return;
            } else
            {
                partBoundary = MultipartTypedOutput.buildBoundary(boundary, isFirst, false);
                partHeader = MultipartTypedOutput.buildHeader(name, body);
                isBuilt = true;
                return;
            }
        }

        public long size()
        {
            long l = -1L;
            build();
            if (body.length() > -1L)
            {
                l = body.length() + (long)partBoundary.length + (long)partHeader.length;
            }
            return l;
        }

        public void writeTo(OutputStream outputstream)
        {
            build();
            outputstream.write(partBoundary);
            outputstream.write(partHeader);
            body.writeTo(outputstream);
        }

        public MimePart(String s, TypedOutput typedoutput, String s1, boolean flag)
        {
            name = s;
            body = typedoutput;
            isFirst = flag;
            boundary = s1;
        }
    }

}
