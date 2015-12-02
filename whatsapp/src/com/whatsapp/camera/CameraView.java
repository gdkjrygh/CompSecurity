// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.camera;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.hardware.Camera;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.support.v4.view.GestureDetectorCompat;
import android.util.AttributeSet;
import android.view.Display;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.WindowManager;
import com.whatsapp.util.Log;
import com.whatsapp.util.bk;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.whatsapp.camera:
//            CameraActivity, r, i, a_, 
//            w, e, o, v, 
//            s

public class CameraView extends SurfaceView
    implements android.view.SurfaceHolder.Callback, android.view.GestureDetector.OnGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
{

    private static String c[];
    private static String j[];
    private static final String z[];
    private android.hardware.Camera.Size a;
    private int b;
    private GestureDetectorCompat d;
    private boolean e;
    private Camera f;
    private String g;
    private int h;
    private List i;
    private android.hardware.Camera.Size k;
    private boolean l;
    private boolean m;
    private boolean n;
    private float o;
    private w p;
    private SurfaceHolder q;
    private MediaRecorder r;
    private ScaleGestureDetector s;

    public CameraView(Context context)
    {
        this(context, null);
    }

    public CameraView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public CameraView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        o = 1.0F;
        attributeset = context.getSharedPreferences(z[11], 0);
        try
        {
            b = attributeset.getInt(z[13], 0);
            g = attributeset.getString(z[12], null);
            q = getHolder();
            q.addCallback(this);
            q.setType(3);
            d = new GestureDetectorCompat(context, this, null);
            if (android.os.Build.VERSION.SDK_INT >= 8)
            {
                s = new ScaleGestureDetector(context, this);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
    }

    public static android.hardware.Camera.Size a(List list, int i1, int j1)
    {
        double d2;
        int k1;
        k1 = CameraActivity.n;
        d2 = (double)i1 / (double)j1;
        if (list != null) goto _L2; else goto _L1
_L1:
        Object obj1 = null;
_L4:
        return ((android.hardware.Camera.Size) (obj1));
_L2:
        double d1;
        Object obj;
        Iterator iterator;
        iterator = list.iterator();
        obj = null;
        d1 = 1.7976931348623157E+308D;
_L9:
        do
        {
            do
            {
                if (!iterator.hasNext())
                {
                    break MISSING_BLOCK_LABEL_406;
                }
                obj1 = (android.hardware.Camera.Size)iterator.next();
                double d3 = (double)((android.hardware.Camera.Size) (obj1)).width / (double)((android.hardware.Camera.Size) (obj1)).height;
                double d4 = (double)((android.hardware.Camera.Size) (obj1)).width / (double)i1;
                int l1;
                int i2;
                try
                {
                    l1 = ((android.hardware.Camera.Size) (obj1)).width;
                    i2 = ((android.hardware.Camera.Size) (obj1)).height;
                }
                // Misplaced declaration of an exception variable
                catch (List list)
                {
                    throw list;
                }
            } while (l1 * i2 < 0x25800 && k1 == 0 || d4 > 1.5D && k1 == 0);
            try
            {
                d3 = Math.abs(d3 - d2);
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                throw list;
            }
        } while (d3 > 0.10000000000000001D && k1 == 0);
        if ((double)Math.abs(((android.hardware.Camera.Size) (obj1)).height - j1) < d1)
        {
            d1 = Math.abs(((android.hardware.Camera.Size) (obj1)).height - j1);
        } else
        {
            obj1 = obj;
        }
        if (k1 == 0)
        {
            break MISSING_BLOCK_LABEL_413;
        }
_L8:
        obj = obj1;
        if (obj1 == null)
        {
            iterator = list.iterator();
            obj = obj1;
            d1 = 1.7976931348623157E+308D;
label0:
            do
            {
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    obj1 = (android.hardware.Camera.Size)iterator.next();
                } while ((double)((android.hardware.Camera.Size) (obj1)).width / (double)i1 > 1.5D && k1 == 0);
                if ((double)Math.abs(((android.hardware.Camera.Size) (obj1)).height - j1) < d1)
                {
                    d1 = Math.abs(((android.hardware.Camera.Size) (obj1)).height - j1);
                    obj = obj1;
                }
            } while (k1 == 0);
        }
        obj1 = obj;
        if (obj != null) goto _L4; else goto _L3
_L3:
        iterator = list.iterator();
        list = ((List) (obj));
        d1 = 1.7976931348623157E+308D;
_L7:
        if (!iterator.hasNext()) goto _L6; else goto _L5
_L5:
        obj = (android.hardware.Camera.Size)iterator.next();
        if ((double)Math.abs(((android.hardware.Camera.Size) (obj)).height - j1) < d1)
        {
            d1 = Math.abs(((android.hardware.Camera.Size) (obj)).height - j1);
            list = ((List) (obj));
        }
        obj1 = list;
        if (k1 != 0) goto _L4; else goto _L7
_L6:
        return list;
        obj1 = obj;
          goto _L8
        obj = obj1;
          goto _L9
    }

    static Camera a(CameraView cameraview, Camera camera)
    {
        cameraview.f = camera;
        return camera;
    }

    private static String a(List list)
    {
        int i1 = CameraActivity.n;
        StringBuilder stringbuilder = new StringBuilder();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            android.hardware.Camera.Size size = (android.hardware.Camera.Size)list.next();
            stringbuilder.append(size.width).append('x').append(size.height).append(z[74]);
        } while (i1 == 0);
        try
        {
            if (stringbuilder.length() > 1)
            {
                stringbuilder.deleteCharAt(stringbuilder.length() - 2);
            }
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            throw list;
        }
        return stringbuilder.toString();
    }

    static boolean a(CameraView cameraview)
    {
        return cameraview.l;
    }

    static boolean a(CameraView cameraview, boolean flag)
    {
        cameraview.l = flag;
        return flag;
    }

    static w b(CameraView cameraview)
    {
        return cameraview.p;
    }

    private boolean b(File file)
    {
        CamcorderProfile camcorderprofile;
        int i2;
        i2 = CameraActivity.n;
        Log.i((new StringBuilder()).append(z[28]).append(m).toString());
        r = new MediaRecorder();
        camcorderprofile = null;
        if (android.os.Build.VERSION.SDK_INT < 8) goto _L2; else goto _L1
_L1:
        int i1 = android.os.Build.VERSION.SDK_INT;
        if (i1 >= 11)
        {
            boolean flag;
            try
            {
                flag = CamcorderProfile.hasProfile(b, 4);
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                throw file;
            }
            if (flag)
            {
                camcorderprofile = CamcorderProfile.get(b, 4);
            } else
            if (CamcorderProfile.hasProfile(b, 5))
            {
                camcorderprofile = CamcorderProfile.get(b, 5);
            } else
            {
                camcorderprofile = CamcorderProfile.get(b, 1);
            }
        } else
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            camcorderprofile = CamcorderProfile.get(b, 1);
        } else
        {
            camcorderprofile = CamcorderProfile.get(1);
        }
        if (camcorderprofile == null)
        {
            try
            {
                Log.e(z[51]);
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                throw file;
            }
            return false;
        }
        break MISSING_BLOCK_LABEL_185;
        file;
        throw file;
        Object obj;
        Object obj3;
        android.hardware.Camera.Parameters parameters;
        Log.i((new StringBuilder()).append(z[36]).append(camcorderprofile.videoFrameWidth).append("x").append(camcorderprofile.videoFrameHeight).append(z[53]).append(camcorderprofile.videoCodec).append(z[38]).append(camcorderprofile.audioCodec).append(z[27]).append(camcorderprofile.fileFormat).append(z[39]).append(camcorderprofile.videoFrameRate).append(z[48]).append(camcorderprofile.videoBitRate).toString());
        parameters = f.getParameters();
        obj3 = parameters.getSupportedPreviewSizes();
        if (obj3 == null)
        {
            obj3 = i();
        }
        obj = null;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            obj = parameters.getSupportedVideoSizes();
        }
        if (obj == null)
        {
            obj = obj3;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_387;
        }
        boolean flag1 = ((List) (obj)).isEmpty();
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_404;
        }
        try
        {
            Log.e(z[54]);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw file;
        }
        return false;
        file;
        throw file;
        int j1 = 0x7fffffff;
        if (android.os.Build.VERSION.SDK_INT < 11) goto _L4; else goto _L3
_L3:
        Object obj1;
        obj1 = parameters.getPreferredPreviewSizeForVideo();
        i1 = j1;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_537;
        }
        Log.i((new StringBuilder()).append(z[43]).append(((android.hardware.Camera.Size) (obj1)).width).append("x").append(((android.hardware.Camera.Size) (obj1)).height).toString());
        i1 = ((android.hardware.Camera.Size) (obj1)).width;
        Object obj2;
        Object obj4;
        if (i1 == 176)
        {
            Iterator iterator;
            int j2;
            try
            {
                j2 = ((android.hardware.Camera.Size) (obj1)).height;
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                throw file;
            }
            i1 = j1;
            if (j2 == 144)
            {
                break MISSING_BLOCK_LABEL_546;
            }
        }
        j1 = ((android.hardware.Camera.Size) (obj1)).width * ((android.hardware.Camera.Size) (obj1)).height;
        i1 = j1;
        if (i2 == 0)
        {
            break MISSING_BLOCK_LABEL_546;
        }
        i1 = j1;
        try
        {
            Log.w(z[41]);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw file;
        }
_L64:
        Log.i((new StringBuilder()).append(z[29]).append(a(((List) (obj)))).toString());
        Log.i((new StringBuilder()).append(z[37]).append(a(((List) (obj3)))).toString());
        iterator = ((List) (obj)).iterator();
        obj = null;
_L20:
        obj2 = obj;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = (android.hardware.Camera.Size)iterator.next();
        obj4 = obj;
        if (((android.hardware.Camera.Size) (obj2)).height > 480) goto _L6; else goto _L5
_L5:
        j1 = ((android.hardware.Camera.Size) (obj2)).width;
        obj4 = obj;
        if (j1 > 720) goto _L6; else goto _L7
_L7:
        j1 = ((android.hardware.Camera.Size) (obj2)).height;
        j2 = camcorderprofile.videoFrameHeight;
        obj4 = obj;
        if (j1 > j2) goto _L6; else goto _L8
_L8:
        j1 = ((android.hardware.Camera.Size) (obj2)).width;
        j2 = camcorderprofile.videoFrameWidth;
        obj4 = obj;
        if (j1 > j2) goto _L6; else goto _L9
