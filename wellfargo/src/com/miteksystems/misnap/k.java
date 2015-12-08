// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.hardware.Camera;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Vibrator;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.WindowManager;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.a.c.b;
import org.a.c.b.a.a.a;
import org.a.c.b.b.a.e;
import org.a.c.b.b.a.o;
import org.a.c.b.b.c.h;
import org.a.c.b.b.c.j;
import org.a.c.b.b.c.m;
import org.a.c.c;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.miteksystems.misnap:
//            l, m, n, MiSnap, 
//            p, MiSnapAPI, t, MitekAnalyzer, 
//            al, o

public final class k extends SurfaceView
    implements android.hardware.Camera.AutoFocusCallback, android.hardware.Camera.ErrorCallback, android.hardware.Camera.PictureCallback, android.hardware.Camera.PreviewCallback, android.view.SurfaceHolder.Callback
{

    private static final Uri m = Uri.parse("file:///system/media/audio/ui/camera_click.ogg");
    private static final ArrayList n = new ArrayList(Arrays.asList(new String[] {
        "DROID BIONIC", "DROID RAZR MAXX HD", "GT-I9300", "GT-N7100", "HTC Desire HD A9191", "PantechP9070"
    }));
    private static MediaPlayer o;
    private static boolean p = false;
    private int A;
    private Handler B;
    boolean a;
    Camera b;
    int c;
    int d;
    boolean e;
    Runnable f;
    Runnable g;
    Runnable h;
    private MiSnap i;
    private MitekAnalyzer j;
    private t k;
    private Handler l;
    private byte q[];
    private Camera r;
    private android.hardware.Camera.Parameters s;
    private android.hardware.Camera.Size t;
    private boolean u;
    private byte v[];
    private long w;
    private boolean x;
    private boolean y;
    private boolean z;

    k(Context context, Camera camera, Handler handler)
    {
        super(context);
        q = null;
        a = false;
        u = false;
        b = null;
        y = false;
        z = false;
        e = false;
        f = new l(this);
        g = new com.miteksystems.misnap.m(this);
        h = new n(this);
        i = (MiSnap)context;
        getHolder().addCallback(this);
        getHolder().setType(3);
        l = new Handler();
        p = false;
        B = handler;
        r = camera;
    }

    private static android.hardware.Camera.Size a(android.hardware.Camera.Parameters parameters, android.hardware.Camera.Size size, int i1)
    {
        if (parameters != null && size != null && size.height != 0) goto _L2; else goto _L1
_L1:
        parameters = null;
_L4:
        return parameters;
_L2:
        Object obj;
        obj = parameters.getSupportedPictureSizes();
        if (obj == null)
        {
            return null;
        }
        parameters = size;
        if (((List) (obj)).contains(size)) goto _L4; else goto _L3
_L3:
        double d1;
        double d4;
        Iterator iterator;
        int j1;
        d4 = (double)size.width / (double)size.height;
        j1 = size.width;
        iterator = ((List) (obj)).iterator();
        parameters = null;
        d1 = 1.7976931348623157E+308D;
_L11:
        if (iterator.hasNext()) goto _L6; else goto _L5
_L5:
        size = parameters;
        if (parameters != null) goto _L8; else goto _L7
_L7:
        if (obj != null) goto _L10; else goto _L9
_L9:
        size = null;
_L8:
        return size;
_L6:
        size = (android.hardware.Camera.Size)iterator.next();
        double d2 = Math.abs(size.width - j1);
        double d5 = (double)size.width / (double)size.height;
        if (d2 <= d1 && size.width >= j1 && (double)size.height >= 0.5625D * (double)j1 && d5 == d4)
        {
            d1 = d2;
            parameters = size;
        }
          goto _L11
_L10:
        obj = ((List) (obj)).iterator();
        parameters = null;
        d1 = 1.7976931348623157E+308D;
_L13:
        size = parameters;
        if (!((Iterator) (obj)).hasNext()) goto _L8; else goto _L12
_L12:
        size = (android.hardware.Camera.Size)((Iterator) (obj)).next();
        (new StringBuilder("picture size ")).append(size.width).append("x").append(size.height).toString();
        double d3 = Math.abs(size.width - i1);
        if (d3 <= d1 && size.width >= i1 && (double)size.height > 0.5625D * (double)i1)
        {
            d1 = d3;
            parameters = size;
        }
          goto _L13
    }

    private static void a(Context context)
    {
        int i1 = ((AudioManager)context.getSystemService("audio")).getStreamVolume(5);
        if (i1 != 0)
        {
            if (o == null)
            {
                MediaPlayer mediaplayer = MediaPlayer.create(context, m);
                o = mediaplayer;
                long al1[];
                if (mediaplayer != null)
                {
                    o.setOnPreparedListener(new p(i1));
                } else
                {
                    Log.w("MiSnapCamera", (new StringBuilder()).append(m).append(" still null after create()").toString());
                }
            } else
            {
                o.setVolume(i1, i1);
                o.start();
            }
        }
        context = (Vibrator)context.getSystemService("vibrator");
        al1 = new long[4];
        al1[1] = 100L;
        al1[2] = 100L;
        al1[3] = 200L;
        context.vibrate(al1, -1);
    }

    static void a(k k1, SurfaceHolder surfaceholder, int i1, int j1)
    {
        android.hardware.Camera.Parameters parameters = k1.m();
        if (parameters == null) goto _L2; else goto _L1
_L1:
        if (!k1.i.l) goto _L4; else goto _L3
_L3:
        Object obj;
        obj = k1.r;
        obj.getClass();
        obj = new android.hardware.Camera.Size(((Camera) (obj)), 1920, 1080);
_L8:
        if (obj == null) goto _L6; else goto _L5
_L5:
        parameters.setPreviewSize(((android.hardware.Camera.Size) (obj)).width, ((android.hardware.Camera.Size) (obj)).height);
_L25:
        obj = a(parameters, ((android.hardware.Camera.Size) (obj)), k1.i.a.e());
        if (obj == null)
        {
            try
            {
                k1.i.a(0, new Intent(), "CameraNotSufficient");
                return;
            }
            // Misplaced declaration of an exception variable
            catch (k k1)
            {
                Log.e("MiSnapCamera", (new StringBuilder("Error starting camera preview: ")).append(k1.getMessage()).toString());
            }
            return;
        }
          goto _L7
_L4:
label0:
        {
            if (!k1.i.m)
            {
                break label0;
            }
            obj = k1.r;
            obj.getClass();
            obj = new android.hardware.Camera.Size(((Camera) (obj)), 1280, 720);
        }
          goto _L8
        Object obj2 = k1.m().getSupportedPreviewSizes();
        if (obj2 == null) goto _L10; else goto _L9
_L9:
        if (((List) (obj2)).size() != 0) goto _L11; else goto _L10
_L11:
        double d3 = (double)i1 / (double)j1;
        int l1 = 0x4b000;
        Iterator iterator = ((List) (obj2)).iterator();
        double d1;
        d1 = 1.7976931348623157E+308D;
        obj = null;
_L20:
        if (iterator.hasNext()) goto _L13; else goto _L12
_L12:
        Object obj1 = obj;
        if (obj != null) goto _L15; else goto _L14
_L14:
        obj2 = ((List) (obj2)).iterator();
_L22:
        if (((Iterator) (obj2)).hasNext()) goto _L17; else goto _L16
_L16:
        obj1 = obj;
          goto _L15
_L13:
        double d2;
        int i2;
        obj1 = (android.hardware.Camera.Size)iterator.next();
        d2 = (double)((android.hardware.Camera.Size) (obj1)).width / (double)((android.hardware.Camera.Size) (obj1)).height;
        i2 = ((android.hardware.Camera.Size) (obj1)).width * ((android.hardware.Camera.Size) (obj1)).height;
          goto _L18
_L42:
        if (Math.abs(d3 - d2) >= Math.abs(d3 - d1) || i2 < 0x4b000) goto _L20; else goto _L19
_L17:
        obj1 = (android.hardware.Camera.Size)((Iterator) (obj2)).next();
        if (((android.hardware.Camera.Size) (obj1)).width > i1 || ((android.hardware.Camera.Size) (obj1)).height > j1) goto _L22; else goto _L21
_L21:
        i2 = ((android.hardware.Camera.Size) (obj1)).width * ((android.hardware.Camera.Size) (obj1)).height;
        if (obj == null) goto _L24; else goto _L23
_L6:
        k1.i.a.a();
          goto _L25
_L7:
        parameters.setPictureSize(((android.hardware.Camera.Size) (obj)).width, ((android.hardware.Camera.Size) (obj)).height);
        k1.t = ((android.hardware.Camera.Size) (obj));
        if (MiSnap.q) goto _L27; else goto _L26
_L26:
        boolean flag;
        boolean flag1;
        flag = k1.i.a.b();
        flag1 = k1.i.a.n().contains("LICENSE");
        k1.i.e();
        JVM INSTR tableswitch 0 3: default 1024
    //                   0 785
    //                   1 809
    //                   2 1027
    //                   3 896;
           goto _L28 _L29 _L30 _L31 _L32
_L28:
        break; /* Loop/switch isn't completed */
_L31:
        break MISSING_BLOCK_LABEL_1027;
_L40:
        parameters.setPictureFormat(256);
        parameters.setPreviewFormat(17);
        parameters.setJpegQuality(k1.i.a.f());
        obj = Build.MODEL;
        if (!n.contains(obj) && k1.e()) goto _L34; else goto _L33
_L33:
        obj = parameters.getSupportedSceneModes();
        if (obj == null) goto _L34; else goto _L35
_L35:
        if (((List) (obj)).size() != 0 && ((List) (obj)).contains("steadyphoto"))
        {
            parameters.setSceneMode("steadyphoto");
        }
_L34:
        k1.r.setParameters(parameters);
        if (k1.m() != null)
        {
            k1.m().getPictureSize();
            k1.m().getPreviewSize();
        }
        if (k1.k == null) goto _L37; else goto _L36
_L36:
        k1.b(k1.k);
        if (!k1.i.a.b()) goto _L39; else goto _L38
_L38:
        k1.k.l();
_L37:
        k1.r.setPreviewDisplay(surfaceholder);
        k1.r.startPreview();
        if (k1.i.a.b())
        {
            p = false;
            k1.r.setPreviewCallback(k1);
        }
        k1.B.sendEmptyMessageDelayed(18, 10L);
        return;
_L29:
        k1.a(false);
        k1.i.x = false;
        k1.i.p = true;
          goto _L40
_L30:
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_838;
        }
        k1.a(false);
        k1.i.x = false;
        k1.i.p = true;
          goto _L40
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_851;
        }
        k1.a(false);
          goto _L40
        k1.p();
          goto _L40
