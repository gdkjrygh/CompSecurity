// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.qrcode;

import android.content.Context;
import android.hardware.Camera;
import android.util.AttributeSet;
import android.view.Display;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.WindowManager;
import com.whatsapp.camera.CameraView;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.whatsapp.qrcode:
//            d, QrCodeActivity, o, b

public class QrCodeView extends SurfaceView
    implements android.view.SurfaceHolder.Callback
{

    private static final String z[];
    private SurfaceHolder a;
    final android.hardware.Camera.AutoFocusCallback b;
    private android.hardware.Camera.Size c;
    private b d;
    private Camera e;

    public QrCodeView(Context context)
    {
        this(context, null);
    }

    public QrCodeView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public QrCodeView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = new d(this);
        a = getHolder();
        a.addCallback(this);
        a.setType(3);
    }

    static Camera a(QrCodeView qrcodeview)
    {
        return qrcodeview.e;
    }

    static Camera a(QrCodeView qrcodeview, Camera camera)
    {
        qrcodeview.e = camera;
        return camera;
    }

    static SurfaceHolder b(QrCodeView qrcodeview)
    {
        return qrcodeview.a;
    }

    private void b()
    {
        int i = QrCodeActivity.m;
        if (e != null) goto _L2; else goto _L1
_L1:
        int j;
        e = Camera.open();
        if (e != null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        j = android.os.Build.VERSION.SDK_INT;
        if (j < 9)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        e = Camera.open(0);
        e.setErrorCallback(new o(this));
_L3:
        return;
        Exception exception;
        exception;
        try
        {
            throw exception;
        }
        catch (Exception exception1)
        {
            try
            {
                throw exception1;
            }
            catch (Object obj)
            {
                try
                {
                    if (e != null)
                    {
                        e.release();
                    }
                }
                catch (Exception exception2)
                {
                    throw exception2;
                }
            }
        }
        e = null;
        Log.a(z[29], ((Throwable) (obj)));
        d();
        if (i == 0) goto _L3; else goto _L2
_L2:
        j = android.os.Build.VERSION.SDK_INT;
        if (j < 8)
        {
            break; /* Loop/switch isn't completed */
        }
        Exception exception3;
        try
        {
            e.reconnect();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            try
            {
                e.release();
                e = null;
                Log.a(z[28], ((Throwable) (obj)));
                d();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        catch (RuntimeException runtimeexception)
        {
            throw runtimeexception;
        }
        if (i == 0) goto _L3; else goto _L4
_L4:
        e.release();
        e = null;
        b();
        return;
        exception3;
        throw exception3;
    }

    static void c(QrCodeView qrcodeview)
    {
        qrcodeview.e();
    }

    private void d()
    {
        try
        {
            if (d != null)
            {
                d.b();
            }
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            throw runtimeexception;
        }
    }

    static void d(QrCodeView qrcodeview)
    {
        qrcodeview.b();
    }

    private void e()
    {
        Log.i(z[25]);
        if (e != null)
        {
            try
            {
                e.stopPreview();
            }
            catch (Exception exception)
            {
                Log.c(z[27], exception);
            }
            try
            {
                e.release();
            }
            catch (Exception exception1)
            {
                Log.c(z[26], exception1);
            }
            e = null;
        }
    }

    static void e(QrCodeView qrcodeview)
    {
        qrcodeview.d();
    }

    public android.hardware.Camera.Size a()
    {
        return c;
    }

    public Camera c()
    {
        return e;
    }

    protected void f()
    {
        int i;
        int j;
        int l;
        l = QrCodeActivity.m;
        i = getWidth();
        j = getHeight();
        if (e != null) goto _L2; else goto _L1
_L1:
        Log.e(z[5]);
        d();
_L21:
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        throw runtimeexception;
_L2:
        android.hardware.Camera.Parameters parameters;
        boolean flag;
        int k;
        boolean flag1;
        boolean flag2;
        Display display = ((WindowManager)getContext().getSystemService(z[17])).getDefaultDisplay();
        int i1 = display.getOrientation();
        Object obj;
        RuntimeException runtimeexception1;
        if (i1 == 0 || i1 == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        parameters = e.getParameters();
        obj = parameters.getSupportedPreviewSizes();
        if (obj == null)
        {
            Log.i(z[18]);
            obj = new ArrayList();
            Camera camera = e;
            camera.getClass();
            ((List) (obj)).add(new android.hardware.Camera.Size(camera, 640, 480));
        }
        if (flag)
        {
            k = j;
        } else
        {
            k = i;
        }
        if (!flag)
        {
            i = j;
        }
        c = CameraView.a(((List) (obj)), k, i);
        Log.i((new StringBuilder()).append(z[11]).append(c.width).append("x").append(c.height).toString());
        flag1 = false;
        if (android.os.Build.VERSION.SDK_INT < 9) goto _L4; else goto _L3
_L3:
        obj = new android.hardware.Camera.CameraInfo();
        try
        {
            Camera.getCameraInfo(0, ((android.hardware.Camera.CameraInfo) (obj)));
            i = ((android.hardware.Camera.CameraInfo) (obj)).facing;
        }
        catch (RuntimeException runtimeexception2)
        {
            throw runtimeexception2;
        }
        if (i == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        i = ((android.hardware.Camera.CameraInfo) (obj)).orientation;
        flag2 = flag1;
        if (l == 0) goto _L5; else goto _L4
_L4:
label0:
        {
            if (i1 == 0 || i1 == 2)
            {
                j = display.getWidth();
                i = display.getHeight();
                if (l == 0)
                {
                    break label0;
                }
            }
            j = display.getHeight();
            i = display.getWidth();
        }
        if (j <= i) goto _L7; else goto _L6
_L6:
        i = 0;
        flag2 = flag1;
        if (l == 0) goto _L5; else goto _L7
_L7:
        j = 90;
_L26:
        i = 0;
        i1;
        JVM INSTR tableswitch 0 3: default 376
    //                   0 835
    //                   1 843
    //                   2 852
    //                   3 862;
           goto _L8 _L9 _L10 _L11 _L12
_L8:
        if (!flag1) goto _L14; else goto _L13
_L13:
        k = (360 - (j + i) % 360) % 360;
        if (l == 0) goto _L15; else goto _L14
_L14:
        k = ((j - i) + 360) % 360;
_L15:
        Log.i((new StringBuilder()).append(z[22]).append(i).append(z[2]).append(j).append(z[16]).append(k).append(z[20]).append(flag1).toString());
        if (android.os.Build.VERSION.SDK_INT < 8) goto _L17; else goto _L16
_L16:
        e.setDisplayOrientation(k);
_L22:
        parameters.setPreviewSize(c.width, c.height);
        obj = parameters.getSupportedFocusModes();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_667;
        }
        Log.i((new StringBuilder()).append(z[8]).append(Arrays.deepToString(((List) (obj)).toArray())).toString());
        flag1 = ((List) (obj)).contains(z[13]);
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_600;
        }
        parameters.setFocusMode(z[15]);
        if (l == 0)
        {
            break MISSING_BLOCK_LABEL_675;
        }
        flag1 = ((List) (obj)).contains(z[3]);
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_633;
        }
        parameters.setFocusMode(z[21]);
        if (l == 0)
        {
            break MISSING_BLOCK_LABEL_675;
        }
        flag1 = ((List) (obj)).contains(z[6]);
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_675;
        }
        RuntimeException runtimeexception3;
        Object obj1;
        String s;
        try
        {
            parameters.setFocusMode(z[12]);
        }
        catch (RuntimeException runtimeexception4)
        {
            throw runtimeexception4;
        }
        if (l == 0)
        {
            break MISSING_BLOCK_LABEL_675;
        }
        Log.i(z[4]);
        obj = parameters.getSupportedFlashModes();
        if (obj == null) goto _L19; else goto _L18
_L18:
        try
        {
            Log.i((new StringBuilder()).append(z[23]).append(Arrays.deepToString(((List) (obj)).toArray())).toString());
        }
        catch (RuntimeException runtimeexception5)
        {
            throw runtimeexception5;
        }
        if (l == 0) goto _L20; else goto _L19
_L19:
        Log.i(z[24]);
_L20:
        if (obj != null)
        {
            try
            {
                if (((List) (obj)).contains(z[0]))
                {
                    parameters.setFlashMode(z[10]);
                }
            }
            catch (RuntimeException runtimeexception6)
            {
                throw runtimeexception6;
            }
        }
        try
        {
            e.setParameters(parameters);
            e.startPreview();
            e.autoFocus(b);
            if (d != null)
            {
                d.a();
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (RuntimeException runtimeexception1)
        {
            throw runtimeexception1;
        }
          goto _L21
_L9:
        i = 0;
        if (l == 0) goto _L8; else goto _L10
_L10:
        i = 90;
        if (l == 0) goto _L8; else goto _L11
_L11:
        i = 180;
        if (l == 0) goto _L8; else goto _L12
_L12:
        i = 270;
          goto _L8
        runtimeexception3;
        Log.e((new StringBuilder()).append(z[19]).append(runtimeexception3.toString()).toString());
        if (l == 0) goto _L22; else goto _L17
_L17:
        try
        {
            parameters.set(z[7], k);
            s = z[1];
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        if (!flag) goto _L24; else goto _L23
_L23:
        obj1 = z[9];
_L25:
        parameters.set(s, ((String) (obj1)));
          goto _L22
        obj1;
        throw obj1;
_L24:
        obj1 = z[14];
          goto _L25
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
_L5:
        flag1 = flag2;
        j = i;
          goto _L26
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
    }

    public void setCameraCallback(b b1)
    {
        d = b1;
    }

    public void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
    {
        try
        {
            if (e == null)
            {
                Log.e(z[33]);
                d();
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (SurfaceHolder surfaceholder)
        {
            throw surfaceholder;
        }
        try
        {
            if (a.getSurface() == null)
            {
                Log.e(z[30]);
                d();
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (SurfaceHolder surfaceholder)
        {
            throw surfaceholder;
        }
        if (!surfaceholder.isCreating())
        {
            e.stopPreview();
        }
        try
        {
            e.setPreviewDisplay(surfaceholder);
            f();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SurfaceHolder surfaceholder)
        {
            e.release();
        }
        e = null;
        Log.a(z[32], surfaceholder);
        d();
        return;
        surfaceholder;
        throw surfaceholder;
        surfaceholder;
        e.release();
        e = null;
        Log.a(z[31], surfaceholder);
        d();
        return;
    }

    public void surfaceCreated(SurfaceHolder surfaceholder)
    {
        b();
    }

    public void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
        e();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[34];
        obj = "\025;i";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "\025/f)\016\016<{%\017\024";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "Z>n!\005\b<5";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\027<l>\017";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "\013/y%\005\rr|8\001\b)\177>\005\f4j;@\t(\177<\017\b)j(@\0342l9\023@3z \f";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\013/y%\005\rr|8\001\b)\177>\005\f4j;@\031<b)\022\033}f?@\024(c ";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\0379`*";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "\b2{-\024\0232a";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "\013/y%\005\rr|8\001\b)\177>\005\f4j;@\t(\177<\017\b)j(@\0342l9\023@";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "\n2}8\022\0334{";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "\025;i";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "\013/y%\005\rr|8\001\b)\177>\005\f4j;@\025-{%\r\0331/<\022\037+f)\027Z.f6\005@";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "\0379`*";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "\033({#";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "\026<a(\023\031<\177)";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                obj = "\033({#";
                byte0 = 14;
                i = 15;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "Z-})\026\0238xv";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "\r4a(\017\r";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "\013/y%\005\rri-\f\026?n/\013\t(\177<\017\b)j(\020\b8y%\005\r.f6\005\t";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i] = ((String) (obj));
                i = 19;
                obj = "\013/y%\005\rr|8\001\b)\177>\005\f4j;O\t8{(\t\t-c-\031\025/f)\016\016<{%\017\024}";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i] = ((String) (obj));
                i = 20;
                obj = "Z;}#\016\016g";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i] = ((String) (obj));
                i = 21;
                obj = "\027<l>\017";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i] = ((String) (obj));
                i = 22;
                obj = "\013/y%\005\rr|8\001\b)\177>\005\f4j;@\0364|<\f\033$5";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i] = ((String) (obj));
                i = 23;
                obj = "\013/y%\005\rr|8\001\b)\177>\005\f4j;@\t(\177<\017\b)j(@\0341n?\b@";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i] = ((String) (obj));
                i = 24;
                obj = "\013/y%\005\rr|8\001\b)\177>\005\f4j;@\t(\177<\017\b)j(@\0341n?\b@3z \f";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i] = ((String) (obj));
                i = 25;
                obj = "\013/y%\005\rr|8\017\n>n!\005\b<";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[i] = ((String) (obj));
                i = 26;
                obj = "\013/y%\005\rr|8\017\n>n!\005\b</)\022\b2}l\022\0371j-\023\0374a+@\031<b)\022\033";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[i] = ((String) (obj));
                i = 27;
                obj = "\013/y%\005\rr|8\017\n>n!\005\b</)\022\b2}l\023\0162\177<\t\024://\001\0278}-@\n/j:\t\037*";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[i] = ((String) (obj));
                i = 28;
                obj = "\013/y%\005\rr|8\001\b)l-\r\037/nl\005\b/`>@\b8l#\016\0248l8\t\024://\001\0278}-";
                byte0 = 27;
                break;

            case 27: // '\033'
                as1[i] = ((String) (obj));
                i = 29;
                obj = "\013/y%\005\rr|8\001\b)l-\r\037/nl\005\b/`>@\025-j\"\t\024://\001\0278}-";
                byte0 = 28;
                break;

            case 28: // '\034'
                as1[i] = ((String) (obj));
                i = 30;
                obj = "\013/y%\005\rr|9\022\034<l)\003\022<a+\005\036g/\"\017Z.z>\006\033>j";
                byte0 = 29;
                break;

            case 29: // '\035'
                as1[i] = ((String) (obj));
                i = 31;
                obj = "\013/y%\005\rr|9\022\034<l)\003\022<a+\005\036g/)\022\b2}l\023\037){%\016\035}\177>\005\f4j;@\0364|<\f\033$";
                byte0 = 30;
                break;

            case 30: // '\036'
                as1[i] = ((String) (obj));
                i = 32;
                obj = "\013/y%\005\rr|9\022\034<l)\003\022<a+\005\036}";
                byte0 = 31;
                break;

            case 31: // '\037'
                as1[i] = ((String) (obj));
                i = 33;
                obj = "\013/y%\005\rr|9\022\034<l)\003\022<a+\005\036g/\"\017Z>n!\005\b<";
                byte0 = 32;
                break;

            case 32: // ' '
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 828
    //                   0 851
    //                   1 858
    //                   2 865
    //                   3 872;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_872;
_L3:
        byte byte1 = 96;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 122;
          goto _L9
_L5:
        byte1 = 93;
          goto _L9
_L6:
        byte1 = 15;
          goto _L9
        byte1 = 76;
          goto _L9
    }
}