_L9:
        obj4 = obj;
        if (obj != null) goto _L11; else goto _L10
_L10:
        obj = obj2;
        if (i2 == 0) goto _L13; else goto _L12
_L12:
        obj4 = obj2;
_L11:
        try
        {
            j1 = ((android.hardware.Camera.Size) (obj2)).height;
            j2 = ((android.hardware.Camera.Size) (obj4)).height;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw file;
        }
        obj = obj4;
        if (j1 <= j2) goto _L15; else goto _L14
_L14:
        obj = obj2;
        if (i2 == 0) goto _L13; else goto _L16
_L16:
        obj = obj2;
_L15:
        j1 = ((android.hardware.Camera.Size) (obj2)).height;
        j2 = ((android.hardware.Camera.Size) (obj)).height;
        obj4 = obj;
        if (j1 != j2) goto _L6; else goto _L17
_L17:
        try
        {
            j1 = ((android.hardware.Camera.Size) (obj2)).width;
            j2 = ((android.hardware.Camera.Size) (obj)).width;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw file;
        }
        obj4 = obj;
        if (j1 <= j2) goto _L6; else goto _L18
_L18:
        obj = obj2;
_L13:
        if (i2 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj2 = obj;
        break; /* Loop/switch isn't completed */
        if (true) goto _L20; else goto _L19
_L19:
        if (obj2 == null)
        {
            try
            {
                Log.e(z[35]);
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                throw file;
            }
            return false;
        }
        break MISSING_BLOCK_LABEL_900;
        file;
        throw file;
        file;
        try
        {
            throw file;
        }
        // Misplaced declaration of an exception variable
        catch (File file) { }
        try
        {
            throw file;
        }
        // Misplaced declaration of an exception variable
        catch (File file) { }
        try
        {
            throw file;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw file;
        }
        file;
        throw file;
        obj4 = ((List) (obj3)).iterator();
_L24:
        if (!((Iterator) (obj4)).hasNext()) goto _L22; else goto _L21
_L21:
        obj = (android.hardware.Camera.Size)((Iterator) (obj4)).next();
        if (!((android.hardware.Camera.Size) (obj2)).equals(obj)) goto _L24; else goto _L23
_L23:
        if (!m) goto _L26; else goto _L25
_L25:
        j1 = android.os.Build.VERSION.SDK_INT;
        if (j1 < 17) goto _L26; else goto _L27
_L27:
        j1 = android.os.Build.VERSION.SDK_INT;
        if (j1 > 19) goto _L26; else goto _L28
_L28:
        flag1 = z[42].equals(Build.MANUFACTURER);
        if (!flag1) goto _L26; else goto _L29
_L29:
        double d1;
        double d2;
        double d3;
        double d4;
        Object obj5;
        Iterator iterator1;
        int k2;
        try
        {
            flag1 = bk.a(c, Build.MODEL);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw file;
        }
        if (!flag1) goto _L26; else goto _L30
_L30:
        obj = f;
        obj.getClass();
        obj = new android.hardware.Camera.Size(((Camera) (obj)), 1440, 1080);
        obj2 = f;
        obj2.getClass();
        obj5 = new android.hardware.Camera.Size(((Camera) (obj2)), 640, 480);
_L62:
        obj4 = obj;
        if (obj != null) goto _L32; else goto _L31
_L31:
        d1 = 1.7976931348623157E+308D;
        d4 = (double)((android.hardware.Camera.Size) (obj5)).width / (double)((android.hardware.Camera.Size) (obj5)).height;
        iterator1 = ((List) (obj3)).iterator();
_L43:
        if (!iterator1.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj4 = (android.hardware.Camera.Size)iterator1.next();
        d3 = d1;
        obj2 = obj;
        if (((android.hardware.Camera.Size) (obj4)).width < ((android.hardware.Camera.Size) (obj5)).width) goto _L34; else goto _L33
_L33:
        j1 = ((android.hardware.Camera.Size) (obj4)).height;
        k2 = ((android.hardware.Camera.Size) (obj5)).height;
        d3 = d1;
        obj2 = obj;
        if (j1 < k2) goto _L34; else goto _L35
_L35:
        double d5;
        double d6;
        int k1;
        int l2;
        try
        {
            k1 = ((android.hardware.Camera.Size) (obj4)).height;
            l2 = ((android.hardware.Camera.Size) (obj4)).width;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw file;
        }
        d3 = d1;
        obj2 = obj;
        if (k1 * l2 > i1) goto _L34; else goto _L36
_L36:
        d2 = (double)((android.hardware.Camera.Size) (obj4)).width / (double)((android.hardware.Camera.Size) (obj4)).height;
        obj2 = obj;
        if (obj != null) goto _L38; else goto _L37
_L37:
        if (i2 == 0) goto _L40; else goto _L39
_L39:
        d1 = d2;
        obj2 = obj4;
_L38:
        try
        {
            d5 = Math.abs(d4 - d2);
            d6 = Math.abs(d4 - d1);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw file;
        }
        d3 = d1;
        if (d5 >= d6) goto _L34; else goto _L41
_L41:
        d1 = d2;
        obj = obj4;
_L61:
        if (i2 == 0) goto _L43; else goto _L42
_L42:
        obj2 = obj;
        if (obj != null) goto _L45; else goto _L44
_L44:
        Log.i(z[34]);
        obj4 = ((List) (obj3)).iterator();
_L56:
        if (!((Iterator) (obj4)).hasNext()) goto _L47; else goto _L46
_L46:
        obj2 = (android.hardware.Camera.Size)((Iterator) (obj4)).next();
        obj3 = obj;
        d3 = d1;
        if (((android.hardware.Camera.Size) (obj2)).height * ((android.hardware.Camera.Size) (obj2)).width > i1) goto _L49; else goto _L48
_L48:
        d2 = (double)((android.hardware.Camera.Size) (obj2)).width / (double)((android.hardware.Camera.Size) (obj2)).height;
        obj3 = obj;
        if (obj != null) goto _L51; else goto _L50
_L50:
        if (i2 == 0) goto _L53; else goto _L52
_L52:
        d1 = d2;
        obj3 = obj2;
_L51:
        try
        {
            d5 = Math.abs(d4 - d2);
            d6 = Math.abs(d4 - d1);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw file;
        }
        d3 = d1;
        if (d5 >= d6) goto _L49; else goto _L54
_L54:
        obj = obj2;
        d1 = d2;
_L60:
        if (i2 == 0) goto _L56; else goto _L55
_L55:
        obj2 = obj;
_L45:
        obj4 = obj2;
        if (obj2 != null) goto _L32; else goto _L57
_L57:
        Log.i(z[49]);
_L59:
        if (obj1 == null)
        {
            try
            {
                Log.e(z[24]);
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                throw file;
            }
            return false;
        }
        break MISSING_BLOCK_LABEL_1496;
        file;
        try
        {
            throw file;
        }
        // Misplaced declaration of an exception variable
        catch (File file) { }
        try
        {
            throw file;
        }
        // Misplaced declaration of an exception variable
        catch (File file) { }
        throw file;
        file;
        throw file;
        camcorderprofile.videoFrameWidth = ((android.hardware.Camera.Size) (obj5)).width;
        camcorderprofile.videoFrameHeight = ((android.hardware.Camera.Size) (obj5)).height;
        camcorderprofile.videoBitRate = camcorderprofile.videoFrameWidth * camcorderprofile.videoFrameHeight * 4;
        Log.i((new StringBuilder()).append(z[30]).append(camcorderprofile.videoFrameWidth).append("x").append(camcorderprofile.videoFrameHeight).append(z[25]).append(camcorderprofile.videoBitRate).append(z[47]).append(((android.hardware.Camera.Size) (obj1)).width).append("x").append(((android.hardware.Camera.Size) (obj1)).height).toString());
        parameters.set(z[32], 1);
        obj = parameters.getSupportedFocusModes();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_1757;
        }
        Log.i((new StringBuilder()).append(z[40]).append(Arrays.deepToString(((List) (obj)).toArray())).toString());
        flag1 = ((List) (obj)).contains(z[46]);
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_1721;
        }
        parameters.setFocusMode(z[44]);
        if (i2 == 0)
        {
            break MISSING_BLOCK_LABEL_1766;
        }
        flag1 = ((List) (obj)).contains(z[50]);
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_1766;
        }
        parameters.setFocusMode(z[45]);
        if (i2 == 0)
        {
            break MISSING_BLOCK_LABEL_1766;
        }
        try
        {
            Log.i(z[31]);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw file;
        }
        try
        {
            a = ((android.hardware.Camera.Size) (obj1));
            parameters.setPreviewSize(((android.hardware.Camera.Size) (obj1)).width, ((android.hardware.Camera.Size) (obj1)).height);
            flag1 = ((android.hardware.Camera.Size) (obj1)).equals(k);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw file;
        }
        if (!flag1)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            try
            {
                f.stopPreview();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                throw file;
            }
        }
        try
        {
            f.setParameters(parameters);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw file;
        }
        if (i1 == 0) goto _L2; else goto _L58
_L58:
        Log.i(z[52]);
        int l1;
        boolean flag2;
        try
        {
            f.setPreviewDisplay(q);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.a(z[33], ((Throwable) (obj)));
        }
        f.startPreview();
        requestLayout();
_L2:
        f.unlock();
        r.setCamera(f);
        r.setAudioSource(5);
        r.setVideoSource(1);
        if (android.os.Build.VERSION.SDK_INT < 8)
        {
            break MISSING_BLOCK_LABEL_1919;
        }
        r.setProfile(camcorderprofile);
        if (i2 == 0)
        {
            break MISSING_BLOCK_LABEL_1943;
        }
        try
        {
            r.setOutputFormat(2);
            r.setAudioEncoder(0);
            r.setVideoEncoder(0);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw file;
        }
        r.setOutputFile(file.getAbsolutePath());
        r.setPreviewDisplay(getHolder().getSurface());
        if (android.os.Build.VERSION.SDK_INT < 9)
        {
            break MISSING_BLOCK_LABEL_2067;
        }
        l1 = g();
        i1 = l1;
        if (!m)
        {
            break MISSING_BLOCK_LABEL_2058;
        }
        i1 = android.os.Build.VERSION.SDK_INT;
        if (i1 == 14)
        {
            break MISSING_BLOCK_LABEL_2023;
        }
        i2 = android.os.Build.VERSION.SDK_INT;
        i1 = l1;
        if (i2 != 15)
        {
            break MISSING_BLOCK_LABEL_2058;
        }
        try
        {
            flag2 = Build.MANUFACTURER.equals(z[26]);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw file;
        }
        i1 = l1;
        if (flag2)
        {
            i1 = (360 - l1) % 360;
        }
        r.setOrientationHint(i1);
        try
        {
            r.prepare();
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            h();
            l();
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            h();
            l();
            return false;
        }
        return true;
        file;
        try
        {
            throw file;
        }
        // Misplaced declaration of an exception variable
        catch (File file) { }
        try
        {
            throw file;
        }
        // Misplaced declaration of an exception variable
        catch (File file) { }
        try
        {
            throw file;
        }
        // Misplaced declaration of an exception variable
        catch (File file) { }
        throw file;
        file;
        throw file;
        file;
        try
        {
            throw file;
        }
        // Misplaced declaration of an exception variable
        catch (File file) { }
        throw file;