_L43:
        k1.a(flag);
        obj = k1.i;
        if (flag1)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        obj.x = flag;
        k1.i.p = true;
          goto _L40
_L32:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_909;
        }
        k1.a(false);
          goto _L40
        k1.p();
          goto _L40
_L27:
        if (!k1.i.x) goto _L40; else goto _L41
_L41:
        k1.a(true);
          goto _L40
_L2:
        k1.i.a(0, new Intent(), "CameraNotSufficient");
        return;
_L39:
        k1.k.n();
          goto _L37
_L10:
        obj = null;
          goto _L8
_L15:
        obj = obj1;
          goto _L8
_L18:
        if (d3 == d2 && (d3 == d1 && i2 >= 0x4b000 || d3 != d1 && i2 >= 0x4b000)) goto _L19; else goto _L42
_L19:
        d1 = d2;
        obj = obj1;
          goto _L20
_L23:
        if (((android.hardware.Camera.Size) (obj1)).width <= ((android.hardware.Camera.Size) (obj)).width && ((android.hardware.Camera.Size) (obj1)).height <= ((android.hardware.Camera.Size) (obj)).height || i2 <= l1) goto _L22; else goto _L24
_L24:
        l1 = i2;
        obj = obj1;
          goto _L22
        if (flag1)
        {
            flag = false;
        } else
        {
            flag = true;
        }
          goto _L43
    }

    static boolean a(k k1)
    {
        return k1.y;
    }

    private byte[] a(int i1)
    {
        ByteArrayOutputStream bytearrayoutputstream;
        int j1;
        bytearrayoutputstream = new ByteArrayOutputStream();
        j1 = m().getPreviewFormat();
        if (17 != j1) goto _L2; else goto _L1
_L1:
        (new YuvImage(v, 17, c, d, null)).compressToJpeg(new Rect(0, 0, c, d), i1, bytearrayoutputstream);
_L4:
        v = null;
        byte abyte0[] = bytearrayoutputstream.toByteArray();
        try
        {
            bytearrayoutputstream.close();
        }
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
            return abyte0;
        }
        return abyte0;
