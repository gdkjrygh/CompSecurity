// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso;

import com.coremedia.iso.boxes.Box;
import com.googlecode.mp4parser.util.Path;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.coremedia.iso:
//            PropertyBoxParserImpl, IsoFile

public class BoxReplacer
{

    static final boolean $assertionsDisabled;

    public BoxReplacer()
    {
    }

    public static void replace(Map map, File file)
        throws IOException
    {
        Object obj = new PropertyBoxParserImpl(new String[0]);
        IsoFile isofile = new IsoFile((new RandomAccessFile(file, "r")).getChannel(), ((BoxParser) (obj)));
        obj = new HashMap();
        map = map.entrySet().iterator();
        do
        {
            if (!map.hasNext())
            {
                isofile.close();
                map = (new RandomAccessFile(file, "rw")).getChannel();
                file = ((Map) (obj)).entrySet().iterator();
                java.util.Map.Entry entry;
                Box box;
                if (file.hasNext())
                {
                    map = (String)((java.util.Map.Entry)file.next()).getKey();
                    throw new RuntimeException("ddd");
                } else
                {
                    map.close();
                    return;
                }
            }
            entry = (java.util.Map.Entry)map.next();
            box = Path.getPath(isofile, (String)entry.getKey());
            ((Map) (obj)).put(Path.createPath(box), (Box)entry.getValue());
        } while ($assertionsDisabled || box.getSize() == ((Box)entry.getValue()).getSize());
        throw new AssertionError();
    }

    static 
    {
        boolean flag;
        if (!com/coremedia/iso/BoxReplacer.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