_L32:
        obj1 = obj4;
        if (true) goto _L59; else goto _L49
_L49:
        obj = obj3;
        d1 = d3;
          goto _L60
_L53:
        obj = obj2;
        d1 = d2;
          goto _L60
_L47:
        obj2 = obj;
          goto _L45
_L34:
        obj = obj2;
        d1 = d3;
          goto _L61
_L40:
        d1 = d2;
        obj = obj4;
          goto _L61
        if (true) goto _L43; else goto _L26
_L26:
        obj5 = obj2;
        if (true) goto _L62; else goto _L22
_L22:
        obj = null;
        if (true) goto _L23; else goto _L6
_L6:
        obj = obj4;
          goto _L13
_L4:
        i1 = 0x7fffffff;
        obj1 = null;
        if (true) goto _L64; else goto _L63
_L63:
    }

    static SurfaceHolder c(CameraView cameraview)
    {
        return cameraview.q;
    }

    private void c()
    {
        int i1;
        i1 = CameraActivity.n;
        o = 1.0F;
        h = 0;
        i = null;
        if (f != null) goto _L2; else goto _L1
_L1:
        int j1;
        int k1;
        if (android.os.Build.VERSION.SDK_INT < 9)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        j1 = b;
        k1 = Camera.getNumberOfCameras();
        if (j1 < k1)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        b = Camera.getNumberOfCameras() - 1;
        f = Camera.open(b);
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        f = Camera.open();
        f.setErrorCallback(new r(this));
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
                    if (f != null)
                    {
                        f.release();
                    }
                }
                catch (Exception exception2)
                {
                    throw exception2;
                }
            }
        }
        f = null;
        Log.a(z[67], ((Throwable) (obj)));
        l();
        if (i1 == 0) goto _L3; else goto _L2
