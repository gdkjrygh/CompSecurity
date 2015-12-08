// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

// Referenced classes of package com.crashlytics.android.internal:
//            v, q, ab

public class aN
{

    aN()
    {
    }

    public JSONObject a()
    {
        Object obj1;
        Object obj2;
        obj2 = null;
        obj1 = null;
        v.a().b().a("Crashlytics", "Reading cached settings...");
        Object obj = new File(v.a().h(), "com.crashlytics.settings.json");
        if (!((File) (obj)).exists()) goto _L2; else goto _L1
_L1:
        obj = new FileInputStream(((File) (obj)));
        obj1 = obj;
        obj2 = new JSONObject(ab.a(((java.io.InputStream) (obj))));
        obj1 = obj;
        obj = obj2;
_L4:
        ab.a(((java.io.Closeable) (obj1)), "Error while closing settings cache file.");
        return ((JSONObject) (obj));
_L2:
        v.a().b().a("Crashlytics", "No cached settings found.");
        obj = null;
        if (true) goto _L4; else goto _L3
_L3:
        obj2;
        obj = null;
_L8:
        obj1 = obj;
        v.a().b().a("Crashlytics", "Failed to fetch cached settings", ((Throwable) (obj2)));
        ab.a(((java.io.Closeable) (obj)), "Error while closing settings cache file.");
        return null;
        Exception exception;
        exception;
        obj1 = obj2;
_L6:
        ab.a(((java.io.Closeable) (obj1)), "Error while closing settings cache file.");
        throw exception;
        exception;
        if (true) goto _L6; else goto _L5
_L5:
        obj2;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void a(long l, JSONObject jsonobject)
    {
        Object obj;
        v.a().b().a("Crashlytics", "Writing settings to cache file...");
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        obj = null;
        FileWriter filewriter;
        jsonobject.put("expires_at", l);
        filewriter = new FileWriter(new File(v.a().h(), "com.crashlytics.settings.json"));
        obj = filewriter;
        filewriter.write(jsonobject.toString());
        obj = filewriter;
        filewriter.flush();
        ab.a(filewriter, "Failed to close settings writer.");
        return;
        Exception exception;
        exception;
        jsonobject = null;
_L4:
        obj = jsonobject;
        v.a().b().a("Crashlytics", "Failed to cache settings", exception);
        ab.a(jsonobject, "Failed to close settings writer.");
        return;
        jsonobject;
_L2:
        ab.a(((java.io.Closeable) (obj)), "Failed to close settings writer.");
        throw jsonobject;
        jsonobject;
        if (true) goto _L2; else goto _L1
_L1:
        exception;
        jsonobject = filewriter;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