_L2:
        if (256 == j1 || 4 == j1)
        {
            abyte0 = BitmapFactory.decodeByteArray(v, 0, v.length);
            abyte0.compress(android.graphics.Bitmap.CompressFormat.JPEG, i1, bytearrayoutputstream);
            abyte0.recycle();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private byte[] a(byte abyte0[])
    {
        if (!i.k()) goto _L2; else goto _L1
_L1:
        if (i.a.t() != 1) goto _L4; else goto _L3
_L3:
        MiSnap misnap = i;
        if (com.miteksystems.misnap.MiSnap.a() == 3) goto _L2; else goto _L4
_L4:
        return abyte0;
_L2:
        byte abyte1[] = abyte0;
        Bitmap bitmap;
        Object obj;
        Object obj1;
        try
        {
            obj = new Matrix();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return abyte1;
        }
        abyte1 = abyte0;
        bitmap = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length);
        if (bitmap == null) goto _L4; else goto _L5
_L5:
        abyte1 = abyte0;
        if (!i.k()) goto _L7; else goto _L6
_L6:
        abyte1 = abyte0;
        if (i.a.t() != 1)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        abyte1 = abyte0;
        obj1 = i;
        abyte1 = abyte0;
        if (com.miteksystems.misnap.MiSnap.a() != 3)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        abyte1 = abyte0;
        ((Matrix) (obj)).postRotate(180F);
_L9:
        abyte1 = abyte0;
        obj1 = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), ((Matrix) (obj)), false);
        if (obj1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        abyte1 = abyte0;
        obj = new ByteArrayOutputStream();
        abyte1 = abyte0;
        ((Bitmap) (obj1)).compress(android.graphics.Bitmap.CompressFormat.JPEG, i.a.f(), ((java.io.OutputStream) (obj)));
        abyte1 = abyte0;
        ((Bitmap) (obj1)).recycle();
        abyte1 = abyte0;
        bitmap.recycle();
        abyte1 = abyte0;
        System.gc();
        abyte1 = null;
        return ((ByteArrayOutputStream) (obj)).toByteArray();
_L7:
        abyte1 = abyte0;
        ((Matrix) (obj)).postRotate(180F);
        if (true) goto _L9; else goto _L8
_L8:
        abyte1 = abyte0;
        bitmap.recycle();
        abyte1 = abyte0;
        System.gc();
        return abyte0;
    }

    private static byte[] a(byte abyte0[], String s1)
    {
        m m1 = new m(77);
        s1 = org.a.c.b.b.a.b.dk.a(o.E_, s1, m1.a);
        s1 = new j(org.a.c.b.b.a.b.dk, org.a.c.b.b.a.b.dk.c[0], s1.length, s1);
        m1.c().a(s1);
        s1 = new ByteArrayOutputStream(100);
        (new a()).a(abyte0, s1, m1);
_L1:
        return s1.toByteArray();
        abyte0;
        s1 = null;
_L4:
        abyte0.printStackTrace();
          goto _L1
        abyte0;
        s1 = null;
_L3:
        abyte0.printStackTrace();
          goto _L1
        abyte0;
        s1 = null;
_L2:
        abyte0.printStackTrace();
          goto _L1
        abyte0;
          goto _L2
        abyte0;
          goto _L3
        abyte0;
          goto _L4
    }

    static Camera b(k k1)
    {
        return k1.r;
    }

    private void b(t t1)
    {
        if (m() != null && t1 != null)
        {
            android.hardware.Camera.Size size = m().getPreviewSize();
            t1.a(size.width, size.height);
            t1.a(e());
        }
    }

    private byte[] b(int i1)
    {
        android.hardware.Camera.Size size = r.getParameters().getPictureSize();
        double d1 = (float)size.height / (float)size.width;
        Object obj;
        int j1;
        int k1;
        if (0.5625D == d1)
        {
            j1 = size.width;
        } else
        {
            j1 = 1600;
        }
        k1 = (int)(d1 * (double)(float)j1);
        obj = new android.graphics.BitmapFactory.Options();
        obj.inScaled = false;
        obj.inPurgeable = false;
        obj = BitmapFactory.decodeByteArray(q, 0, q.length, ((android.graphics.BitmapFactory.Options) (obj)));
        q = null;
        if (obj == null)
        {
            return null;
        }
        if (j1 != size.width)
        {
            byte abyte0[];
            Object obj1;
            IOException ioexception;
            try
            {
                obj1 = Bitmap.createScaledBitmap(((Bitmap) (obj)), j1, k1, true);
                ((Bitmap) (obj)).recycle();
                obj = r;
                obj.getClass();
                t = new android.hardware.Camera.Size(((Camera) (obj)), j1, k1);
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
                return null;
            }
            obj = obj1;
        }
        obj1 = new ByteArrayOutputStream();
        ((Bitmap) (obj)).compress(android.graphics.Bitmap.CompressFormat.JPEG, i1, ((java.io.OutputStream) (obj1)));
        ((Bitmap) (obj)).recycle();
        abyte0 = ((ByteArrayOutputStream) (obj1)).toByteArray();
        try
        {
            ((ByteArrayOutputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
            return abyte0;
        }
        return abyte0;
    }

    static MitekAnalyzer c(k k1)
    {
        return k1.j;
    }

    static t d(k k1)
    {
        return k1.k;
    }

    static boolean e(k k1)
    {
        return k1.x;
    }

    static void f(k k1)
    {
        k1.u = false;
    }

    static MiSnap g(k k1)
    {
        return k1.i;
    }

    static byte[] h(k k1)
    {
        return k1.v;
    }

    static void i(k k1)
    {
        boolean flag1 = false;
        (new StringBuilder("evaluating frame:focusing")).append(k1.y).toString();
        boolean flag;
        if (!k1.x && !k1.y)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && k1.i.a.b())
        {
            flag = flag1;
            if (k1.i.c != null)
            {
                flag = flag1;
                if (k1.r())
                {
                    flag = true;
                }
            }
        }
        (new StringBuilder("evaluation result: ")).append(flag).toString();
        if (flag)
        {
            k1.t();
            return;
        } else
        {
            k1.a = true;
            k1.l.postDelayed(k1.f, 1000L);
            return;
        }
    }

    private android.hardware.Camera.Parameters m()
    {
        try
        {
            if (s == null && r != null)
            {
                s = r.getParameters();
            }
        }
        catch (Exception exception)
        {
            s = null;
            return null;
        }
        return s;
    }

    private boolean n()
    {
        return i != null && i.k;
    }

    private void o()
    {
        this;
        JVM INSTR monitorenter ;
        v = null;
        Exception exception;
        try
        {
            if (r != null)
            {
                r.setPreviewCallback(null);
                r.stopPreview();
                r.release();
                r = null;
                e = false;
            }
        }
        catch (Exception exception1) { }
        this;
        JVM INSTR monitorexit ;
        return;
        exception;
        throw exception;
    }

    private void p()
    {
        android.hardware.Camera.Parameters parameters;
        try
        {
            parameters = m();
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return;
        }
        if (parameters == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        if (q())
        {
            parameters.setFlashMode("auto");
            if (r != null)
            {
                r.setParameters(parameters);
            }
        }
    }

    private boolean q()
    {
        if (r == null)
        {
            return false;
        }
        Object obj = r.getParameters();
        if (obj == null || ((android.hardware.Camera.Parameters) (obj)).getFlashMode() == null)
        {
            return false;
        }
        obj = ((android.hardware.Camera.Parameters) (obj)).getSupportedFlashModes();
        return obj != null && !((List) (obj)).isEmpty() && (((List) (obj)).size() != 1 || !((String)((List) (obj)).get(0)).equals("off"));
    }

    private boolean r()
    {
        boolean flag2;
label0:
        {
            flag2 = false;
            synchronized (i.g)
            {
                if (!i.f())
                {
                    break label0;
                }
            }
            return false;
        }
        if (i.c != null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        obj;
        JVM INSTR monitorexit ;
        return false;
        exception;
        throw exception;
        boolean flag;
        boolean flag1;
        if (i.c.l() != null && 5 == i.c.l().size() && (i.c.b() || i.c.c()) && i.c.a() && i.c.d() && i.c.e())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        A = 0;
        flag1 = flag2;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_179;
        }
        flag1 = flag2;
        if (!i.f())
        {
            flag1 = true;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag1;
    }

    private void s()
    {
        l.removeCallbacks(f);
        j.q();
        w = System.currentTimeMillis();
        x = true;
        try
        {
            r.takePicture(null, null, null, this);
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        i.a(0, null, "VideoCaptureFailed");
    }

    private void t()
    {
        boolean flag1 = false;
        boolean flag;
        if (z)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (z || flag && A + 1 >= i.a.d())
        {
            l.removeCallbacks(f);
            r.setPreviewCallback(null);
        }
        if (z)
        {
            flag = true;
        } else
        if (flag)
        {
            boolean flag2;
            if (i.a.b())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                A = A + 1;
                i.a(R.string.uxp_measured_videoframe);
            }
            flag2 = false;
            flag1 = flag;
            flag = flag2;
        } else
        {
            flag = false;
        }
        if (!flag1) goto _L2; else goto _L1
_L1:
        if (A < i.a.d()) goto _L4; else goto _L3
_L3:
        x = true;
        l.removeCallbacks(f);
        a();
        if (i.a.b())
        {
            i.a(R.string.uxp_capture_time);
        }
        a(i);
        k.b();
_L6:
        return;
_L4:
        i.a(R.string.uxp_consecutive_frame_count, A);
        return;
_L2:
        if (!i.f())
        {
            if (flag)
            {
                s();
                return;
            }
            if (!i.f())
            {
                r.setPreviewCallback(this);
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    final void a()
    {
        try
        {
            u = true;
            x = true;
            if (j != null)
            {
                j.o();
            }
            if (r != null)
            {
                r.setPreviewCallback(null);
                r.stopPreview();
            }
            l.removeCallbacks(f);
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    final void a(MitekAnalyzer mitekanalyzer)
    {
        j = mitekanalyzer;
    }

    public final void a(t t1)
    {
        k = t1;
    }

    final void a(boolean flag)
    {
        Object obj;
        android.hardware.Camera.Parameters parameters;
        try
        {
            parameters = m();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
        if (parameters == null) goto _L2; else goto _L1
_L1:
        if (parameters.getFlashMode() == null)
        {
            return;
        }
        if (!e()) goto _L2; else goto _L3
_L3:
        if (!flag) goto _L5; else goto _L4
_L4:
        obj = "torch";
_L10:
        parameters.setFlashMode(((String) (obj)));
        r.setParameters(parameters);
        return;
_L5:
        if (!Build.MODEL.contains("Behold II")) goto _L7; else goto _L6
_L6:
        parameters.set("flash-value", 1);
          goto _L8
_L7:
        parameters.set("flash-value", 2);
          goto _L8
_L2:
        return;
_L8:
        obj = "off";
        if (true) goto _L10; else goto _L9
_L9:
    }

    final void b()
    {
        x = false;
        y = false;
        if (i.a.b())
        {
            u = false;
        }
        if (j != null)
        {
            j.p();
        }
        if (!i.a.b())
        {
            l.removeCallbacks(f);
            u = true;
        }
    }

    final void b(boolean flag)
    {
        if (i != null)
        {
            if (i.c != null)
            {
                i.c.i = true;
            }
            a(flag);
            i.x = flag;
            if (l != null && k != null && i.a != null && i.a.b())
            {
                l.postDelayed(k.o, i.a.H());
            }
        }
    }

    final void c()
    {
        try
        {
            if (n() && r != null)
            {
                r.autoFocus(this);
                y = true;
            }
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }

    final void d()
    {
        if (k != null)
        {
            b(k);
            if (!i.a.b())
            {
                break MISSING_BLOCK_LABEL_96;
            }
            k.l();
        }
_L1:
        if (r != null)
        {
            r.setPreviewDisplay(getHolder());
            r.startPreview();
            if (i.a.b())
            {
                p = false;
                r.setPreviewCallback(this);
            }
        }
        B.sendEmptyMessage(18);
        return;
        try
        {
            k.n();
        }
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
            return;
        }
          goto _L1
    }

    final boolean e()
    {
        Object obj;
        obj = m();
        if (obj != null)
        {
            obj = ((android.hardware.Camera.Parameters) (obj)).getSupportedFlashModes();
        } else
        {
            obj = null;
        }
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = ((List) (obj)).iterator();
_L4:
        if (((Iterator) (obj)).hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        return false;
        if (!"torch".equals((String)((Iterator) (obj)).next())) goto _L4; else goto _L3
_L3:
        return true;
    }

    public final void f()
    {
        if (l != null)
        {
            l.postDelayed(g, 1000L);
            if (B != null && !k.g())
            {
                B.sendEmptyMessageDelayed(16, 2000L);
            } else
            if (B != null && k.g())
            {
                B.sendEmptyMessage(16);
                return;
            }
        }
    }

    public final void g()
    {
        if (k != null && i.a.b())
        {
            e = true;
            if (B != null && k.d() == 0)
            {
                B.sendEmptyMessageDelayed(16, 2000L);
            } else
            if (B != null && k.d() != 0)
            {
                B.sendEmptyMessage(16);
                return;
            }
        }
    }

    final String h()
    {
        JSONObject jsonobject;
        jsonobject = new JSONObject();
        jsonobject.put("MiSnapVersion", i.getString(R.string.misnap_versionName));
        jsonobject.put("BarcodeLibVersion", "MiSnap237_no_libs");
        if ("".equals(i.a.e)) goto _L2; else goto _L1
_L1:
        jsonobject.put("ServerVersion", i.a.e);
_L16:
        jsonobject.put("Platform", "Android");
        jsonobject.put("OS", android.os.Build.VERSION.RELEASE);
        jsonobject.put("Manufacturer", Build.MANUFACTURER);
        jsonobject.put("Model", Build.MODEL);
        jsonobject.put("Device", Build.DEVICE);
        jsonobject.put("MibiVersion", "1.2");
        if (r == null || m() == null) goto _L4; else goto _L3
_L3:
        if (q()) goto _L6; else goto _L5
_L5:
        jsonobject.put("Flash", "NA");
_L4:
        Object obj = i.getWindowManager().getDefaultDisplay();
        if (((Display) (obj)).getWidth() < ((Display) (obj)).getHeight())
        {
            obj = "Portrait";
        } else
        {
            obj = "Landscape";
        }
        jsonobject.put("Orientation", obj);
        if (i.a.b())
        {
            obj = "2";
        } else
        {
            obj = "1";
        }
        jsonobject.put("CaptureMode", obj);
        jsonobject.put("Document", i.a.n());
        if (i.a.aB() != null)
        {
            obj = new JSONObject(i.a.aB().toString());
            ((JSONObject) (obj)).remove("RequiredMaxImageSize");
            ((JSONObject) (obj)).remove("CameraViewFinderMinVericalFill");
            ((JSONObject) (obj)).remove("TutorialBrandNewUserDuration");
            ((JSONObject) (obj)).remove("SecurityResult");
            jsonobject.put("Parameters", obj);
        }
        if (i.d != null)
        {
            jsonobject.put("UXP", i.d.a());
        }
        return jsonobject.toString();
_L2:
        if (!"".equals(i.a.c))
        {
            jsonobject.put("ServerVersion", i.a.c);
        }
        continue; /* Loop/switch isn't completed */
_L6:
        obj = m().getFlashMode();
        if (obj == null) goto _L8; else goto _L7
_L7:
        if (!"torch".equals(obj)) goto _L10; else goto _L9
_L9:
        jsonobject.put("Flash", "ON");
_L8:
        if (!i.a.b())
        {
            break MISSING_BLOCK_LABEL_536;
        }
        obj = m().getPreviewSize();
_L14:
        jsonobject.put("OriginalWidth", String.valueOf(((android.hardware.Camera.Size) (obj)).width));
        jsonobject.put("OriginalHeight", String.valueOf(((android.hardware.Camera.Size) (obj)).height));
          goto _L4
_L10:
        if (!"off".equals(obj)) goto _L12; else goto _L11
_L11:
        jsonobject.put("Flash", "OFF");
          goto _L8
_L12:
        if (!"auto".equals(obj)) goto _L8; else goto _L13
_L13:
        jsonobject.put("Flash", "AUTO");
          goto _L8
        obj = t;
          goto _L14
        obj;
        return "";
        if (true) goto _L16; else goto _L15
_L15:
    }

    final void i()
    {
        int i1 = i.a.f();
        byte abyte0[];
        Intent intent;
        if (i.a.b())
        {
            abyte0 = a(i1);
        } else
        {
            abyte0 = b(i1);
        }
        abyte0 = a(a(abyte0, h()));
        intent = new Intent();
        intent.putExtra("com.miteksystems.misnap.PICTURE", abyte0);
        intent.putExtra("com.miteksystems.misnap.MIBI_DATA", h());
        if (i.a.b())
        {
            intent.putExtra("com.miteksystems.misnap.HEIGHT", d);
            intent.putExtra("com.miteksystems.misnap.WIDTH", c);
        } else
        {
            intent.putExtra("com.miteksystems.misnap.HEIGHT", t.height);
            intent.putExtra("com.miteksystems.misnap.WIDTH", t.width);
        }
        intent.putExtra("com.miteksystems.misnap.QUALITY", i.a.f());
        if (i.a.b())
        {
            i.a(-1, intent, "SuccessVideo");
            return;
        } else
        {
            i.a(-1, intent, "SuccessStillCamera");
            return;
        }
    }

    public final void j()
    {
        if (i.a.b())
        {
            break MISSING_BLOCK_LABEL_71;
        }
        z = true;
        if (k != null)
        {
            k.k();
        }
        if (!n())
        {
            break MISSING_BLOCK_LABEL_63;
        }
        r.autoFocus(this);
        y = true;
_L2:
        i.a(R.string.uxp_capture_manual);
        return;
        s();
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
    }

    final void k()
    {
        l.removeCallbacks(h);
        l.removeCallbacks(f);
        o();
        k = null;
        j = null;
    }

    public final void l()
    {
        A = 0;
    }

    public final void onAutoFocus(boolean flag, Camera camera)
    {
        if (i.a.b() && e)
        {
            e = false;
            B.sendEmptyMessage(14);
        }
        y = false;
        a = false;
        if (!x && z)
        {
            t();
        }
    }

    public final void onError(int i1, Camera camera)
    {
    }

    public final void onPictureTaken(byte abyte0[], Camera camera)
    {
        q = abyte0;
        a();
        i.a(R.string.uxp_capture_time);
        w = System.currentTimeMillis() - w;
        a(i);
        k.b();
    }

    public final void onPreviewFrame(byte abyte0[], Camera camera)
    {
        this;
        JVM INSTR monitorenter ;
        (new StringBuilder("onPreviewFrame:")).append(u).append(": focussing?:").append(y).append("-mFocusRequestSent:").append(a).toString();
        if (!y && !u && !a && i.a.b())
        {
            u = true;
            if (!p && i.a.b() && n())
            {
                l.post(f);
                p = true;
            }
            if (b == null)
            {
                android.hardware.Camera.Size size = m().getPreviewSize();
                c = size.width;
                d = size.height;
            }
            b = camera;
            v = (byte[])abyte0.clone();
            l.post(h);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        throw abyte0;
    }

    public final boolean onTouchEvent(MotionEvent motionevent)
    {
        switch (motionevent.getAction())
        {
        default:
            return false;

        case 0: // '\0'
            i.a(R.string.uxp_touch_screen);
            break;
        }
        return true;
    }

    public final void surfaceChanged(SurfaceHolder surfaceholder, int i1, int j1, int k1)
    {
        if (r == null)
        {
            return;
        } else
        {
            l.post(new com.miteksystems.misnap.o(this, surfaceholder, j1, k1));
            return;
        }
    }

    public final void surfaceCreated(SurfaceHolder surfaceholder)
    {
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
        if (k != null)
        {
            k.j();
        }
        o();
    }

}
