// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.photobillpay;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.kofax.kmc.ken.engines.data.Image;
import com.wf.wellsfargomobile.a.a;
import com.wf.wellsfargomobile.d.c;
import com.wf.wellsfargomobile.util.m;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import org.a.b.a.a.a.b;
import org.a.b.a.a.a.e;
import org.a.b.a.a.h;

// Referenced classes of package com.wf.wellsfargomobile.photobillpay:
//            m, k, l, u, 
//            d

public class j extends AsyncTask
{

    private Context a;
    private String b;
    private String c;
    private String d;

    public j(Context context, String s, String s1)
    {
        a = context;
        b = s;
        c = s1;
    }

    private k a(byte abyte0[], String s)
    {
        String s1 = (new StringBuilder()).append(com.wf.wellsfargomobile.a.a.a()).append(b).toString();
        h h1 = new h();
        h1.a("WFAppId", new e(com.wf.wellsfargomobile.a.a.i(), Charset.forName("UTF-8")));
        h1.a("activitySource", new e(c, Charset.forName("UTF-8")));
        h1.a("image_type", new e("tiff", Charset.forName("UTF-8")));
        h1.a("billphoto", new b(abyte0, "image/tiff", "billphoto.tiff"));
        h1.a("image_size", new e(s, Charset.forName("UTF-8")));
        abyte0 = (new com.wf.wellsfargomobile.d.a(c.b, s1, null, null, a)).a(h1).b().b().toString().replace("/*--safejson--", "").replace("--safejson--*/", "");
        s = (new GsonBuilder()).create();
        abyte0 = (com.wf.wellsfargomobile.photobillpay.m)s.fromJson(abyte0, com/wf/wellsfargomobile/photobillpay/m);
        if (abyte0 == null)
        {
            try
            {
                return com.wf.wellsfargomobile.photobillpay.k.b;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                return com.wf.wellsfargomobile.photobillpay.k.b;
            }
        }
        break MISSING_BLOCK_LABEL_221;
        abyte0;
        return com.wf.wellsfargomobile.photobillpay.k.b;
        if (TextUtils.isEmpty(((com.wf.wellsfargomobile.photobillpay.m) (abyte0)).a))
        {
            return com.wf.wellsfargomobile.photobillpay.k.b;
        }
        if (TextUtils.isEmpty(((com.wf.wellsfargomobile.photobillpay.m) (abyte0)).b))
        {
            return com.wf.wellsfargomobile.photobillpay.k.b;
        }
        d = ((com.wf.wellsfargomobile.photobillpay.m) (abyte0)).b;
        abyte0 = com.wf.wellsfargomobile.photobillpay.k.a;
        return abyte0;
    }

    protected transient k a(l al[])
    {
        if (al[0] == null || al[0].a == null) goto _L2; else goto _L1
_L1:
        Image image;
        boolean flag;
        image = al[0].a;
        flag = al[0].b;
        al = null;
        if (!flag) goto _L4; else goto _L3
_L3:
        byte abyte0[] = m.a(image.getImageFilePath());
        al = abyte0;
_L8:
        byte abyte1[];
        if (al == null || al.length == 0)
        {
            al = com.wf.wellsfargomobile.photobillpay.k.b;
        } else
        {
            al = a(((byte []) (al)), String.valueOf(image.getImageSize()));
        }
        com.wf.wellsfargomobile.photobillpay.u.a(image);
_L6:
        com.wf.wellsfargomobile.photobillpay.u.a(com.wf.wellsfargomobile.photobillpay.u.c());
        com.wf.wellsfargomobile.photobillpay.d.d();
        return al;
_L4:
        try
        {
            abyte1 = m.a(image, com.kofax.kmc.ken.engines.data.Image.ImageMimeType.MIMETYPE_TIFF);
        }
        catch (Exception exception)
        {
            continue; /* Loop/switch isn't completed */
        }
        al = abyte1;
        continue; /* Loop/switch isn't completed */
_L2:
        al = com.wf.wellsfargomobile.photobillpay.k.b;
        if (true) goto _L6; else goto _L5
_L5:
        IOException ioexception;
        ioexception;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public String a()
    {
        return d;
    }

    protected void a(k k1)
    {
        super.onPostExecute(k1);
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((l[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((k)obj);
    }

    protected void onPreExecute()
    {
        super.onPreExecute();
    }
}
