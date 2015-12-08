// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.adobe.mobile:
//            MobileConfig, RemoteDownload, Message

class this._cls0
    implements Runnable
{

    final MobileConfig this$0;

    public void run()
    {
        if (MobileConfig.access$200(MobileConfig.this) == null || MobileConfig.access$200(MobileConfig.this).size() <= 0)
        {
            RemoteDownload.deleteFilesInDirectory("messageImages");
            return;
        }
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = MobileConfig.access$200(MobileConfig.this).iterator(); iterator.hasNext();)
        {
            Object obj = (Message)iterator.next();
            if (((Message) (obj)).assets != null && ((Message) (obj)).assets.size() > 0)
            {
                obj = ((Message) (obj)).assets.iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    Object obj1 = (ArrayList)((Iterator) (obj)).next();
                    if (((ArrayList) (obj1)).size() > 0)
                    {
                        obj1 = ((ArrayList) (obj1)).iterator();
                        while (((Iterator) (obj1)).hasNext()) 
                        {
                            String s = (String)((Iterator) (obj1)).next();
                            arraylist.add(s);
                            RemoteDownload.remoteDownloadSync(s, 10000, 10000, null, "messageImages");
                        }
                    }
                }
            }
        }

        if (arraylist.size() > 0)
        {
            RemoteDownload.deleteFilesForDirectoryNotInList("messageImages", arraylist);
            return;
        } else
        {
            RemoteDownload.deleteFilesInDirectory("messageImages");
            return;
        }
    }

    ()
    {
        this$0 = MobileConfig.this;
        super();
    }
}
