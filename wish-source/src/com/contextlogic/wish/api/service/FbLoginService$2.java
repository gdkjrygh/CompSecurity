// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.WishApplication;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            FbLoginService

class val.storedObject
    implements Runnable
{

    final FbLoginService this$0;
    final JSONObject val$storedObject;

    public void run()
    {
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        obj2 = null;
        obj1 = null;
        obj3 = null;
        obj4 = null;
        Object obj = WishApplication.getAppInstance().openFileOutput("serialized_session", 0);
        obj1 = obj;
        obj2 = obj;
        ObjectOutputStream objectoutputstream = new ObjectOutputStream(((java.io.OutputStream) (obj)));
        objectoutputstream.writeObject(val$storedObject.toString());
        if (objectoutputstream != null)
        {
            try
            {
                objectoutputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        ((FileOutputStream) (obj)).close();
_L2:
        return;
        obj;
        return;
        obj;
        obj2 = obj4;
        obj = obj1;
_L5:
        if (obj2 != null)
        {
            try
            {
                ((ObjectOutputStream) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        if (obj == null) goto _L2; else goto _L1
_L1:
        try
        {
            ((FileOutputStream) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
        obj;
        obj1 = obj3;
_L4:
        if (obj1 != null)
        {
            try
            {
                ((ObjectOutputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        if (obj2 != null)
        {
            try
            {
                ((FileOutputStream) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        throw obj;
        Exception exception;
        exception;
        obj1 = objectoutputstream;
        obj2 = obj;
        obj = exception;
        if (true) goto _L4; else goto _L3
_L3:
        Throwable throwable;
        throwable;
        obj2 = objectoutputstream;
          goto _L5
    }

    ()
    {
        this$0 = final_fbloginservice;
        val$storedObject = JSONObject.this;
        super();
    }
}
