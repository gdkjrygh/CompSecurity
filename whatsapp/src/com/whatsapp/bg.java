// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.Surface;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

// Referenced classes of package com.whatsapp:
//            App, v2

class bg
    implements android.graphics.SurfaceTexture.OnFrameAvailableListener
{

    private static final String z[];
    private Surface a;
    private boolean b;
    private EGLContext c;
    private Object d;
    private EGL10 e;
    private EGLSurface f;
    private v2 g;
    private EGLDisplay h;
    private SurfaceTexture i;

    public bg()
    {
        d = new Object();
        e();
    }

    public bg(int j, int k)
    {
        d = new Object();
        if (j <= 0 || k <= 0)
        {
            try
            {
                throw new IllegalArgumentException();
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
        } else
        {
            a(j, k);
            d();
            e();
            return;
        }
    }

    private void a(int j, int k)
    {
        try
        {
            e = (EGL10)EGLContext.getEGL();
            h = e.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            if (!e.eglInitialize(h, null))
            {
                throw new RuntimeException(z[7]);
            }
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        Object obj = new EGLConfig[1];
        int ai[] = new int[1];
        try
        {
            if (!e.eglChooseConfig(h, new int[] {
    12324, 8, 12323, 8, 12322, 8, 12339, 1, 12352, 4, 
    12344
}, ((EGLConfig []) (obj)), 1, ai))
            {
                throw new RuntimeException(z[9]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        try
        {
            c = e.eglCreateContext(h, obj[0], EGL10.EGL_NO_CONTEXT, new int[] {
                12440, 2, 12344
            });
            a(z[10]);
            if (c == null)
            {
                throw new RuntimeException(z[8]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        try
        {
            f = e.eglCreatePbufferSurface(h, obj[0], new int[] {
                12375, j, 12374, k, 12344
            });
            a(z[6]);
            if (f == null)
            {
                throw new RuntimeException(z[5]);
            }
        }
        catch (IllegalArgumentException illegalargumentexception1)
        {
            throw illegalargumentexception1;
        }
    }

    private void a(String s)
    {
        boolean flag1 = true;
        boolean flag = false;
        int j = App.am;
        do
        {
label0:
            {
                int k = e.eglGetError();
                if (k != 12288)
                {
                    Log.e(z[1], (new StringBuilder()).append(s).append(z[2]).append(Integer.toHexString(k)).toString());
                    if (j == 0)
                    {
                        break label0;
                    }
                    flag = flag1;
                }
                if (flag)
                {
                    try
                    {
                        throw new RuntimeException(z[0]);
                    }
                    // Misplaced declaration of an exception variable
                    catch (String s)
                    {
                        throw s;
                    }
                } else
                {
                    return;
                }
            }
            flag = true;
        } while (true);
    }

    private void e()
    {
        g = new v2();
        g.b();
        i = new SurfaceTexture(g.a());
        i.setOnFrameAvailableListener(this);
        a = new Surface(i);
    }

    public void a()
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
_L1:
        boolean flag = b;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        d.wait(500L);
        if (!b)
        {
            throw new RuntimeException(z[3]);
        }
          goto _L1
        Object obj1;
        obj1;
        throw obj1;
        obj1;
        throw new RuntimeException(((Throwable) (obj1)));
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        b = false;
        obj;
        JVM INSTR monitorexit ;
        g.a(z[4]);
        i.updateTexImage();
        return;
    }

    public void b()
    {
        g.a(i);
    }

    public Surface c()
    {
        return a;
    }

    public void d()
    {
        try
        {
            if (e == null)
            {
                throw new RuntimeException(z[14]);
            }
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        try
        {
            a(z[12]);
            if (!e.eglMakeCurrent(h, f, f, c))
            {
                throw new RuntimeException(z[13]);
            }
        }
        catch (IllegalArgumentException illegalargumentexception1)
        {
            throw illegalargumentexception1;
        }
    }

    public void onFrameAvailable(SurfaceTexture surfacetexture)
    {
        surfacetexture = ((SurfaceTexture) (d));
        surfacetexture;
        JVM INSTR monitorenter ;
        if (b)
        {
            throw new RuntimeException(z[11]);
        }
        break MISSING_BLOCK_LABEL_33;
        Exception exception;
        exception;
        surfacetexture;
        JVM INSTR monitorexit ;
        throw exception;
        b = true;
        d.notifyAll();
        surfacetexture;
        JVM INSTR monitorexit ;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int j;
        as = new String[15];
        obj = "Nc\016\026#yV-DfnJ!Y3eP'D#o\004jE#n\004.Y!\"";
        byte0 = -1;
        j = 0;
_L2:
        String as1[];
        int k;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        k = 0;
_L8:
label0:
        {
            if (l > k)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[j] = ((String) (obj));
                obj = "DQ6F3\177w7D jG'";
                j = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[j] = ((String) (obj));
                obj = "1\004\007q\n+A0D)y\036b\006>";
                j = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[j] = ((String) (obj));
                obj = "XQ0P'hAbP4jI'\0261jM6\0262bI'RfdQ6";
                j = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[j] = ((String) (obj));
                j = 4;
                obj = "iA$Y4n\0047F\"jP'b#sm/W!n";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[j] = ((String) (obj));
                j = 5;
                obj = "xQ0P'hAbA'x\004,C*g";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[j] = ((String) (obj));
                j = 6;
                obj = "nC.u4nE6S\026iQ$P#yw7D jG'";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[j] = ((String) (obj));
                j = 7;
                obj = "~J#T*n\0046YfbJ+B/jH+L#+a\005zw;";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[j] = ((String) (obj));
                j = 8;
                obj = "eQ.ZfhK,B#sP";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[j] = ((String) (obj));
                j = 9;
                obj = "~J#T*n\0046YfmM,RfYc\000\016~3\0172T3mB'DfNc\016\026%dJ$_!";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[j] = ((String) (obj));
                j = 10;
                obj = "nC.u4nE6S\005dJ6S>\177";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[j] = ((String) (obj));
                obj = "fb0W+ne4W/gE Z#+E.D#j@;\0265nPn\026 yE/SfhK7Z\"+F'\026\"yK2F#o";
                byte0 = 10;
                j = 11;
                break;

            case 10: // '\n'
                as1[j] = ((String) (obj));
                j = 12;
                obj = "iA$Y4n\004/W-ng7D4nJ6";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[j] = ((String) (obj));
                j = 13;
                obj = "nC.{'`A\001C4yA,BfmE+Z#o";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[j] = ((String) (obj));
                j = 14;
                obj = "eK6\026%dJ$_!~V'RfmK0\026+jO'u3yV'X2";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[j] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 412
    //                   0 435
    //                   1 442
    //                   2 449
    //                   3 456;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_456;
_L3:
        byte byte1 = 70;
_L9:
        obj[k] = (char)(byte1 ^ c1);
        k++;
          goto _L8
_L4:
        byte1 = 11;
          goto _L9
_L5:
        byte1 = 36;
          goto _L9
_L6:
        byte1 = 66;
          goto _L9
        byte1 = 54;
          goto _L9
    }
}
