// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.kofax.kmc.kui.uicontrols:
//            ICameraSource

final class a
{

    private static final String a = (new StringBuilder()).append("KMC_").append(com/kofax/kmc/kui/uicontrols/a.getSimpleName()).toString();
    private static List p;
    private static List q;
    private final Context b;
    private Point c;
    private boolean d;
    private int e;
    private Point f;
    private Point g;
    private Point h;
    private Point i;
    private boolean j;
    private Point k;
    private Integer l;
    private Integer m;
    private Integer n;
    private final float o = 4.2F;

    a(Context context)
    {
        l = Integer.valueOf(0x4dd1e0);
        m = Integer.valueOf(0x2dc6c0);
        n = Integer.valueOf(0x6acfc0);
        b = context;
        if (Build.MODEL.equalsIgnoreCase("SD4930UR"))
        {
            l = Integer.valueOf(0x7270e0);
            n = Integer.valueOf(0x7a1200);
        }
    }

    private int a(double d1, List list, double d2, double d3, 
            Integer integer, Integer integer1, Integer integer2, List list1)
    {
        Integer integer3;
        ArrayList arraylist;
        int i1;
        int j1;
        int k1;
        long l2;
        arraylist = new ArrayList();
        integer3 = integer;
        if (integer == null)
        {
            if (integer1 != null && integer2 != null)
            {
                integer3 = Integer.valueOf(integer1.intValue() + (integer2.intValue() - integer1.intValue()) / 2);
            } else
            {
                integer3 = Integer.valueOf(0x7fffffff);
            }
        }
        i1 = -1;
        j1 = 0x7fffffff;
        k1 = 0;
        if (k1 >= list1.size())
        {
            break; /* Loop/switch isn't completed */
        }
        integer = (Point)list1.get(k1);
        l2 = ((Point) (integer)).x * ((Point) (integer)).y;
        if ((integer1 == null || l2 >= (long)integer1.intValue()) && (integer2 == null || l2 <= (long)integer2.intValue()))
        {
            double d4 = (double)((Point) (integer)).x / (double)((Point) (integer)).y;
            if (Math.abs(d4 - d1) > d2)
            {
                if (list != null && i1 < 0)
                {
                    Iterator iterator = list.iterator();
                    while (iterator.hasNext()) 
                    {
                        if (Math.abs(d4 - ((Double)iterator.next()).doubleValue()) <= d3)
                        {
                            arraylist.add(integer);
                        }
                    }
                }
            } else
            {
                int i2 = (int)Math.abs(l2 - (long)integer3.intValue());
                if (i2 < j1)
                {
                    i1 = k1;
                    j1 = i2;
                }
            }
        }
        k1++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_62;
_L1:
        int l1 = i1;
        if (i1 < 0)
        {
            l1 = i1;
            if (!arraylist.isEmpty())
            {
                list = arraylist.iterator();
                do
                {
                    l1 = i1;
                    if (!list.hasNext())
                    {
                        break;
                    }
                    integer = (Point)list.next();
                    l1 = (int)Math.abs((long)(((Point) (integer)).x * ((Point) (integer)).y) - (long)integer3.intValue());
                    if (l1 < j1)
                    {
                        i1 = list1.indexOf(integer);
                        j1 = l1;
                    }
                } while (true);
            }
        }
        return l1;
    }

