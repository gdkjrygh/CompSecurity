// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import android.net.Uri;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.fromguava.c;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google.android.apps.youtube.core.async:
//            af

public final class s
    implements af
{

    private final af a;

    public s(af af1)
    {
        a = (af)c.a(af1);
    }

    private static void a(InputStream inputstream)
    {
        if (inputstream == null)
        {
            return;
        }
        try
        {
            inputstream.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            return;
        }
    }

    public final void a(Object obj, b b1)
    {
        Uri uri;
        int i;
        i = 0;
        uri = (Uri)obj;
        if (!uri.getScheme().equals("file")) goto _L2; else goto _L1
_L1:
        File file;
        obj = uri.getPath();
        file = new File(((String) (obj)));
        if (!file.exists()) goto _L4; else goto _L3
_L3:
        BufferedInputStream bufferedinputstream = new BufferedInputStream(new FileInputStream(file), 4096);
        obj = bufferedinputstream;
        int k = (int)file.length();
        obj = bufferedinputstream;
        byte abyte0[] = new byte[k];
        int j = 0;
_L6:
        if (j < 0 || i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        i += j;
        obj = bufferedinputstream;
        j = bufferedinputstream.read(abyte0, i, k - i);
        if (true) goto _L6; else goto _L5
_L5:
        if (i != k) goto _L8; else goto _L7
_L7:
        obj = bufferedinputstream;
        b1.a(uri, abyte0);
_L10:
        a(((InputStream) (bufferedinputstream)));
        return;
_L8:
        obj = bufferedinputstream;
        b1.a(uri, new IOException("Number of bytes read doesn't match file length."));
        if (true) goto _L10; else goto _L9
_L9:
        Object obj1;
        obj1;
_L16:
        obj = bufferedinputstream;
        b1.a(uri, ((Exception) (obj1)));
        a(((InputStream) (bufferedinputstream)));
        return;
        obj1;
        bufferedinputstream = null;
_L14:
        obj = bufferedinputstream;
        b1.a(uri, ((Exception) (obj1)));
        a(((InputStream) (bufferedinputstream)));
        return;
        b1;
        obj = null;
_L12:
        a(((InputStream) (obj)));
        throw b1;
_L4:
        b1.a(uri, new FileNotFoundException(((String) (obj))));
        return;
_L2:
        a.a(uri, b1);
        return;
        b1;
        if (true) goto _L12; else goto _L11
_L11:
        obj1;
        if (true) goto _L14; else goto _L13
_L13:
        obj1;
        bufferedinputstream = null;
        if (true) goto _L16; else goto _L15
_L15:
    }
}
