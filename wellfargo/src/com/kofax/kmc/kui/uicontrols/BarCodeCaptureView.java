// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.location.LocationManager;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import com.kofax.kmc.ken.engines.data.BarCodeDataFormat;
import com.kofax.kmc.ken.engines.data.BarCodeDirection;
import com.kofax.kmc.ken.engines.data.BarCodeResult;
import com.kofax.kmc.ken.engines.data.BarCodeType;
import com.kofax.kmc.ken.engines.data.BoundingTetragon;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.kui.uicontrols.data.GpsUsageLimits;
import com.kofax.kmc.kui.uicontrols.data.GuidingLine;
import com.kofax.kmc.kui.uicontrols.data.SearchDirection;
import com.kofax.kmc.kui.uicontrols.data.Symbology;
import com.kofax.kmc.kut.utilities.IpLibUtil;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcException;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.manateeworks.BarcodeScanner;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.kofax.kmc.kui.uicontrols:
//            ImageCaptureView, s, j, k, 
//            BarCodeFoundListener, BarCodeFoundEvent, b

public class BarCodeCaptureView extends ImageCaptureView
{

    private static final String a = "BarCodeCaptureView";
    private static final Rect b = new Rect(0, 0, 100, 100);
    private static final int c = 1;
    private static final int d = 2;
    private static final int e = 4;
    private static final int f = 8;
    private final boolean g;
    private final k h;
    private final j i;
    private final List j;
    private boolean k;
    private int l;
    private float m;
    private float n;
    private GpsUsageLimits o;
    private Symbology p[];
    private SearchDirection q[];

    public BarCodeCaptureView(Context context)
    {
        this(context, null, 0);
    }