    private int a(int i1, int j1, Point point, List list)
    {
        if (list == null || list.size() <= 0) goto _L2; else goto _L1
_L1:
        int k1;
        byte byte0;
        int i2;
        byte0 = -1;
        i2 = 0x1869f;
        k1 = 0;
_L4:
        Point point1;
        int j2;
        int k2;
        if (k1 >= list.size())
        {
            break MISSING_BLOCK_LABEL_165;
        }
        point1 = (Point)list.get(k1);
        if (point == null)
        {
            break; /* Loop/switch isn't completed */
        }
        j2 = byte0;
        k2 = i2;
        if (point.x <= point1.x)
        {
            if (point.y <= point1.y)
            {
                break; /* Loop/switch isn't completed */
            }
            k2 = i2;
            j2 = byte0;
        }
_L5:
        k1++;
        byte0 = j2;
        i2 = k2;
        if (true) goto _L4; else goto _L3
_L3:
        j2 = Math.abs(point1.x - i1);
        int l2 = Math.abs(point1.y - j1) + j2;
        j2 = byte0;
        k2 = i2;
        if (l2 < i2)
        {
            j2 = k1;
            k2 = l2;
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
        k1 = byte0;
_L8:
        int l1 = k1;
        if (k1 == -1)
        {
            l1 = k1;
            if (point != null)
            {
                l1 = a(i1, j1, null, list);
            }
        }
        return l1;
_L2:
        k1 = -1;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private int a(Integer integer, Integer integer1, List list)
    {
        int i1;
        byte byte0;
        long l1;
        l1 = 0L;
        byte0 = -1;
        i1 = 0;
_L2:
        int j1;
        long l2;
        long l3;
        if (i1 >= list.size())
        {
            break MISSING_BLOCK_LABEL_141;
        }
        Point point = (Point)list.get(i1);
        j1 = point.x;
        l3 = point.y * j1;
        if (integer == null || l3 >= (long)integer.intValue())
        {
            break; /* Loop/switch isn't completed */
        }
        l2 = l1;
        j1 = byte0;
_L5:
        i1++;
        byte0 = j1;
        l1 = l2;
        if (true) goto _L2; else goto _L1
_L1:
        if (integer1 == null) goto _L4; else goto _L3
_L3:
        j1 = byte0;
        l2 = l1;
        if (l3 > (long)integer1.intValue()) goto _L5; else goto _L4
_L4:
        j1 = byte0;
        l2 = l1;
        if (l3 > l1)
        {
            j1 = i1;
            l2 = l3;
        }
          goto _L5
        return byte0;
    }

    private Point a(Point point, ICameraSource.Parameters parameters)
    {
        long l1;
        l1 = Math.round(((double)point.x * 1000D) / (double)point.y);
        Log.d(a, String.format("  findPictureSizeOfRatio: %d -> %dx%d", new Object[] {
            Long.valueOf(l1), Integer.valueOf(point.x), Integer.valueOf(point.y)
        }));
        parameters = d(parameters);
        if (!parameters.contains(point))
        {
            break MISSING_BLOCK_LABEL_123;
        }
        Log.d(a, String.format("    found: %d -> %dx%d", new Object[] {
            Long.valueOf(l1), Integer.valueOf(point.x), Integer.valueOf(point.y)
        }));
        return point;
        point = parameters.iterator();
        long l2;
        do
        {
            if (!point.hasNext())
            {
                break MISSING_BLOCK_LABEL_273;
            }
            parameters = (Point)point.next();
            l2 = Math.round(((double)((Point) (parameters)).x * 1000D) / (double)((Point) (parameters)).y);
            Log.d(a, (new StringBuilder()).append("    Considering Size: ").append(((Point) (parameters)).x).append("x").append(((Point) (parameters)).y).append(", ").append(l2).toString());
        } while (l1 != l2);
        try
        {
            Log.d(a, String.format("    found: %d -> %dx%d", new Object[] {
                Long.valueOf(l2), Integer.valueOf(((Point) (parameters)).x), Integer.valueOf(((Point) (parameters)).y)
            }));
        }
        // Misplaced declaration of an exception variable
        catch (Point point)
        {
            a(((Exception) (point)));
            return null;
        }
        return parameters;
        Log.e(a, "    Could not find picture Size of same aspect ratio");
        return null;
    }

    private Point a(Display display)
    {
        return new Point(display.getWidth(), display.getHeight());
    }

    private Point a(ICameraSource.Parameters parameters, boolean flag)
    {
        Log.d(a, "==== getCalculatedPreviewSize ====");
        double d1;
        Object obj;
        Object obj1;
        if (j)
        {
            d1 = 0.5D;
        } else
        {
            d1 = 0.02D;
        }
        obj1 = Build.MODEL;
        obj = parameters.getPreviewSize();
        parameters = c(parameters);
        Log.d(a, String.format("  Screen resolution: %dx%d", new Object[] {
            Integer.valueOf(g().x), Integer.valueOf(g().y)
        }));
        if (!((String) (obj1)).equalsIgnoreCase("DROIDX")) goto _L2; else goto _L1
_L1:
        Log.w(a, String.format("  Device DroidX -- Forced resolution %dx%d", new Object[] {
            Integer.valueOf(((Point) (obj)).x), Integer.valueOf(((Point) (obj)).y)
        }));
_L7:
        Log.d(a, "==== end getCalculatedPreviewSize ====");
        return ((Point) (obj));
_L2:
        if (h != null && !flag)
        {
            break MISSING_BLOCK_LABEL_432;
        }
        if (g == null) goto _L4; else goto _L3
_L3:
        int i1;
        int j1;
        j1 = Math.max(g.x, g.y);
        i1 = Math.min(g.x, g.y);
_L5:
        int l1;
        double d2 = (double)j1 / (double)i1;
        Log.d(a, (new StringBuilder()).append("  Target Size: ").append(j1).append("x").append(i1).toString());
        Log.d(a, (new StringBuilder()).append("  Target Aspect Ratio: ").append(d2).toString());
        l1 = a(d2, null, d1, 0.0D, null, null, null, ((List) (parameters)));
        int k1;
        k1 = l1;
        if (l1 != -1)
        {
            break MISSING_BLOCK_LABEL_331;
        }
        Log.w(a, "  Not matches found for target ratio.");
        k1 = a(j1, i1, k, ((List) (parameters)));
        if (k1 < 0)
        {
            break MISSING_BLOCK_LABEL_416;
        }
        obj = (Point)parameters.get(k1);
        parameters = ((ICameraSource.Parameters) (obj));
        if (flag)
        {
            Log.d(a, "==== end getCalculatedPreviewSize ====");
            return ((Point) (obj));
        }
        break MISSING_BLOCK_LABEL_531;
_L4:
label0:
        {
            obj1 = g();
            if (!d)
            {
                break label0;
            }
            j1 = ((Point) (obj1)).y;
            i1 = ((Point) (obj1)).x;
        }
          goto _L5
        j1 = ((Point) (obj1)).x;
        i1 = ((Point) (obj1)).y;
          goto _L5
        Log.w(a, "  Failed to find suitable preview Size.");
        parameters = ((ICameraSource.Parameters) (obj));
        break MISSING_BLOCK_LABEL_531;
        obj.x = Math.max(h.x, h.y);
        obj.y = Math.min(h.x, h.y);
        Log.d(a, String.format("  Client set Size: %dx%d", new Object[] {
            Integer.valueOf(((Point) (obj)).x), Integer.valueOf(((Point) (obj)).y)
        }));
        continue; /* Loop/switch isn't completed */
        parameters;
        Log.d(a, "==== end getCalculatedPreviewSize ====");
        throw parameters;
        obj = parameters;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void a(Exception exception)
    {
        Log.d(a, (new StringBuilder()).append("  Encountered exception: ").append(exception.toString()).toString());
        Log.d(a, (new StringBuilder()).append("  Detail: ").append(exception.getMessage()).toString());
        Log.d(a, "  Trace: ");
        exception = exception.getStackTrace();
        int j1 = exception.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            StackTraceElement stacktraceelement = exception[i1];
            Log.d(a, (new StringBuilder()).append("    ").append(stacktraceelement.toString()).toString());
        }

    }

    private Point b(Display display)
    {
        Point point = new Point(0, 0);
        display.getSize(point);
        return point;
    }

    private Point b(ICameraSource.Parameters parameters, boolean flag)
    {
        Point point;
        List list;
        HashSet hashset;
        point = parameters.getPictureSize();
        Log.d(a, "==== getCalculatedPictureSize ====");
        Log.d(a, String.format("  Screen resolution: %dx%d", new Object[] {
            Integer.valueOf(g().x), Integer.valueOf(g().y)
        }));
        list = d(parameters);
        parameters = c(parameters);
        hashset = new HashSet();
        Point point1;
        for (parameters = parameters.iterator(); parameters.hasNext(); hashset.add(Double.valueOf((double)point1.x / (double)point1.y)))
        {
            point1 = (Point)parameters.next();
        }

        break MISSING_BLOCK_LABEL_149;
        parameters;
        Log.d(a, "==== end getCalculatedPictureSize ====");
        throw parameters;
        parameters = i;
        if (parameters != null && !flag)
        {
            break MISSING_BLOCK_LABEL_589;
        }
        int i1 = g().x;
        int k1 = g().y;
        parameters = new ArrayList();
        parameters.add(Double.valueOf((double)i1 / (double)k1));
        parameters.add(Double.valueOf((double)k1 / (double)i1));
        Collections.sort(parameters);
        if (((Point)list.get(0)).x / ((Point)list.get(0)).y >= 1) goto _L2; else goto _L1
_L1:
        parameters = (Double)parameters.get(0);
_L5:
        double d1;
        int l1;
        d1 = parameters.doubleValue();
        Log.d(a, (new StringBuilder()).append("  Target Aspect Ratio: ").append(d1).toString());
        l1 = a(d1, new ArrayList(hashset), 0.10000000000000001D, 0.01D, l, m, n, list);
        int j1;
        j1 = l1;
        if (l1 != -1)
        {
            break MISSING_BLOCK_LABEL_374;
        }
        j1 = a(0.0D, null, 2147483647D, 0.0D, l, m, n, list);
        l1 = j1;
        if (j1 != -1)
        {
            break MISSING_BLOCK_LABEL_407;
        }
        l1 = a(d1, null, 0.10000000000000001D, 0.0D, l, m, null, list);
        j1 = l1;
        if (l1 != -1)
        {
            break MISSING_BLOCK_LABEL_440;
        }
        j1 = a(0.0D, null, 2147483647D, 0.0D, l, m, null, list);
        l1 = j1;
        if (j1 != -1)
        {
            break MISSING_BLOCK_LABEL_460;
        }
        l1 = a(((Integer) (null)), ((Integer) (null)), list);
        if (l1 < 0) goto _L4; else goto _L3
_L3:
        parameters = (Point)list.get(l1);
        point.x = ((Point) (parameters)).x;
        point.y = ((Point) (parameters)).y;
_L6:
        Log.d(a, (new StringBuilder()).append("  Selected Size: ").append(point.x).append("x").append(point.y).toString());
        Log.d(a, "==== end getCalculatedPictureSize ====");
        return point;
_L2:
        parameters = (Double)parameters.get(1);
          goto _L5
_L4:
        Log.w(a, "  Failed to find suitable picture Size.");
          goto _L6
        parameters;
        a(parameters);
          goto _L6
        point.x = i.x;
        point.y = i.y;
        Log.d(a, String.format("  Client set Size: %dx%d", new Object[] {
            Integer.valueOf(point.x), Integer.valueOf(point.y)
        }));
          goto _L6
    }

    private void e(ICameraSource.Parameters parameters)
    {
        Log.d(a, "==== applyPreferredPreviewSize ====");
        Point point = a(parameters, false);
        try
        {
            Log.d(a, String.format("  Selected Size: %dx%d", new Object[] {
                Integer.valueOf(point.x), Integer.valueOf(point.y)
            }));
            f = new Point(point.x, point.y);
            parameters.setPreviewSize(point);
            if (j)
            {
                point = a(point, parameters);
                Log.w(a, String.format("  Is video capture, forcing picture Size: %dx%d", new Object[] {
                    Integer.valueOf(point.x), Integer.valueOf(point.y)
                }));
                parameters.setPictureSize(point);
            }
        }
        // Misplaced declaration of an exception variable
        catch (ICameraSource.Parameters parameters)
        {
            a(parameters);
        }
        Log.d(a, "==== end applyPreferredPreviewSize ====");
    }

    private void f(ICameraSource.Parameters parameters)
    {
        Log.d(a, "==== applyPreferredPictureSize ====");
        try
        {
            Point point = b(parameters, false);
            g = new Point(point.x, point.y);
            parameters.setPictureSize(point);
        }
        // Misplaced declaration of an exception variable
        catch (ICameraSource.Parameters parameters)
        {
            a(parameters);
        }
        Log.d(a, "==== end applyPreferredPictureSize ====");
    }

    public Point a(ICameraSource.Parameters parameters)
    {
        return b(parameters, true);
    }

    public void a(int i1, int j1)
    {
        h = new Point(i1, j1);
        f = null;
    }

    public void a(Point point)
    {
        if (point == null)
        {
            h = null;
            return;
        } else
        {
            a(point.x, point.y);
            return;
        }
    }

    public void a(ICameraSource icamerasource)
    {
        if (icamerasource == null)
        {
            return;
        }
        try
        {
            ICameraSource.Parameters parameters = icamerasource.getParameters();
            f(parameters);
            e(parameters);
            icamerasource.setParameters(parameters);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ICameraSource icamerasource)
        {
            Log.d(a, "applyConfiguration:");
        }
        a(((Exception) (icamerasource)));
    }

    public void a(ICameraSource icamerasource, int i1, int j1)
    {
        try
        {
            c = new Point(i1, j1);
            icamerasource = icamerasource.getParameters();
            e = icamerasource.getPreviewFormat();
            Point point = icamerasource.getPreviewSize();
            f = new Point(point.x, point.y);
            icamerasource = icamerasource.getPictureSize();
            g = new Point(((Point) (icamerasource)).x, ((Point) (icamerasource)).y);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ICameraSource icamerasource)
        {
            Log.d(a, "initializeConfiguration:");
        }
        a(((Exception) (icamerasource)));
    }

    public void a(boolean flag)
    {
        j = flag;
    }

    public boolean a()
    {
        return j;
    }

    public int b()
    {
        return e;
    }

    public Point b(ICameraSource.Parameters parameters)
    {
        return a(parameters, true);
    }

    public void b(int i1, int j1)
    {
        i = new Point(i1, j1);
        g = null;
    }

    public void b(Point point)
    {
        if (point == null)
        {
            i = null;
            return;
        } else
        {
            b(point.x, point.y);
            return;
        }
    }

    public Point c()
    {
        return h;
    }

    List c(ICameraSource.Parameters parameters)
    {
        if (p == null)
        {
            Log.d(a, "==== getSupportedPreviewSizes ====");
            p = parameters.getSupportedPreviewSizes();
            Iterator iterator = p.iterator();
            int i1 = g().x;
            int j1 = g().y;
            Log.d(a, "  Supported Sizes: ");
            Point point1;
            for (; iterator.hasNext(); Log.d(a, String.format("    %dx%d", new Object[] {
    Integer.valueOf(point1.x), Integer.valueOf(point1.y)
})))
            {
                point1 = (Point)iterator.next();
            }

            if (Build.MODEL.equalsIgnoreCase("Nexus 10"))
            {
                p.clear();
                p.add(new Point(640, 480));
                Log.w(a, String.format("  Device Nexus 10 -- Force resolution %dx%d", new Object[] {
                    Integer.valueOf(640), Integer.valueOf(480)
                }));
            } else
            {
                Iterator iterator1 = p.iterator();
                while (iterator1.hasNext()) 
                {
                    Point point2 = (Point)iterator1.next();
                    if ((float)(point2.x * point2.y) / (float)(j1 * i1) > 4.2F)
                    {
                        Log.w(a, String.format("    Removing: %dx%d (too big for Size of ImageCaptureView) ", new Object[] {
                            Integer.valueOf(point2.x), Integer.valueOf(point2.y)
                        }));
                        iterator1.remove();
                    } else
                    if (a(point2, parameters) == null)
                    {
                        Log.w(a, String.format("    Removing %dx%d (no corresponding picture resolution)", new Object[] {
                            Integer.valueOf(point2.x), Integer.valueOf(point2.y)
                        }));
                        iterator1.remove();
                    }
                }
            }
            Log.d(a, "  Supported Sizes After Matching: ");
            Point point;
            for (parameters = p.iterator(); parameters.hasNext(); Log.d(a, String.format("    %dx%d", new Object[] {
    Integer.valueOf(point.x), Integer.valueOf(point.y)
})))
            {
                point = (Point)parameters.next();
            }

            Log.d(a, "==== end getSupportedPreviewSizes ====");
        }
        return p;
    }

    public void c(int i1, int j1)
    {
        k = new Point(i1, j1);
        f = null;
    }

    public Point d()
    {
        Point point;
        if (f != null)
        {
            point = f;
        } else
        {
            point = h;
        }
        if (point == null)
        {
            return null;
        } else
        {
            return new Point(point.x, point.y);
        }
    }

    List d(ICameraSource.Parameters parameters)
    {
        if (q == null)
        {
            Log.d(a, "==== getSupportedPictureSizes ====");
            q = parameters.getSupportedPictureSizes();
            Log.d(a, "  Supported Sizes: ");
            Point point;
            for (parameters = q.iterator(); parameters.hasNext(); Log.d(a, (new StringBuilder()).append("    ").append(point.x).append("x").append(point.y).toString()))
            {
                point = (Point)parameters.next();
            }

            if (Build.MODEL.equalsIgnoreCase("Nexus 10"))
            {
                parameters = (Point)q.get(0);
                parameters.set(1280, 960);
                q.clear();
                q.add(parameters);
                Log.w(a, String.format("  Device Nexus 10 -- Force resolution %dx%d", new Object[] {
                    Integer.valueOf(((Point) (parameters)).x), Integer.valueOf(((Point) (parameters)).y)
                }));
            }
            Log.d(a, "==== end getSupportedPictureSizes ====");
        }
        return q;
    }

    public Point e()
    {
        return i;
    }

    public Point f()
    {
        Point point;
        if (g != null)
        {
            point = g;
        } else
        {
            point = i;
        }
        if (point == null)
        {
            return null;
        } else
        {
            return new Point(point.x, point.y);
        }
    }

    Point g()
    {
        if (c != null)
        {
            return c;
        }
        Display display = ((WindowManager)b.getSystemService("window")).getDefaultDisplay();
        if (android.os.Build.VERSION.SDK_INT >= 13)
        {
            return b(display);
        } else
        {
            return a(display);
        }
    }

}