_L2:
        j1 = android.os.Build.VERSION.SDK_INT;
        if (j1 < 8)
        {
            break; /* Loop/switch isn't completed */
        }
        Exception exception3;
        try
        {
            f.reconnect();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            try
            {
                f.release();
                f = null;
                Log.a(z[68], ((Throwable) (obj)));
                l();
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
        if (i1 == 0) goto _L3; else goto _L4
_L4:
        f.release();
        f = null;
        c();
        return;
        obj;
        throw obj;
        exception3;
        throw exception3;
    }

    private void d()
    {
        Log.i(z[76]);
        if (f != null)
        {
            try
            {
                f.stopPreview();
            }
            catch (Exception exception)
            {
                Log.c(z[75], exception);
            }
            try
            {
                f.release();
            }
            catch (Exception exception1)
            {
                Log.c(z[77], exception1);
            }
            f = null;
        }
    }

    static void d(CameraView cameraview)
    {
        cameraview.d();
    }

    static void e(CameraView cameraview)
    {
        cameraview.f();
    }

    private void f()
    {
        int i1;
        int j1;
        boolean flag;
        boolean flag1;
        int i2;
        flag = true;
        flag1 = true;
        i2 = CameraActivity.n;
        i1 = getWidth();
        j1 = getHeight();
        if (f != null) goto _L2; else goto _L1
_L1:
        Log.e(z[104]);
        l();
_L41:
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        throw runtimeexception;
_L2:
label0:
        {
            float f1;
            float f2;
            android.hardware.Camera.Parameters parameters;
            int k1;
            int l1;
label1:
            {
                Object obj2 = ((WindowManager)getContext().getSystemService(z[90])).getDefaultDisplay();
                int j2 = ((Display) (obj2)).getOrientation();
                List list;
                if (j2 == 0 || j2 == 2)
                {
                    k1 = 1;
                } else
                {
                    k1 = 0;
                }
                parameters = f.getParameters();
                list = parameters.getSupportedPreviewSizes();
                if (list == null)
                {
                    list = i();
                }
                if (k1 != 0)
                {
                    l1 = j1;
                } else
                {
                    l1 = i1;
                }
                if (k1 == 0)
                {
                    i1 = j1;
                }
                try
                {
                    k = a(list, l1, i1);
                    if (g == null)
                    {
                        g = parameters.getFlashMode();
                    }
                }
                catch (RuntimeException runtimeexception2)
                {
                    throw runtimeexception2;
                }
                Log.i((new StringBuilder()).append(z[88]).append(k.width).append("x").append(k.height).toString());
                m = false;
                if (android.os.Build.VERSION.SDK_INT >= 9)
                {
                    Object obj = new android.hardware.Camera.CameraInfo();
                    float f3;
                    RuntimeException runtimeexception1;
                    android.hardware.Camera.Size size;
                    boolean flag2;
                    try
                    {
                        Camera.getCameraInfo(b, ((android.hardware.Camera.CameraInfo) (obj)));
                        i1 = ((android.hardware.Camera.CameraInfo) (obj)).facing;
                    }
                    catch (RuntimeException runtimeexception3)
                    {
                        throw runtimeexception3;
                    }
                    if (i1 == 1)
                    {
                        flag2 = true;
                    } else
                    {
                        flag2 = false;
                    }
                    m = flag2;
                    j1 = ((android.hardware.Camera.CameraInfo) (obj)).orientation;
                    if (i2 == 0)
                    {
                        break label0;
                    }
                }
                if (j2 == 0 || j2 == 2)
                {
                    j1 = ((Display) (obj2)).getWidth();
                    i1 = ((Display) (obj2)).getHeight();
                    if (i2 == 0)
                    {
                        break label1;
                    }
                }
                j1 = ((Display) (obj2)).getHeight();
                i1 = ((Display) (obj2)).getWidth();
            }
            RuntimeException runtimeexception4;
            Object obj1;
            String s1;
            if (j1 <= i1 || i2 != 0)
            {
                j1 = 90;
            } else
            {
                j1 = 0;
            }
        }
        j2;
        JVM INSTR tableswitch 0 3: default 368
    //                   0 1581
    //                   1 1586
    //                   2 1591
    //                   3 1601;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        i1 = 0;
_L43:
        if (!m) goto _L9; else goto _L8
_L8:
        l1 = (360 - (j1 + i1) % 360) % 360;
        if (i2 == 0) goto _L10; else goto _L9
_L9:
        l1 = ((j1 - i1) + 360) % 360;
_L10:
        Log.i((new StringBuilder()).append(z[101]).append(i1).append(z[96]).append(j1).append(z[97]).append(l1).append(z[94]).append(m).toString());
        if (android.os.Build.VERSION.SDK_INT < 8) goto _L12; else goto _L11
_L11:
        f.setDisplayOrientation(l1);
_L44:
        parameters.setPreviewSize(k.width, k.height);
        obj = parameters.getSupportedFocusModes();
        if (obj == null) goto _L14; else goto _L13
_L13:
        try
        {
            Log.i((new StringBuilder()).append(z[91]).append(Arrays.deepToString(((List) (obj)).toArray())).toString());
            flag2 = ((List) (obj)).contains(z[100]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        if (!flag2) goto _L16; else goto _L15
_L15:
        parameters.setFocusMode(z[89]);
        if (i2 == 0) goto _L18; else goto _L17
_L17:
        flag = flag1;
_L53:
        try
        {
            Log.i(z[95]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
_L18:
        obj = parameters.getSupportedFlashModes();
        if (obj != null)
        {
            try
            {
                Log.i((new StringBuilder()).append(z[99]).append(Arrays.deepToString(((List) (obj)).toArray())).toString());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                throw obj1;
            }
            if (i2 == 0)
            {
                break MISSING_BLOCK_LABEL_681;
            }
        }
        Log.i(z[86]);
        obj2 = g;
        if (obj2 != null && obj != null)
        {
            try
            {
                if (((List) (obj)).contains(g))
                {
                    parameters.setFlashMode(g);
                    Log.i((new StringBuilder()).append(z[103]).append(g).toString());
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                throw obj1;
            }
        }
        obj = parameters.getSupportedPictureSizes();
        Collections.sort(((List) (obj)), new i(this));
        Log.i((new StringBuilder()).append(z[83]).append(a(((List) (obj)))).toString());
        l1 = 640;
        k1 = 480;
        if (k == null) goto _L20; else goto _L19
_L19:
        f3 = (float)k.height / (float)k.width;
        obj2 = ((List) (obj)).iterator();
        j1 = 480;
        i1 = 640;
        f1 = 3.402823E+38F;
_L50:
        l1 = j1;
        k1 = i1;
        if (!((Iterator) (obj2)).hasNext()) goto _L22; else goto _L21
_L21:
        size = (android.hardware.Camera.Size)((Iterator) (obj2)).next();
        k1 = size.width;
        l1 = size.height;
        if (k1 * l1 >= 0x989680) goto _L24; else goto _L23
_L23:
        if (f1 == 3.402823E+38F) goto _L26; else goto _L25
_L25:
        try
        {
            k1 = size.width;
            l1 = size.height;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        if (k1 * l1 * 2 >= i1 * j1) goto _L26; else goto _L27
_L27:
        l1 = j1;
        k1 = i1;
        if (i2 == 0) goto _L22; else goto _L26
_L26:
        f2 = Math.abs((float)size.height / (float)size.width - f3);
        if (f2 >= f1) goto _L24; else goto _L28
_L28:
        j1 = size.height;
        i1 = size.width;
        if (f2 >= 0.05F) goto _L30; else goto _L29
_L29:
        l1 = j1;
        k1 = i1;
        if (i2 == 0) goto _L22; else goto _L31
_L31:
        f1 = f2;
        k1 = j1;
        j1 = i1;
        i1 = k1;
_L52:
        if (i2 == 0) goto _L33; else goto _L32
_L32:
        l1 = j1;
        k1 = i1;
_L51:
        i1 = k1;
        j1 = l1;
        if (i2 == 0) goto _L34; else goto _L20
_L20:
        obj2 = ((List) (obj)).iterator();
        i1 = l1;
        j1 = k1;
_L48:
        if (!((Iterator) (obj2)).hasNext()) goto _L36; else goto _L35
_L35:
        size = (android.hardware.Camera.Size)((Iterator) (obj2)).next();
        if (size.width * size.height <= i1 * j1) goto _L38; else goto _L37
_L37:
        k1 = size.width;
        l1 = size.height;
        if (k1 * l1 >= 0x989680) goto _L38; else goto _L39
_L39:
        i1 = size.height;
        j1 = size.width;
_L49:
        if (i2 == 0) goto _L40; else goto _L34
_L34:
        try
        {
            flag2 = m;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            try
            {
                throw obj1;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                throw obj1;
            }
        }
        l1 = i1;
        k1 = j1;
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_1293;
        }
        l1 = i1;
        k1 = j1;
        if (!z[93].equals(Build.MANUFACTURER))
        {
            break MISSING_BLOCK_LABEL_1293;
        }
        flag2 = bk.a(j, Build.MODEL);
        l1 = i1;
        k1 = j1;
        if (flag2)
        {
            obj2 = f;
            obj2.getClass();
            obj2 = new android.hardware.Camera.Size(((Camera) (obj2)), 1280, 720);
            l1 = i1;
            k1 = j1;
            if (((List) (obj)).contains(obj2))
            {
                k1 = ((android.hardware.Camera.Size) (obj2)).width;
                l1 = ((android.hardware.Camera.Size) (obj2)).height;
            }
        }
        try
        {
            Log.i((new StringBuilder()).append(z[102]).append(k1).append("x").append(l1).toString());
            parameters.setPictureSize(k1, l1);
            f.setParameters(parameters);
            f.startPreview();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_1376;
        }
        f.autoFocus(new a_(this));
        h = 0;
        i1 = android.os.Build.VERSION.SDK_INT;
        if (i1 < 8)
        {
            break MISSING_BLOCK_LABEL_1518;
        }
        flag2 = f.getParameters().isZoomSupported();
        if (flag2)
        {
            try
            {
                h = f.getParameters().getMaxZoom();
                Log.i((new StringBuilder()).append(z[87]).append(h).toString());
                i = f.getParameters().getZoomRatios();
                Log.i((new StringBuilder()).append(z[105]).append(Arrays.deepToString(i.toArray())).toString());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                throw obj1;
            }
            if (i2 == 0)
            {
                break MISSING_BLOCK_LABEL_1518;
            }
        }
        Log.i(z[85]);
        try
        {
            n = true;
            if (p != null)
            {
                p.a();
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (RuntimeException runtimeexception1)
        {
            throw runtimeexception1;
        }
          goto _L41
_L4:
        if (i2 == 0) goto _L3; else goto _L5
_L5:
        if (i2 == 0) goto _L42; else goto _L6
_L6:
        i1 = 180;
        if (i2 == 0) goto _L43; else goto _L7
_L7:
        i1 = 270;
          goto _L43
        runtimeexception4;
        Log.e((new StringBuilder()).append(z[98]).append(runtimeexception4.toString()).toString());
        if (i2 == 0) goto _L44; else goto _L12
_L12:
        try
        {
            parameters.set(z[92], l1);
            s1 = z[107];
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        if (k1 == 0) goto _L46; else goto _L45
_L45:
        obj1 = z[84];
_L47:
        parameters.set(s1, ((String) (obj1)));
          goto _L44
        obj1;
        throw obj1;
_L46:
        obj1 = z[106];
          goto _L47
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
        obj1;
        throw obj1;
        obj1;
        throw obj1;
_L40:
        k1 = j1;
        j1 = i1;
        i1 = k1;
          goto _L48
_L38:
        k1 = i1;
        i1 = j1;
        j1 = k1;
          goto _L49
_L36:
        k1 = i1;
        i1 = j1;
        j1 = k1;
          goto _L34
_L33:
        k1 = j1;
        j1 = i1;
        i1 = k1;
          goto _L50
_L22:
        i1 = k1;
        k1 = l1;
        l1 = i1;
          goto _L51
_L30:
        f1 = f2;
        k1 = i1;
        i1 = j1;
        j1 = k1;
          goto _L52
_L24:
        k1 = i1;
        i1 = j1;
        j1 = k1;
          goto _L52
_L16:
        flag = false;
          goto _L18
_L14:
        flag = false;
          goto _L53
_L42:
        i1 = 90;
          goto _L43
    }

    static boolean f(CameraView cameraview)
    {
        return cameraview.e;
    }

    private int g()
    {
label0:
        {
            int i1;
            int j1;
            int k1;
            int l1;
label1:
            {
                k1 = 0;
                l1 = CameraActivity.n;
                Display display = ((WindowManager)getContext().getSystemService(z[64])).getDefaultDisplay();
                int i2 = display.getOrientation();
                m = false;
                if (android.os.Build.VERSION.SDK_INT >= 9)
                {
                    android.hardware.Camera.CameraInfo camerainfo = new android.hardware.Camera.CameraInfo();
                    boolean flag;
                    try
                    {
                        Camera.getCameraInfo(b, camerainfo);
                        i1 = camerainfo.facing;
                    }
                    catch (RuntimeException runtimeexception)
                    {
                        throw runtimeexception;
                    }
                    if (i1 == 1)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    m = flag;
                    j1 = camerainfo.orientation;
                    if (l1 == 0)
                    {
                        break label0;
                    }
                }
                if (i2 == 0 || i2 == 2)
                {
                    j1 = display.getWidth();
                    i1 = display.getHeight();
                    if (l1 == 0)
                    {
                        break label1;
                    }
                }
                j1 = display.getHeight();
                i1 = display.getWidth();
            }
            if (j1 <= i1 || l1 != 0)
            {
                j1 = 90;
            } else
            {
                j1 = 0;
            }
        }
        i2;
        JVM INSTR tableswitch 0 3: default 180
    //                   0 289
    //                   1 297
    //                   2 302
    //                   3 311;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        i1 = k1;
_L10:
        if (!m) goto _L7; else goto _L6
_L6:
        k1 = (j1 + i1 + 360) % 360;
        if (l1 == 0) goto _L8; else goto _L7
_L7:
        k1 = ((j1 - i1) + 360) % 360;
_L8:
        Log.i((new StringBuilder()).append(z[62]).append(i1).append(z[63]).append(j1).append(z[61]).append(k1).toString());
        return k1;
_L2:
        i1 = k1;
        if (l1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L3:
        if (l1 == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L4:
        i1 = 180;
        if (l1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        i1 = 270;
        continue; /* Loop/switch isn't completed */
        i1 = 90;
        if (true) goto _L10; else goto _L9
_L9:
    }

    static Camera g(CameraView cameraview)
    {
        return cameraview.f;
    }

    private void h()
    {
        try
        {
            if (r != null)
            {
                r.reset();
                r.release();
                r = null;
                f.lock();
            }
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            throw runtimeexception;
        }
    }

    static void h(CameraView cameraview)
    {
        cameraview.c();
    }

    private List i()
    {
        Log.i(z[0]);
        ArrayList arraylist = new ArrayList();
        Camera camera = f;
        camera.getClass();
        arraylist.add(new android.hardware.Camera.Size(camera, 640, 480));
        return arraylist;
    }

    static boolean i(CameraView cameraview)
    {
        return cameraview.n;
    }

    static void j(CameraView cameraview)
    {
        cameraview.l();
    }

    static boolean k(CameraView cameraview)
    {
        return cameraview.m;
    }

    private void l()
    {
        try
        {
            if (p != null)
            {
                p.b();
            }
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            throw runtimeexception;
        }
    }

    public void a()
    {
        int i1;
        try
        {
            Log.i(z[70]);
            if (android.os.Build.VERSION.SDK_INT < 9)
            {
                break MISSING_BLOCK_LABEL_107;
            }
            i1 = Camera.getNumberOfCameras();
        }
        catch (RuntimeException runtimeexception)
        {
            throw runtimeexception;
        }
        if (i1 <= 1)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        b = (b + 1) % Camera.getNumberOfCameras();
        d();
        c();
        requestLayout();
        f.setPreviewDisplay(q);
        f();
        getContext().getSharedPreferences(z[69], 0).edit().putInt(z[71], b).commit();
        return;
        Object obj;
        obj;
        f.release();
        f = null;
        Log.a(z[73], ((Throwable) (obj)));
        l();
        return;
        obj;
        f.release();
        f = null;
        Log.a(z[72], ((Throwable) (obj)));
        l();
        return;
    }

    public void a(s s1)
    {
        if (s1 == null)
        {
            try
            {
                throw new IllegalArgumentException(z[23]);
            }
            // Misplaced declaration of an exception variable
            catch (s s1)
            {
                throw s1;
            }
        }
        try
        {
            if (f == null)
            {
                Log.e(z[20]);
                l();
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (s s1)
        {
            throw s1;
        }
        n = false;
        l = true;
        Log.i(z[22]);
        android.hardware.Camera.Parameters parameters = f.getParameters();
        parameters.setRotation(g());
        parameters.setJpegQuality(80);
        f.setParameters(parameters);
        try
        {
            e e1 = new e(this, s1);
            s1 = new o(this, s1);
            f.takePicture(s1, null, e1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (s s1)
        {
            Log.a(z[21], s1);
        }
        l();
    }

    public void a(File file)
    {
        if (!b(file)) goto _L2; else goto _L1
_L1:
        Log.i(z[17]);
        r.start();
        e = true;
_L3:
        return;
        file;
        Log.a(z[18], file);
        h();
        l();
        if (CameraActivity.n == 0) goto _L3; else goto _L2
_L2:
        Log.e(z[19]);
        h();
        l();
        return;
        file;
        throw file;
    }

    public List b()
    {
        Object obj;
        obj = null;
        Camera camera;
        try
        {
            camera = f;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (camera != null) goto _L2; else goto _L1
_L1:
        List list;
        return ((List) (obj));
_L2:
        if ((list = f.getParameters().getSupportedFlashModes()) == null) goto _L1; else goto _L3
_L3:
        ArrayList arraylist = new ArrayList();
        RuntimeException runtimeexception;
        try
        {
            if (list.contains(z[57]))
            {
                arraylist.add(z[60]);
            }
        }
        catch (RuntimeException runtimeexception1)
        {
            throw runtimeexception1;
        }
        try
        {
            if (list.contains(z[58]))
            {
                arraylist.add(z[59]);
            }
        }
        catch (RuntimeException runtimeexception2)
        {
            throw runtimeexception2;
        }
        obj = arraylist;
        if (!list.contains(z[55])) goto _L1; else goto _L4
_L4:
        arraylist.add(z[56]);
        return arraylist;
        runtimeexception;
        throw runtimeexception;
    }

    public int e()
    {
        return h;
    }

    public boolean j()
    {
        return e;
    }

    public String k()
    {
        Object obj;
        try
        {
            obj = f;
        }
        catch (RuntimeException runtimeexception)
        {
            throw runtimeexception;
        }
        if (obj != null)
        {
            if ((runtimeexception = b()) != null)
            {
                boolean flag;
                try
                {
                    flag = runtimeexception.isEmpty();
                }
                catch (RuntimeException runtimeexception1)
                {
                    throw runtimeexception1;
                }
                if (!flag)
                {
                    int i1;
                    try
                    {
                        if (g == null)
                        {
                            g = f.getParameters().getFlashMode();
                        }
                    }
                    catch (RuntimeException runtimeexception2)
                    {
                        throw runtimeexception2;
                    }
                    i1 = runtimeexception.indexOf(g);
                    if (i1 >= 0)
                    {
                        g = (String)runtimeexception.get((i1 + 1) % runtimeexception.size());
                        Log.i((new StringBuilder()).append(z[14]).append(g).toString());
                        runtimeexception = f.getParameters();
                        runtimeexception.setFlashMode(g);
                        f.setParameters(runtimeexception);
                        getContext().getSharedPreferences(z[16], 0).edit().putString(z[15], g).commit();
                        return g;
                    }
                }
            }
        }
        return null;
    }

    public void m()
    {
        try
        {
            r.stop();
        }
        catch (RuntimeException runtimeexception)
        {
            Log.w((new StringBuilder()).append(z[82]).append(runtimeexception.toString()).toString());
        }
        h();
        f.lock();
        e = false;
        a = null;
    }

    public String n()
    {
        return g;
    }

    public boolean onDown(MotionEvent motionevent)
    {
        return false;
    }

    public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
    {
        return false;
    }

    public void onLongPress(MotionEvent motionevent)
    {
    }

    protected void onMeasure(int i1, int j1)
    {
        int i2;
        i2 = CameraActivity.n;
        Camera camera;
        try
        {
            super.onMeasure(i1, j1);
            if (f == null)
            {
                c();
            }
        }
        catch (RuntimeException runtimeexception)
        {
            throw runtimeexception;
        }
        try
        {
            camera = f;
        }
        catch (RuntimeException runtimeexception1)
        {
            throw runtimeexception1;
        }
        if (camera != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        double d1;
        double d2;
        int k1;
        int l1;
label0:
        {
            i1 = getMeasuredWidth();
            j1 = getMeasuredHeight();
            Object obj;
            if (a != null)
            {
                obj = a;
                if (i2 == 0)
                {
                    break label0;
                }
            }
            obj = f.getParameters().getSupportedPreviewSizes();
            if (obj == null)
            {
                obj = i();
            }
            Log.i((new StringBuilder()).append(z[2]).append(a(((List) (obj)))).toString());
            k1 = ((WindowManager)getContext().getSystemService(z[3])).getDefaultDisplay().getOrientation();
            double d3;
            int j2;
            if (k1 == 0 || k1 == 2)
            {
                l1 = 1;
            } else
            {
                l1 = 0;
            }
            if (l1 != 0)
            {
                k1 = j1;
            } else
            {
                k1 = i1;
            }
            if (l1 != 0)
            {
                l1 = i1;
            } else
            {
                l1 = j1;
            }
            obj = a(((List) (obj)), k1, l1);
        }
        d1 = Math.min(Math.abs((double)i1 / (double)j1 - (double)((android.hardware.Camera.Size) (obj)).width / (double)((android.hardware.Camera.Size) (obj)).height), Math.abs((double)j1 / (double)i1 - (double)((android.hardware.Camera.Size) (obj)).width / (double)((android.hardware.Camera.Size) (obj)).height));
        try
        {
            Log.i((new StringBuilder()).append(z[1]).append(((android.hardware.Camera.Size) (obj)).width).append("x").append(((android.hardware.Camera.Size) (obj)).height).append(z[10]).append(i1).append("x").append(j1).append(z[9]).append(d1).toString());
        }
        catch (RuntimeException runtimeexception2)
        {
            try
            {
                throw runtimeexception2;
            }
            catch (RuntimeException runtimeexception3)
            {
                throw runtimeexception3;
            }
        }
        if (d1 <= 0.10000000000000001D) goto _L1; else goto _L3
_L3:
        if (i1 > j1)
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        try
        {
            l1 = ((android.hardware.Camera.Size) (obj)).width;
            j2 = ((android.hardware.Camera.Size) (obj)).height;
        }
        catch (RuntimeException runtimeexception4)
        {
            throw runtimeexception4;
        }
        if (l1 > j2)
        {
            l1 = 1;
        } else
        {
            l1 = 0;
        }
        if (k1 != l1) goto _L5; else goto _L4
_L4:
        d1 = Math.min((double)i1 / (double)((android.hardware.Camera.Size) (obj)).width, (double)j1 / (double)((android.hardware.Camera.Size) (obj)).height);
        d2 = Math.max((double)i1 / (double)((android.hardware.Camera.Size) (obj)).width, (double)j1 / (double)((android.hardware.Camera.Size) (obj)).height);
        Log.i((new StringBuilder()).append(z[5]).append(d1).append(z[8]).append(d2).toString());
        if (d2 / d1 <= 1.1000000000000001D) goto _L7; else goto _L6
_L6:
        try
        {
            k1 = android.os.Build.VERSION.SDK_INT;
        }
        // Misplaced declaration of an exception variable
        catch (RuntimeException runtimeexception5)
        {
            throw runtimeexception5;
        }
        if (k1 < 9) goto _L7; else goto _L8
_L8:
        k1 = (int)((double)((android.hardware.Camera.Size) (obj)).width * d1);
        l1 = (int)(d1 * (double)((android.hardware.Camera.Size) (obj)).height);
        if (i2 == 0)
        {
            break MISSING_BLOCK_LABEL_749;
        }
_L5:
        d2 = Math.min((double)i1 / (double)((android.hardware.Camera.Size) (obj)).height, (double)j1 / (double)((android.hardware.Camera.Size) (obj)).width);
        d3 = Math.max((double)i1 / (double)((android.hardware.Camera.Size) (obj)).height, (double)j1 / (double)((android.hardware.Camera.Size) (obj)).width);
        Log.i((new StringBuilder()).append(z[4]).append(d2).append(z[7]).append(d3).toString());
        d1 = d3;
        if (d3 / d2 > 1.1000000000000001D)
        {
            RuntimeException runtimeexception5;
            try
            {
                i1 = android.os.Build.VERSION.SDK_INT;
            }
            catch (RuntimeException runtimeexception6)
            {
                throw runtimeexception6;
            }
            d1 = d3;
            if (i1 >= 9)
            {
                d1 = d2;
            }
        }
        j1 = (int)((double)((android.hardware.Camera.Size) (obj)).height * d1);
        i1 = (int)(d1 * (double)((android.hardware.Camera.Size) (obj)).width);
_L9:
        Log.i((new StringBuilder()).append(z[6]).append(j1).append("x").append(i1).toString());
        setMeasuredDimension(j1, i1);
        return;
        runtimeexception5;
        throw runtimeexception5;
_L7:
        d1 = d2;
          goto _L8
        runtimeexception5;
        throw runtimeexception5;
        i1 = l1;
        j1 = k1;
          goto _L9
    }

    public boolean onScale(ScaleGestureDetector scalegesturedetector)
    {
        Camera camera;
        try
        {
            camera = f;
        }
        // Misplaced declaration of an exception variable
        catch (ScaleGestureDetector scalegesturedetector)
        {
            try
            {
                throw scalegesturedetector;
            }
            // Misplaced declaration of an exception variable
            catch (ScaleGestureDetector scalegesturedetector)
            {
                throw scalegesturedetector;
            }
        }
        if (camera == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        if (h == 0)
        {
            return true;
        }
        float f1 = scalegesturedetector.getScaleFactor();
        try
        {
            o = f1 * (o * f1);
            if (o < 1.0F)
            {
                o = 1.0F;
            }
        }
        // Misplaced declaration of an exception variable
        catch (ScaleGestureDetector scalegesturedetector)
        {
            throw scalegesturedetector;
        }
        p.c(o);
        return true;
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scalegesturedetector)
    {
        try
        {
            scalegesturedetector = f;
        }
        // Misplaced declaration of an exception variable
        catch (ScaleGestureDetector scalegesturedetector)
        {
            try
            {
                throw scalegesturedetector;
            }
            // Misplaced declaration of an exception variable
            catch (ScaleGestureDetector scalegesturedetector)
            {
                throw scalegesturedetector;
            }
        }
        if (scalegesturedetector == null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        if (h == 0)
        {
            return true;
        }
        p.b(o);
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scalegesturedetector)
    {
        scalegesturedetector = f;
        if (scalegesturedetector == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        try
        {
            if (h == 0)
            {
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (ScaleGestureDetector scalegesturedetector)
        {
            throw scalegesturedetector;
        }
        break MISSING_BLOCK_LABEL_23;
        scalegesturedetector;
        throw scalegesturedetector;
        p.a(o);
    }

    public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
    {
        return false;
    }

    public void onShowPress(MotionEvent motionevent)
    {
    }

    public boolean onSingleTapUp(MotionEvent motionevent)
    {
        boolean flag1;
        try
        {
            flag1 = n;
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        while (!flag1 || f == null) 
        {
            return true;
        }
        f.cancelAutoFocus();
        boolean flag = false;
        float f1 = motionevent.getX();
        float f2 = motionevent.getY();
        int i1 = ((flag) ? 1 : 0);
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            break MISSING_BLOCK_LABEL_500;
        }
        Object obj = new Rect((int)(f1 - 100F / 2.0F), (int)(f2 - 100F / 2.0F), (int)(100F / 2.0F + f1), (int)(100F / 2.0F + f2));
        motionevent = new Rect();
        ArrayList arraylist;
        try
        {
            motionevent.set((((Rect) (obj)).left * 2000) / getWidth() - 1000, (((Rect) (obj)).top * 2000) / getHeight() - 1000, (((Rect) (obj)).right * 2000) / getWidth() - 1000, (((Rect) (obj)).bottom * 2000) / getHeight() - 1000);
            if (((Rect) (motionevent)).left < -1000)
            {
                motionevent.left = -1000;
            }
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        try
        {
            if (((Rect) (motionevent)).top < -1000)
            {
                motionevent.top = -1000;
            }
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        try
        {
            if (((Rect) (motionevent)).right > 1000)
            {
                motionevent.right = 1000;
            }
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        try
        {
            if (((Rect) (motionevent)).bottom > 1000)
            {
                motionevent.bottom = 1000;
            }
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        i1 = Math.abs(((Rect) (motionevent)).top - ((Rect) (motionevent)).bottom);
        if (i1 < 10)
        {
            try
            {
                motionevent.top = ((Rect) (motionevent)).top - 5;
                motionevent.bottom = ((Rect) (motionevent)).bottom + 5;
                if (((Rect) (motionevent)).top < -1000)
                {
                    motionevent.top = -1000;
                }
            }
            // Misplaced declaration of an exception variable
            catch (MotionEvent motionevent)
            {
                throw motionevent;
            }
            try
            {
                if (((Rect) (motionevent)).top > 1000)
                {
                    motionevent.top = 1000;
                }
            }
            // Misplaced declaration of an exception variable
            catch (MotionEvent motionevent)
            {
                throw motionevent;
            }
        }
        i1 = Math.abs(((Rect) (motionevent)).left - ((Rect) (motionevent)).right);
        if (i1 < 10)
        {
            try
            {
                motionevent.left = ((Rect) (motionevent)).left - 5;
                motionevent.right = ((Rect) (motionevent)).right + 5;
                if (((Rect) (motionevent)).left < -1000)
                {
                    motionevent.left = -1000;
                }
            }
            // Misplaced declaration of an exception variable
            catch (MotionEvent motionevent)
            {
                throw motionevent;
            }
            try
            {
                if (((Rect) (motionevent)).right < 1000)
                {
                    motionevent.right = 1000;
                }
            }
            // Misplaced declaration of an exception variable
            catch (MotionEvent motionevent)
            {
                throw motionevent;
            }
        }
        obj = f.getParameters();
        i1 = ((flag) ? 1 : 0);
        if (((android.hardware.Camera.Parameters) (obj)).getMaxNumFocusAreas() > 0)
        {
            arraylist = new ArrayList();
            arraylist.add(new android.hardware.Camera.Area(motionevent, 1000));
            ((android.hardware.Camera.Parameters) (obj)).setFocusAreas(arraylist);
            motionevent = ((android.hardware.Camera.Parameters) (obj)).getSupportedFocusModes();
            if (motionevent != null)
            {
                try
                {
                    if (motionevent.contains(z[65]))
                    {
                        ((android.hardware.Camera.Parameters) (obj)).setFocusMode(z[66]);
                    }
                }
                // Misplaced declaration of an exception variable
                catch (MotionEvent motionevent)
                {
                    throw motionevent;
                }
            }
            f.setParameters(((android.hardware.Camera.Parameters) (obj)));
            i1 = 1;
        }
        if (i1 != 0)
        {
            try
            {
                p.a(f1, f2);
            }
            // Misplaced declaration of an exception variable
            catch (MotionEvent motionevent)
            {
                throw motionevent;
            }
        }
        f.autoFocus(new v(this));
        return true;
        motionevent;
        throw motionevent;
        motionevent;
        throw motionevent;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        try
        {
            d.onTouchEvent(motionevent);
            if (s != null)
            {
                s.onTouchEvent(motionevent);
            }
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        return true;
    }

    public void setCameraCallback(w w1)
    {
        p = w1;
    }

    public int setZoomLevel(int i1)
    {
        int j1;
        try
        {
            j1 = h;
        }
        catch (RuntimeException runtimeexception)
        {
            throw runtimeexception;
        }
        if (i1 <= j1) goto _L2; else goto _L1
_L1:
        return 0;
_L2:
        Object obj;
        try
        {
            j1 = android.os.Build.VERSION.SDK_INT;
        }
        catch (RuntimeException runtimeexception1)
        {
            throw runtimeexception1;
        }
        if (j1 < 8) goto _L1; else goto _L3
_L3:
        obj = f.getParameters();
        ((android.hardware.Camera.Parameters) (obj)).setZoom(i1);
        f.setParameters(((android.hardware.Camera.Parameters) (obj)));
        obj = i;
        if (obj != null)
        {
            RuntimeException runtimeexception2;
            int k1;
            try
            {
                k1 = i.size();
            }
            catch (RuntimeException runtimeexception3)
            {
                throw runtimeexception3;
            }
            if (k1 >= i1)
            {
                return ((Integer)i.get(i1)).intValue();
            }
        }
          goto _L1
        runtimeexception2;
        throw runtimeexception2;
    }

    public void surfaceChanged(SurfaceHolder surfaceholder, int i1, int j1, int k1)
    {
        if (f != null) goto _L2; else goto _L1
_L1:
        Log.e(z[80]);
        l();
_L4:
        return;
        surfaceholder;
        throw surfaceholder;
_L2:
        try
        {
            if (q.getSurface() == null)
            {
                Log.e(z[81]);
                l();
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (SurfaceHolder surfaceholder)
        {
            throw surfaceholder;
        }
        if (e) goto _L4; else goto _L3
_L3:
        if (!surfaceholder.isCreating())
        {
            f.stopPreview();
        }
        try
        {
            f.setPreviewDisplay(surfaceholder);
            f();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SurfaceHolder surfaceholder)
        {
            f.release();
        }
        f = null;
        Log.a(z[79], surfaceholder);
        l();
        return;
        surfaceholder;
        throw surfaceholder;
        surfaceholder;
        f.release();
        f = null;
        Log.a(z[78], surfaceholder);
        l();
        return;
    }

    public void surfaceCreated(SurfaceHolder surfaceholder)
    {
        c();
    }

    public void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
        d();
        h();
    }

    static 
    {
        String as[];
        Object obj;
        String as1[];
        byte byte0;
        int i1;
        as = new String[108];
        obj = "\027<#;O\025+';J[;/2Q\026<-5N\001->1O\0008*.O\021+';J\00744;N";
        byte0 = -1;
        as1 = as;
        i1 = 0;
_L10:
        int j1;
        int k1;
        obj = ((String) (obj)).toCharArray();
        k1 = obj.length;
        j1 = 0;
_L7:
        if (k1 <= j1)
        {
            obj = (new String(((char []) (obj)))).intern();
            byte byte1;
            char c1;
            switch (byte0)
            {
            default:
                as1[i1] = ((String) (obj));
                obj = "\027<#;O\025+';J[0+?N\001/+~R\004)'3\\\030-<;K\03589-T\0168t";
                i1 = 1;
                as1 = as;
                byte0 = 0;
                continue; /* Loop/switch isn't completed */

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                obj = "\027<#;O\025+';J[0+?N\001/+qM\006887X\003.'$X\007}";
                i1 = 2;
                as1 = as;
                byte0 = 1;
                continue; /* Loop/switch isn't completed */

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                obj = "\0034 :R\003";
                i1 = 3;
                as1 = as;
                byte0 = 2;
                continue; /* Loop/switch isn't completed */

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                obj = "\027<#;O\025+';J[0+?N\001/+~R\004)'3\\\030-<;K\03589-T\0168n-^\0251+\001P\0353t";
                i1 = 4;
                as1 = as;
                byte0 = 3;
                continue; /* Loop/switch isn't completed */

            case 3: // '\003'
                as1[i1] = ((String) (obj));
                i1 = 5;
                as1 = as;
                obj = "\027<#;O\025+';J[0+?N\001/+~R\004)'3\\\030-<;K\03589-T\0168n-^\0251+\001P\0353t";
                byte0 = 4;
                continue; /* Loop/switch isn't completed */

            case 4: // '\004'
                as1[i1] = ((String) (obj));
                i1 = 6;
                obj = "\027<#;O\025+';J[0+?N\001/+~O\021.;2IN";
                byte0 = 5;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 5: // '\005'
                as1[i1] = ((String) (obj));
                i1 = 7;
                obj = "T.-?Q\021\002#?EN";
                byte0 = 6;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 6: // '\006'
                as1[i1] = ((String) (obj));
                i1 = 8;
                obj = "T.-?Q\021\002#?EN";
                byte0 = 7;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 7: // '\007'
                as1[i1] = ((String) (obj));
                i1 = 9;
                obj = "T<=.X\027)n:T\022;t";
                byte0 = 8;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 8: // '\b'
                as1[i1] = ((String) (obj));
                i1 = 10;
                obj = "T0+?N\001/+:\007";
                byte0 = 9;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 9: // '\t'
                as1[i1] = ((String) (obj));
                i1 = 11;
                obj = "\0272#pJ\034<:-\\\004-\021.O\021;+,X\032>+-";
                byte0 = 10;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 10: // '\n'
                as1[i1] = ((String) (obj));
                i1 = 12;
                obj = "\0221/-U+0!:X";
                byte0 = 11;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 11: // '\013'
                as1[i1] = ((String) (obj));
                i1 = 13;
                obj = "\027<#;O\025\002'0Y\021%";
                byte0 = 12;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 12: // '\f'
                as1[i1] = ((String) (obj));
                i1 = 14;
                obj = "\027<#;O\025+';J[3+&IT;\"?N\034}#1Y\021g";
                byte0 = 13;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 13: // '\r'
                as1[i1] = ((String) (obj));
                i1 = 15;
                obj = "\0221/-U+0!:X";
                byte0 = 14;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 14: // '\016'
                as1[i1] = ((String) (obj));
                i1 = 16;
                obj = "\0272#pJ\034<:-\\\004-\021.O\021;+,X\032>+-";
                byte0 = 15;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 15: // '\017'
                as1[i1] = ((String) (obj));
                i1 = 17;
                obj = "\027<#;O\025+';J[.:?O\000}87Y\0212";
                byte0 = 16;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 16: // '\020'
                as1[i1] = ((String) (obj));
                i1 = 18;
                obj = "\027<#;O\025+';J[.:?O\000+':X\033>/.I\001/+~[\0254\";Y";
                byte0 = 17;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 17: // '\021'
                as1[i1] = ((String) (obj));
                i1 = 19;
                obj = "\027<#;O\025+';J[.:?O\000+':X\033>/.I\001/+~[\0254\";Y";
                byte0 = 18;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 18: // '\022'
                as1[i1] = ((String) (obj));
                i1 = 20;
                obj = "\027<#;O\025+';J[)/5X\0044-*H\0068n=\\\0318<?\035\035.n0H\0301";
                byte0 = 19;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 19: // '\023'
                as1[i1] = ((String) (obj));
                i1 = 21;
                obj = "\027<#;O\025+';J[)/5X\0044-*H\0068n8\\\0351+:";
                byte0 = 20;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 20: // '\024'
                as1[i1] = ((String) (obj));
                i1 = 22;
                obj = "\027<#;O\025+';J[)/5X\0044-*H\0068a-I\025/:";
                byte0 = 21;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 21: // '\025'
                as1[i1] = ((String) (obj));
                i1 = 23;
                obj = "\0044-*H\0068\021=\\\0301,?^\037}'-\035\032(\"2";
                byte0 = 22;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 22: // '\026'
                as1[i1] = ((String) (obj));
                i1 = 24;
                obj = "\027<#;O\025+';J[}-?S\0322:~[\0353*~M\006887X\003}=7G\021";
                byte0 = 23;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 23: // '\027'
                as1[i1] = ((String) (obj));
                i1 = 25;
                obj = "T+':X\033\037'*o\025)+d";
                byte0 = 24;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 24: // '\030'
                as1[i1] = ((String) (obj));
                i1 = 26;
                obj = "<\t\r";
                byte0 = 25;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 25: // '\031'
                as1[i1] = ((String) (obj));
                i1 = 27;
                obj = "T;'2X22<3\\\000g";
                byte0 = 26;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 26: // '\032'
                as1[i1] = ((String) (obj));
                i1 = 28;
                obj = "\027<#;O\025+';J[-<;M\025/+(T\0208!~[\0062 *\007";
                byte0 = 27;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 27: // '\033'
                as1[i1] = ((String) (obj));
                i1 = 29;
                obj = "\027<#;O\025+';J[}=+M\0042<*X\020}87Y\0212n-T\0168=d";
                byte0 = 28;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 28: // '\034'
                as1[i1] = ((String) (obj));
                i1 = 30;
                obj = "\027<#;O\025+';J[};-XT-<1[\0351+d";
                byte0 = 29;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 29: // '\035'
                as1[i1] = ((String) (obj));
                i1 = 31;
                obj = "\027<#;O\025+';J[}=+M\0042<*X\020}(1^\001.t~S\0011\"";
                byte0 = 30;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 30: // '\036'
                as1[i1] = ((String) (obj));
                i1 = 32;
                obj = "\027<#\001P\0339+";
                byte0 = 31;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 31: // '\037'
                as1[i1] = ((String) (obj));
                i1 = 33;
                obj = "\027<#;O\025+';J[}n;O\0062<~N\021):7S\023}>,X\0024+)\035\0204=.Q\025$";
                byte0 = 32;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 32: // ' '
                as1[i1] = ((String) (obj));
                i1 = 34;
                obj = "\027<#;O\025+';J[}-?S\0322:~[\0353*~M\006887X\003}=7G\021}:6\\\000}'-\035\030<<9X\006}:6\\\032}87Y\0212";
                byte0 = 33;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 33: // '!'
                as1[i1] = ((String) (obj));
                i1 = 35;
                obj = "\027<#;O\025+';J[}-?S\0322:~[\0353*~K\0359+1\035\00744;";
                byte0 = 34;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 34: // '"'
                as1[i1] = ((String) (obj));
                i1 = 36;
                obj = "\027<#;O\025+';J[}>,R\0224\";\007";
                byte0 = 35;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 35: // '#'
                as1[i1] = ((String) (obj));
                i1 = 37;
                obj = "\027<#;O\025+';J[}=+M\0042<*X\020}>,X\0024+)\035\00744;NN";
                byte0 = 36;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 36: // '$'
                as1[i1] = ((String) (obj));
                i1 = 38;
                obj = "T<;:T\033\036!:X\027g";
                byte0 = 37;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 37: // '%'
                as1[i1] = ((String) (obj));
                i1 = 39;
                obj = "T+':X\033\033<?P\021\017/*XN";
                byte0 = 38;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 38: // '&'
                as1[i1] = ((String) (obj));
                i1 = 40;
                obj = "\027<#;O\025+';J[}=+M\0042<*X\020}(1^\001.t";
                byte0 = 39;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 39: // '\''
                as1[i1] = ((String) (obj));
                i1 = 41;
                obj = "\027<#;O\025+';J[}>,X\0228<,X\020}87Y\0212n.O\021+';JT.'$XT4=~S\0011\"";
                byte0 = 40;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 40: // '('
                as1[i1] = ((String) (obj));
                i1 = 42;
                obj = "\007<#-H\032:";
                byte0 = 41;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 41: // ')'
                as1[i1] = ((String) (obj));
                i1 = 43;
                obj = "\027<#;O\025+';J[}>,X\0228<,X\020}87Y\0212n.O\021+';JT.'$XN";
                byte0 = 42;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 42: // '*'
                as1[i1] = ((String) (obj));
                i1 = 44;
                obj = "\0272 *T\032(!+NY+':X\033";
                byte0 = 43;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 43: // '+'
                as1[i1] = ((String) (obj));
                i1 = 45;
                obj = "\0353(7S\035)7";
                byte0 = 44;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 44: // ','
                as1[i1] = ((String) (obj));
                i1 = 46;
                obj = "\0272 *T\032(!+NY+':X\033";
                byte0 = 45;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 45: // '-'
                as1[i1] = ((String) (obj));
                i1 = 47;
                obj = "T-<;K\03589d";
                byte0 = 46;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 46: // '.'
                as1[i1] = ((String) (obj));
                i1 = 48;
                obj = "T+':X\033\037'*o\025)+d";
                byte0 = 47;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 47: // '/'
                as1[i1] = ((String) (obj));
                i1 = 49;
                obj = "\027<#;O\025+';J[};-XT-<;[\021/<;YT+':X\033}=7G\021";
                byte0 = 48;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 48: // '0'
                as1[i1] = ((String) (obj));
                i1 = 50;
                obj = "\0353(7S\035)7";
                byte0 = 49;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 49: // '1'
                as1[i1] = ((String) (obj));
                i1 = 51;
                obj = "\027<#;O\025+';J[} 1\035\004/!8T\0308";
                byte0 = 50;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 50: // '2'
                as1[i1] = ((String) (obj));
                i1 = 52;
                obj = "\027<#;O\025+';J[}<;N\000<<*\035\004/+(T\021*";
                byte0 = 51;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 51: // '3'
                as1[i1] = ((String) (obj));
                i1 = 53;
                obj = "T+':X\033\036!:X\027g";
                byte0 = 52;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 52: // '4'
                as1[i1] = ((String) (obj));
                i1 = 54;
                obj = "\027<#;O\025+';J[} 1\035\007(>.R\006)+:\035\0024*;RT.'$X\007";
                byte0 = 53;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 53: // '5'
                as1[i1] = ((String) (obj));
                i1 = 55;
                obj = "\025(:1";
                byte0 = 54;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 54: // '6'
                as1[i1] = ((String) (obj));
                i1 = 56;
                obj = "\025(:1";
                byte0 = 55;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 55: // '7'
                as1[i1] = ((String) (obj));
                i1 = 57;
                obj = "\033;(";
                byte0 = 56;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 56: // '8'
                as1[i1] = ((String) (obj));
                i1 = 58;
                obj = "\0333";
                byte0 = 57;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 57: // '9'
                as1[i1] = ((String) (obj));
                i1 = 59;
                obj = "\0333";
                byte0 = 58;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 58: // ':'
                as1[i1] = ((String) (obj));
                i1 = 60;
                obj = "\033;(";
                byte0 = 59;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 59: // ';'
                as1[i1] = ((String) (obj));
                i1 = 61;
                obj = "T/!*\\\0008t";
                byte0 = 60;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 60: // '<'
                as1[i1] = ((String) (obj));
                i1 = 62;
                obj = "\027<#;O\025+';J[2<7X\032)/*T\0333n:T\007-\"?DN";
                byte0 = 61;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 61: // '='
                as1[i1] = ((String) (obj));
                i1 = 63;
                obj = "T>/3X\006<t";
                byte0 = 62;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 62: // '>'
                as1[i1] = ((String) (obj));
                i1 = 64;
                obj = "\0034 :R\003";
                byte0 = 63;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 63: // '?'
                as1[i1] = ((String) (obj));
                i1 = 65;
                obj = "\025(:1";
                byte0 = 64;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 64: // '@'
                as1[i1] = ((String) (obj));
                i1 = 66;
                obj = "\025(:1";
                byte0 = 65;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 65: // 'A'
                as1[i1] = ((String) (obj));
                i1 = 67;
                obj = "\027<#;O\025+';J[.:?O\000>/3X\006<n;O\0062<~R\0048 7S\023}-?P\021//";
                byte0 = 66;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 66: // 'B'
                as1[i1] = ((String) (obj));
                i1 = 68;
                obj = "\027<#;O\025+';J[.:?O\000>/3X\006<n;O\0062<~O\021>!0S\021>:7S\023}-?P\021//";
                byte0 = 67;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 67: // 'C'
                as1[i1] = ((String) (obj));
                i1 = 69;
                obj = "\0272#pJ\034<:-\\\004-\021.O\021;+,X\032>+-";
                byte0 = 68;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 68: // 'D'
                as1[i1] = ((String) (obj));
                i1 = 70;
                obj = "\027<#;O\025+';J[3+&I\027<#;O\025";
                byte0 = 69;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 69: // 'E'
                as1[i1] = ((String) (obj));
                i1 = 71;
                obj = "\027<#;O\025\002'0Y\021%";
                byte0 = 70;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 70: // 'F'
                as1[i1] = ((String) (obj));
                i1 = 72;
                obj = "\027<#;O\025+';J[3+&I\027<#;O\025}+,O\033/n-X\000)'0ZT-<;K\03589~Y\035.>2\\\r";
                byte0 = 71;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 71: // 'G'
                as1[i1] = ((String) (obj));
                i1 = 73;
                obj = "\027<#;O\025+';J[3+&I\027<#;O\025}";
                byte0 = 72;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 72: // 'H'
                as1[i1] = ((String) (obj));
                i1 = 74;
                obj = "X}";
                byte0 = 73;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 73: // 'I'
                as1[i1] = ((String) (obj));
                i1 = 75;
                obj = "\027<#;O\025+';J[.:1M\027<#;O\025}+,O\033/n-I\033->7S\023}-?P\021//~M\006887X\003";
                byte0 = 74;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 74: // 'J'
                as1[i1] = ((String) (obj));
                i1 = 76;
                obj = "\027<#;O\025+';J[.:1M\027<#;O\025";
                byte0 = 75;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 75: // 'K'
                as1[i1] = ((String) (obj));
                i1 = 77;
                obj = "\027<#;O\025+';J[.:1M\027<#;O\025}+,O\033/n,X\0308/-X\0353)~^\0250+,\\";
                byte0 = 76;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 76: // 'L'
                as1[i1] = ((String) (obj));
                i1 = 78;
                obj = "\027<#;O\025+';J[.;,[\025>+=U\0253);YN}+,O\033/n-X\000)'0ZT-<;K\03589~Y\035.>2\\\r";
                byte0 = 77;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 77: // 'M'
                as1[i1] = ((String) (obj));
                i1 = 79;
                obj = "\027<#;O\025+';J[.;,[\025>+=U\0253);YT";
                byte0 = 78;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 78: // 'N'
                as1[i1] = ((String) (obj));
                i1 = 80;
                obj = "\027<#;O\025+';J[.;,[\025>+=U\0253);YN} 1\035\027<#;O\025";
                byte0 = 79;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 79: // 'O'
                as1[i1] = ((String) (obj));
                i1 = 81;
                obj = "\027<#;O\025+';J[.;,[\025>+=U\0253);YN} 1\035\007(<8\\\0278";
                byte0 = 80;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 80: // 'P'
                as1[i1] = ((String) (obj));
                i1 = 82;
                obj = "\027<#;O\025+';J[.:1M\0024*;R\027<>*H\0068n";
                byte0 = 81;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 81: // 'Q'
                as1[i1] = ((String) (obj));
                i1 = 83;
                obj = "\027<#;O\025+';J[.:?O\000-<;K\03589~M\035>:+O\021.'$X\007g";
                byte0 = 82;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 82: // 'R'
                as1[i1] = ((String) (obj));
                i1 = 84;
                obj = "\0042<*O\0254:";
                byte0 = 83;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 83: // 'S'
                as1[i1] = ((String) (obj));
                i1 = 85;
                obj = "\027<#;O\025+';J[.:?O\000-<;K\03589~S\033}41R\031";
                byte0 = 84;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 84: // 'T'
                as1[i1] = ((String) (obj));
                i1 = 86;
                obj = "\027<#;O\025+';J[.:?O\000-<;K\03589~N\001->1O\0008*~[\030<=6\007\032(\"2";
                byte0 = 85;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 85: // 'U'
                as1[i1] = ((String) (obj));
                i1 = 87;
                obj = "\027<#;O\025+';J[.:?O\000-<;K\03589~P\025%\021$R\0330t";
                byte0 = 86;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 86: // 'V'
                as1[i1] = ((String) (obj));
                i1 = 88;
                obj = "\027<#;O\025+';J[.:?O\000-<;K\03589~R\004)'3\\\030}>,X\0024+)\035\00744;\007";
                byte0 = 87;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 87: // 'W'
                as1[i1] = ((String) (obj));
                i1 = 89;
                obj = "\0272 *T\032(!+NY-'=I\001/+";
                byte0 = 88;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 88: // 'X'
                as1[i1] = ((String) (obj));
                i1 = 90;
                obj = "\0034 :R\003";
                byte0 = 89;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 89: // 'Y'
                as1[i1] = ((String) (obj));
                i1 = 91;
                obj = "\027<#;O\025+';J[.:?O\000-<;K\03589~N\001->1O\0008*~[\033>;-\007";
                byte0 = 90;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 90: // 'Z'
                as1[i1] = ((String) (obj));
                i1 = 92;
                obj = "\0062:?I\0352 ";
                byte0 = 91;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 91: // '['
                as1[i1] = ((String) (obj));
                i1 = 93;
                obj = "\007<#-H\032:";
                byte0 = 92;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 92: // '\\'
                as1[i1] = ((String) (obj));
                i1 = 94;
                obj = "T;<1S\000g";
                byte0 = 93;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 93: // ']'
                as1[i1] = ((String) (obj));
                i1 = 95;
                obj = "\027<#;O\025+';J[.:?O\000-<;K\03589~N\001->1O\0008*~[\033>;-\007\032(\"2";
                byte0 = 94;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 94: // '^'
                as1[i1] = ((String) (obj));
                i1 = 96;
                obj = "T>/3X\006<t";
                byte0 = 95;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 95: // '_'
                as1[i1] = ((String) (obj));
                i1 = 97;
                obj = "T-<;K\03589d";
                byte0 = 96;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 96: // '`'
                as1[i1] = ((String) (obj));
                i1 = 98;
                obj = "\027<#;O\025+';J[.:?O\000-<;K\03589qN\021)*7N\0041/'R\0064+0I\025)'1ST";
                byte0 = 97;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 97: // 'a'
                as1[i1] = ((String) (obj));
                i1 = 99;
                obj = "\027<#;O\025+';J[.:?O\000-<;K\03589~N\001->1O\0008*~[\030<=6\007";
                byte0 = 98;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 98: // 'b'
                as1[i1] = ((String) (obj));
                i1 = 100;
                obj = "\0272 *T\032(!+NY-'=I\001/+";
                byte0 = 99;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 99: // 'c'
                as1[i1] = ((String) (obj));
                i1 = 101;
                obj = "\027<#;O\025+';J[.:?O\000-<;K\03589~Y\035.>2\\\rg";
                byte0 = 100;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 100: // 'd'
                as1[i1] = ((String) (obj));
                i1 = 102;
                obj = "\027<#;O\025+';J[.:?O\000-<;K\03589~M\035>:+O\021}=7G\021}";
                byte0 = 101;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 101: // 'e'
                as1[i1] = ((String) (obj));
                i1 = 103;
                obj = "\027<#;O\025+';J[.:?O\000-<;K\03589~N\021)n8Q\025.&~P\0339+d";
                byte0 = 102;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 102: // 'f'
                as1[i1] = ((String) (obj));
                i1 = 104;
                obj = "\027<#;O\025+';J[.:?O\000-<;K\03589~^\0250+,\\T4=~S\0011\"";
                byte0 = 103;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 103: // 'g'
                as1[i1] = ((String) (obj));
                i1 = 105;
                obj = "\027<#;O\025+';J[.:?O\000-<;K\03589~G\0332#~O\025)'1NN";
                byte0 = 104;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 104: // 'h'
                as1[i1] = ((String) (obj));
                i1 = 106;
                obj = "\030< :N\027<>;";
                byte0 = 105;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 105: // 'i'
                as1[i1] = ((String) (obj));
                i1 = 107;
                obj = "\033/';S\000<:7R\032";
                byte0 = 106;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 106: // 'j'
                as1[i1] = ((String) (obj));
                z = as;
                as = new String[11];
                obj = "3\tc\027\004Am{";
                byte0 = 107;
                as1 = as;
                i1 = 0;
                continue; /* Loop/switch isn't completed */

            case 107: // 'k'
                as1[i1] = ((String) (obj));
                obj = "3\tc\027\004Amx";
                byte0 = 108;
                i1 = 1;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 108: // 'l'
                as1[i1] = ((String) (obj));
                obj = "3\tc\027\004Am{\031";
                byte0 = 109;
                i1 = 2;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 109: // 'm'
                as1[i1] = ((String) (obj));
                obj = "'\032\006stGny";
                byte0 = 110;
                i1 = 3;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 110: // 'n'
                as1[i1] = ((String) (obj));
                obj = "'\032\006spMlw";
                byte0 = 111;
                i1 = 4;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 111: // 'o'
                as1[i1] = ((String) (obj));
                i1 = 5;
                obj = "'\036\006stAi{";
                byte0 = 112;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 112: // 'p'
                as1[i1] = ((String) (obj));
                i1 = 6;
                obj = "'\r\006sqCo~";
                byte0 = 113;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 113: // 'q'
                as1[i1] = ((String) (obj));
                i1 = 7;
                obj = "'\036\006soMj~";
                byte0 = 114;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 114: // 'r'
                as1[i1] = ((String) (obj));
                i1 = 8;
                obj = "3\tc\027\004Amv";
                byte0 = 115;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 115: // 's'
                as1[i1] = ((String) (obj));
                i1 = 9;
                obj = "'\032\006ssDi{";
                byte0 = 116;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 116: // 't'
                as1[i1] = ((String) (obj));
                i1 = 10;
                obj = "'\036cn\t1";
                byte0 = 117;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 117: // 'u'
                as1[i1] = ((String) (obj));
                c = as;
                as = new String[3];
                obj = "3\tc\027\004Ed{";
                byte0 = 118;
                as1 = as;
                i1 = 0;
                continue; /* Loop/switch isn't completed */

            case 118: // 'v'
                as1[i1] = ((String) (obj));
                obj = "3\tc\027\004Ed~";
                byte0 = 119;
                i1 = 1;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 119: // 'w'
                as1[i1] = ((String) (obj));
                obj = "3\tc\027\004Ed|";
                byte0 = 120;
                i1 = 2;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 120: // 'x'
                as1[i1] = ((String) (obj));
                break;
            }
            break; /* Loop/switch isn't completed */
        }
        c1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 2748
    //                   0 2771
    //                   1 2778
    //                   2 2785
    //                   3 2792;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_2792;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte1 = 61;
_L8:
        obj[j1] = (char)(byte1 ^ c1);
        j1++;
        if (true) goto _L7; else goto _L6
_L6:
        byte1 = 116;
          goto _L8
_L3:
        byte1 = 93;
          goto _L8
_L4:
        byte1 = 78;
          goto _L8
        byte1 = 94;
          goto _L8
        if (true) goto _L10; else goto _L9
_L9:
        j = as;
    }
}
