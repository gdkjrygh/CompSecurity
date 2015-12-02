// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.os.AsyncTask;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp.gallerypicker:
//            ImagePreview, ImageGallery, ai, f, 
//            t, q, bi, bu, 
//            at

class i extends AsyncTask
{

    private static final String z;
    final boolean a;
    final ImageGallery b;
    final boolean c;

    i(ImageGallery imagegallery, boolean flag, boolean flag1)
    {
        b = imagegallery;
        c = flag;
        a = flag1;
        super();
    }

    protected Void a(Void avoid[])
    {
        int k = ImagePreview.B;
        avoid = b;
        ai ai1;
        int j;
        int l;
        boolean flag;
        if (!c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ai1 = ImageGallery.a(avoid, flag);
        l = ai1.d();
        b.runOnUiThread(new f(this, l));
        j = 0;
        avoid = null;
        do
        {
            Object obj;
label0:
            {
label1:
                {
label2:
                    {
                        obj = avoid;
                        if (j >= l)
                        {
                            break label1;
                        }
                        if (isCancelled())
                        {
                            obj = avoid;
                            if (k == 0)
                            {
                                break label1;
                            }
                        }
                        Object obj1 = ai1.a(j);
                        if (obj1 == null)
                        {
                            obj = avoid;
                            if (k == 0)
                            {
                                break label1;
                            }
                        }
                        long l1 = ((t) (obj1)).d();
                        obj1 = b.a(l1);
                        if (avoid != null)
                        {
                            obj = avoid;
                            if (avoid.equals(obj1))
                            {
                                break label2;
                            }
                        }
                        if (avoid != null)
                        {
                            b.runOnUiThread(new bi(this, avoid));
                        }
                        obj1.c = 0;
                        obj = obj1;
                    }
                    obj.c = ((q) (obj)).c + 1;
                    if (k == 0)
                    {
                        break label0;
                    }
                }
                if (obj != null && !isCancelled())
                {
                    b.runOnUiThread(new bu(this, ((q) (obj))));
                }
                ai1.b();
                Log.i(z);
                return null;
            }
            j++;
            avoid = ((Void []) (obj));
        } while (true);
    }

    protected void a(Void void1)
    {
        ImageGallery.c(b).notifyDataSetChanged();
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Void)obj);
    }

    static 
    {
        char ac[];
        int j;
        int k;
        ac = "-\"\036Fd#.\023Md66P@m(o\035Tb/*\013R!%<\fHf**\033".toCharArray();
        k = ac.length;
        j = 0;
_L7:
        char c1;
        if (k <= j)
        {
            z = (new String(ac)).intern();
            return;
        }
        c1 = ac[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 85
    //                   1 91
    //                   2 97
    //                   3 103;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_103;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 1;
_L8:
        ac[j] = (char)(byte0 ^ c1);
        j++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 68;
          goto _L8
_L3:
        byte0 = 79;
          goto _L8
_L4:
        byte0 = 127;
          goto _L8
        byte0 = 33;
          goto _L8
    }
}