    public BarCodeCaptureView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public BarCodeCaptureView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        j = new CopyOnWriteArrayList();
        k = false;
        o = GpsUsageLimits.ALWAYS_USE_IF_ENABLED;
        p = new Symbology[0];
        q = (new SearchDirection[] {
            SearchDirection.HORIZONTAL, SearchDirection.VERTICAL
        });
        if (isInEditMode())
        {
            h = null;
            i = null;
            g = false;
            return;
        }
        s.a(context).register(this);
        if (!System.getProperty("os.arch").equals("amd64") && !IpLibUtil.isIpLicensed())
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_EV_LICENSING);
        }
        i = new j(context, (LocationManager)context.getSystemService("location"));
        boolean flag;
        if (getResources().getConfiguration().orientation == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g = flag;
        b();
        attributeset = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        attributeset.addRule(13);
        h = new k(context);
        h.setLayoutParams(attributeset);
        addView(h);
    }

    private int a(Symbology symbology)
    {
        if (symbology == Symbology.AZTEC)
        {
            return 128;
        }
        if (symbology == Symbology.CODABAR)
        {
            return 1024;
        }
        if (symbology == Symbology.CODE128)
        {
            return 32;
        }
        if (symbology == Symbology.CODE25)
        {
            return 256;
        }
        if (symbology == Symbology.CODE39)
        {
            return 8;
        }
        if (symbology == Symbology.CODE93)
        {
            return 512;
        }
        if (symbology == Symbology.DATAMATRIX)
        {
            return 2;
        }
        if (symbology == Symbology.EAN || symbology == Symbology.UPC)
        {
            return 16;
        }
        if (symbology == Symbology.PDF417)
        {
            return 64;
        }
        return symbology != Symbology.QR ? 0 : 1;
    }

    private int a(SearchDirection asearchdirection[])
    {
        int i1 = 0;
        int k1 = asearchdirection.length;
        int j1 = 0;
        for (; i1 < k1; i1++)
        {
            j1 |= asearchdirection[i1].getValue();
        }

        return j1;
    }

    private BarCodeDirection a(BoundingTetragon boundingtetragon)
    {
        if (boundingtetragon == null)
        {
            return BarCodeDirection.UNKNOWN;
        }
        float f1 = boundingtetragon.getTopRight().x - boundingtetragon.getTopLeft().x;
        float f2 = boundingtetragon.getTopRight().y - boundingtetragon.getTopLeft().y;
        double d1 = Math.sqrt(f1 * f1 + f2 * f2);
        d1 = Math.atan2((double)f2 / d1, (double)f1 / d1);
        Log.d("BarCodeCaptureView", (new StringBuilder()).append("Angle: ").append((180D * d1) / 3.1415926535897931D).toString());
        if (b(getSearchDirection()))
        {
            if (d1 <= -1.5707963267948966D)
            {
                return BarCodeDirection.RIGHT_LEFT;
            }
            if (d1 > -1.5707963267948966D && d1 <= 1.5707963267948966D)
            {
                return BarCodeDirection.LEFT_RIGHT;
            }
            if (d1 > 1.5707963267948966D)
            {
                return BarCodeDirection.RIGHT_LEFT;
            }
        } else
        if (c(getSearchDirection()))
        {
            if (d1 > -3.1415926535897931D && d1 <= 0.0D || d1 > 3.1415926535897931D && d1 < 6.2831853071795862D)
            {
                return BarCodeDirection.BOTTOM_UP;
            }
            if (d1 > 0.0D && d1 <= 3.1415926535897931D || d1 < -3.1415926535897931D && d1 > -6.2831853071795862D)
            {
                return BarCodeDirection.TOP_DOWN;
            }
        } else
        {
            if (d1 <= -2.3561944901923448D)
            {
                return BarCodeDirection.RIGHT_LEFT;
            }
            if (d1 > -2.3561944901923448D && d1 <= -0.78539816339744828D)
            {
                return BarCodeDirection.BOTTOM_UP;
            }
            if (d1 > -0.78539816339744828D && d1 <= 0.78539816339744828D)
            {
                return BarCodeDirection.LEFT_RIGHT;
            }
            if (d1 > 0.78539816339744828D && d1 <= 2.3561944901923448D)
            {
                return BarCodeDirection.TOP_DOWN;
            }
            if (d1 > 2.3561944901923448D)
            {
                return BarCodeDirection.RIGHT_LEFT;
            }
        }
        return BarCodeDirection.UNKNOWN;
    }

    private void a(BarCodeResult barcoderesult, Image image)
    {
        Iterator iterator;
        if (i.c())
        {
            try
            {
                image.getClass();
                com.kofax.kmc.ken.engines.data.Image.FriendI friendi = new com.kofax.kmc.ken.engines.data.Image.FriendI(image, "com.kofax.kmc.kui.uicontrols");
                friendi.setImageLatitude(Float.valueOf((float)i.a()));
                friendi.setImageLongitude(Float.valueOf((float)i.b()));
                friendi.setImagePitch(Float.valueOf(m));
                friendi.setImageRoll(Float.valueOf(n));
            }
            catch (KmcException kmcexception) { }
        }
        for (iterator = j.iterator(); iterator.hasNext(); ((BarCodeFoundListener)iterator.next()).barCodeFound(new BarCodeFoundEvent(this, barcoderesult, image))) { }
    }

    private void a(a a1)
    {
        Object obj;
        Object obj1;
        if (a1.a.b == 17)
        {
            obj = new YuvImage(a1.a.a, 17, a1.d, a1.e, null);
            a1.a = null;
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            ((YuvImage) (obj)).compressToJpeg(new Rect(0, 0, a1.d, a1.e), 90, bytearrayoutputstream);
            byte abyte0[] = bytearrayoutputstream.toByteArray();
            abyte0 = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length);
        } else
        {
            abyte0 = BitmapFactory.decodeByteArray(a1.a.a, 0, a1.a.a.length);
        }
        if (abyte0 == null)
        {
            Log.w("BarCodeCaptureView", (new StringBuilder()).append("Failed to decode bitmap from format: ").append(a1.a.b).toString());
            obj1 = abyte0;
        } else
        {
            obj1 = abyte0;
            if (l != 0)
            {
                obj1 = new Matrix();
                ((Matrix) (obj1)).postRotate(l);
                obj1 = Bitmap.createBitmap(abyte0, 0, 0, abyte0.getWidth(), abyte0.getHeight(), ((Matrix) (obj1)), true);
                abyte0.recycle();
            }
        }
        abyte0 = new BarCodeResult();
        abyte0.setType(b(a1.c));
        abyte0.setBoundingBox(calculateBound(a1.f, l, a1.d, a1.e));
        abyte0.setDirection(a(abyte0.getBoundingBox()));
        if (a(a1.b))
        {
            abyte0.setDataFormat(BarCodeDataFormat.ASCII);
            abyte0.setValue(new String(a1.b));
        } else
        {
            abyte0.setDataFormat(BarCodeDataFormat.BASE_64);
            abyte0.setValue(Base64.encodeToString(a1.b, 0));
        }
        Log.d("BarCodeCaptureView", (new StringBuilder()).append("handleDecodeSuccess: ").append(abyte0.getType()).toString());
        Log.d("BarCodeCaptureView", (new StringBuilder()).append("  Direction: ").append(abyte0.getDirection()).toString());
        if (abyte0.getBoundingBox() != null)
        {
            Log.d("BarCodeCaptureView", (new StringBuilder()).append("  Bound: TL=").append(abyte0.getBoundingBox().getTopLeft()).append(" TR=").append(abyte0.getBoundingBox().getTopRight()).append(" BL=").append(abyte0.getBoundingBox().getBottomLeft()).append(" BR=").append(abyte0.getBoundingBox().getBottomRight()).toString());
        }
        Log.d("BarCodeCaptureView", (new StringBuilder()).append("  Format: ").append(abyte0.getDataFormat()).toString());
        Log.d("BarCodeCaptureView", (new StringBuilder()).append("  Message: ").append(abyte0.getValue()).toString());
        a1 = new ArrayList();
        a1.add(abyte0);
        obj1 = new Image(((Bitmap) (obj1)));
        ((Image) (obj1)).setImageBarCodes(a1);
        a(((BarCodeResult) (abyte0)), ((Image) (obj1)));
    }

    private boolean a(SearchDirection searchdirection, SearchDirection searchdirection1, SearchDirection asearchdirection[])
    {
        if (asearchdirection != null && asearchdirection.length != 0) goto _L2; else goto _L1
_L1:
        boolean flag1 = false;
_L4:
        return flag1;
_L2:
        int j1 = asearchdirection.length;
        int i1 = 0;
        boolean flag = false;
        do
        {
            flag1 = flag;
            if (i1 >= j1)
            {
                continue;
            }
            SearchDirection searchdirection2 = asearchdirection[i1];
            if (searchdirection2 == SearchDirection.ALL || searchdirection2 == searchdirection1)
            {
                return false;
            }
            if (searchdirection2 == searchdirection)
            {
                flag = true;
            }
            i1++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private boolean a(byte abyte0[])
    {
        for (int i1 = 0; i1 < abyte0.length; i1++)
        {
            if (abyte0[i1] < 32 || abyte0[i1] >= 127)
            {
                return false;
            }
        }

        return true;
    }

    private boolean a(float af[])
    {
        boolean flag = false;
        if (af == null)
        {
            return true;
        }
        int i1 = 0;
        int j1;
        int k1;
        for (j1 = 0; i1 < af.length; j1 = k1)
        {
            k1 = j1;
            if (af[i1] == 0.0F)
            {
                k1 = j1 + 1;
            }
            i1++;
        }

        if (j1 == af.length)
        {
            flag = true;
        }
        return flag;
    }

    private BarCodeType b(int i1)
    {
        switch (i1)
        {
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        default:
            return BarCodeType.UNKNOWN;

        case 11: // '\013'
            return BarCodeType.CODE128;

        case 15: // '\017'
        case 16: // '\020'
            return BarCodeType.CODE25;

        case 2: // '\002'
            return BarCodeType.CODE39;

        case 17: // '\021'
            return BarCodeType.CODE93;

        case 14: // '\016'
            return BarCodeType.AZTEC;

        case 18: // '\022'
            return BarCodeType.CODABAR;

        case 1: // '\001'
            return BarCodeType.DATAMATRIX;

        case 9: // '\t'
        case 10: // '\n'
            return BarCodeType.UPC;

        case 7: // '\007'
        case 8: // '\b'
            return BarCodeType.EAN;

        case 12: // '\f'
            return BarCodeType.PDF417;

        case 13: // '\r'
            return BarCodeType.QR;
        }
    }

    private void b()
    {
        BarcodeScanner.MWBregisterCode(64, "Kofax.Android.PDF.UDL", "5A52C54FD2EEB8A9DC6599740ABB69E6B397378ADBE1CE342517D4700C9F56AD");
        BarcodeScanner.MWBregisterCode(8, "Kofax.Android.C39.UDL", "2DBAB7E1F20796746AFA20069DE9F5B7C2D5CAA2F63A86BB6B89634D6C4336DD");
        BarcodeScanner.MWBregisterCode(1, "Kofax.Android.QR.UDL", "5C44241E3E38A6E3BFBA3FB5949112DA91544173A67BFA58B622123B0C5341BC");
        BarcodeScanner.MWBregisterCode(512, "Kofax.Android.C93.UDL", "076F86B485C8E77B90FC504C5CBE62C710B1D4EACB687C4211B688AE073E85A0");
        BarcodeScanner.MWBregisterCode(1024, "Kofax.Android.CB.UDL", "722D1BF70863DBF0D933606DC43A259E2B0DFE7BE1DEAF3F7A5599CEBF076BC3");
        BarcodeScanner.MWBregisterCode(2, "Kofax.Android.DM.UDL", "2CA472C41CEF35CFDC61211A06C1AEF49AD8D4405B07598C6008F4287D34ACFA");
        BarcodeScanner.MWBregisterCode(16, "Kofax.Android.EANUPC.UDL", "295D23C3BCCF2A8C4E684BE761DFA13C44F30E15A707430D645BC4584083491B");
        BarcodeScanner.MWBregisterCode(32, "Kofax.Android.C128.UDL", "5C62C3BE32CA208BD81CAE8F4390CEA5B3E36DD5BCA6379291B4A0F398A5F437");
        BarcodeScanner.MWBregisterCode(256, "Kofax.Android.C25.UDL", "9A5282B31BBFF5DDA1B564105401D219B8C5A5832EE7897D42E2B1C83F487B59");
        BarcodeScanner.MWBregisterCode(128, "Kofax.Android.AZTEC.UDL", "5C6F013332805C58FA52848F854B6DD4B593CE2A91AF0CAAE252E0D8C50B9A9B");
        c();
        d();
        BarcodeScanner.MWBsetFlags(512, 8);
        BarcodeScanner.MWBsetLevel(2);
    }

    private boolean b(a a1)
    {
        BarCodeType barcodetype;
        List list;
        barcodetype = b(a1.c);
        list = Arrays.asList(getSymbologies());
        if (barcodetype != BarCodeType.EAN || list.contains(Symbology.EAN)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (barcodetype != BarCodeType.UPC || list.contains(Symbology.UPC))
        {
            break; /* Loop/switch isn't completed */
        }
        if (a1.c != 9)
        {
            continue; /* Loop/switch isn't completed */
        }
        a1.c = 7;
        byte abyte0[] = new byte[a1.b.length + 1];
        abyte0[0] = 48;
        System.arraycopy(a1.b, 0, abyte0, 1, a1.b.length);
        a1.b = abyte0;
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    private boolean b(SearchDirection asearchdirection[])
    {
        return a(SearchDirection.HORIZONTAL, SearchDirection.VERTICAL, asearchdirection);
    }

    private void c()
    {
        int i1 = 0;
        Symbology asymbology[] = p;
        int k1 = asymbology.length;
        int j1 = 0;
        for (; i1 < k1; i1++)
        {
            int l1 = a(asymbology[i1]);
            BarcodeScanner.MWBsetScanningRect(l1, b);
            j1 |= l1;
        }

        BarcodeScanner.MWBsetActiveCodes(j1);
    }

    private boolean c(SearchDirection asearchdirection[])
    {
        return a(SearchDirection.VERTICAL, SearchDirection.HORIZONTAL, asearchdirection);
    }

    private void d()
    {
label0:
        {
            boolean flag = true;
            int k1 = a(q);
            int i1;
            int j1;
            if ((k1 & 1) != 0 || (k1 & 2) != 0)
            {
                if (g)
                {
                    i1 = 2;
                } else
                {
                    i1 = 1;
                }
                i1 |= 0;
            } else
            {
                i1 = 0;
            }
            if ((k1 & 8) == 0)
            {
                j1 = i1;
                if ((k1 & 4) == 0)
                {
                    break label0;
                }
            }
            if (g)
            {
                j1 = ((flag) ? 1 : 0);
            } else
            {
                j1 = 2;
            }
            j1 = i1 | j1;
        }
        BarcodeScanner.MWBsetDirection(j1);
    }

    public void addBarCodeFoundEventListener(BarCodeFoundListener barcodefoundlistener)
    {
        if (!j.contains(barcodefoundlistener))
        {
            j.add(barcodefoundlistener);
        }
    }

    public BoundingTetragon calculateBound(float af[], int i1, int j1, int k1)
    {
        if (a(af) || af.length != 8)
        {
            return null;
        }
        int l1 = i1;
        if (i1 < 0)
        {
            l1 = i1 + 360;
        }
        switch (l1)
        {
        default:
            return null;

        case 90: // 'Z'
            return new BoundingTetragon(k1 - (int)af[1], (int)af[0], k1 - (int)af[3], (int)af[2], k1 - (int)af[7], (int)af[6], k1 - (int)af[5], (int)af[4]);

        case 0: // '\0'
            return new BoundingTetragon((int)af[0], (int)af[1], (int)af[2], (int)af[3], (int)af[6], (int)af[7], (int)af[4], (int)af[5]);

        case 270: 
            return new BoundingTetragon((int)af[1], j1 - (int)af[0], (int)af[3], j1 - (int)af[2], (int)af[7], j1 - (int)af[6], (int)af[5], j1 - (int)af[4]);

        case 180: 
            return new BoundingTetragon(j1 - (int)af[0], k1 - (int)af[1], j1 - (int)af[2], k1 - (int)af[3], j1 - (int)af[6], k1 - (int)af[7], j1 - (int)af[4], k1 - (int)af[5]);
        }
    }

    public GuidingLine getGuidingLine()
    {
        return h.a();
    }

    public SearchDirection[] getSearchDirection()
    {
        return q;
    }

    public Symbology[] getSymbologies()
    {
        return p;
    }

    public void onLevelnessChanged(BusEvents.LevelChangedEvent levelchangedevent)
    {
        m = levelchangedevent.pitch;
        n = levelchangedevent.roll;
    }

    public void onPreviewFrame(BusEvents.PreviewImageReadyBusEvent previewimagereadybusevent)
    {
        if (k)
        {
            byte abyte0[] = previewimagereadybusevent.imageData;
            int j1 = previewimagereadybusevent.width;
            int k1 = previewimagereadybusevent.height;
            previewimagereadybusevent.getClass();
            l = previewimagereadybusevent.rotation;
            byte abyte1[] = BarcodeScanner.MWBscanGrayscaleImage(abyte0, j1, k1);
            if (abyte1 != null && abyte1.length >= 4)
            {
                previewimagereadybusevent = "";
                for (int i1 = 0; i1 < abyte1.length; i1++)
                {
                    previewimagereadybusevent = (new StringBuilder()).append(previewimagereadybusevent).append((char)abyte1[i1]).toString();
                }

                previewimagereadybusevent = new a();
                previewimagereadybusevent.c = BarcodeScanner.MWBgetLastType();
                previewimagereadybusevent.d = j1;
                previewimagereadybusevent.e = k1;
                previewimagereadybusevent.b = abyte1;
                previewimagereadybusevent.a = new b(abyte0, 17);
                previewimagereadybusevent.f = BarcodeScanner.MWBgetBarcodeLocation();
                if (b(previewimagereadybusevent))
                {
                    Log.d("BarCodeCaptureHandler", (new StringBuilder()).append("Decode Succeeded: ").append(new String(((a) (previewimagereadybusevent)).b)).toString());
                    a(previewimagereadybusevent);
                    return;
                }
            }
        }
    }

    public void readBarcode()
    {
        k = true;
    }

    public void removeBarCodeFoundEventListener(BarCodeFoundListener barcodefoundlistener)
    {
        j.remove(barcodefoundlistener);
    }

    public void setGuidingLine(GuidingLine guidingline)
    {
        h.a(guidingline);
    }

    public void setSearchDirection(SearchDirection asearchdirection[])
    {
        q = asearchdirection;
        d();
    }

    public void setSymbologies(Symbology asymbology[])
    {
        p = asymbology;
        c();
    }


    private class a
    {

        b a;
        byte b[];
        int c;
        int d;
        int e;
        float f[];

        a()
        {
        }
    }

}
