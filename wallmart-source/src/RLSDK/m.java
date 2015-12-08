// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;

import android.os.Handler;
import android.os.Message;
import com.ebay.redlasersdk.BarcodeResult;
import com.ebay.redlasersdk.recognizers.BarcodeResultInternal;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package RLSDK:
//            c, g

final class m extends Handler
{

    private static byte g[] = null;
    private boolean a;
    private HashSet b;
    private HashSet c;
    private boolean d;
    private int e;
    private BarcodeResultInternal f;

    m()
    {
        a = false;
        b = new HashSet();
        c = new HashSet();
        d = false;
        e = 0;
        f = null;
    }

    private void a(int i)
    {
        this;
        JVM INSTR monitorenter ;
        if (i <= 80)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        e = e + 2;
        if (e > 30)
        {
            e = 30;
        }
_L1:
        if (b.size() > 0)
        {
            e = 0;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        e = e - 1;
        if (e < 0)
        {
            e = 0;
        }
          goto _L1
        Exception exception;
        exception;
        throw exception;
    }

    private void a(BarcodeResultInternal barcoderesultinternal)
    {
        this;
        JVM INSTR monitorenter ;
        if (!barcoderesultinternal.isPartialBarcode) goto _L2; else goto _L1
_L1:
        boolean flag = false;
        Iterator iterator = b.iterator();
_L3:
        boolean flag1;
        BarcodeResultInternal barcoderesultinternal1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_74;
            }
            barcoderesultinternal1 = (BarcodeResultInternal)iterator.next();
        } while (barcoderesultinternal1.barcodeType != barcoderesultinternal.barcodeType);
        flag1 = barcoderesultinternal1.barcodeString.startsWith(barcoderesultinternal.barcodeString);
        if (flag1)
        {
            flag = true;
        }
          goto _L3
        if (!flag) goto _L4; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        if (f != null) goto _L6; else goto _L5
_L5:
        f = barcoderesultinternal;
          goto _L2
        barcoderesultinternal;
        throw barcoderesultinternal;
_L6:
        if (barcoderesultinternal.barcodeString.length() <= f.barcodeString.length()) goto _L2; else goto _L7
_L7:
        f = barcoderesultinternal;
          goto _L2
    }

    private void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        d = flag;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    final HashMap a()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        HashSet hashset;
        HashSet hashset1;
        obj = new HashMap();
        hashset = new HashSet();
        hashset1 = new HashSet();
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            BarcodeResultInternal barcoderesultinternal = new BarcodeResultInternal((BarcodeResultInternal)iterator.next());
            hashset.add(barcoderesultinternal);
            if (c.contains(barcoderesultinternal))
            {
                hashset1.add(barcoderesultinternal);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_98;
        obj;
        throw obj;
        ((HashMap) (obj)).put("FoundBarcodes", hashset);
        ((HashMap) (obj)).put("NewFoundBarcodes", hashset1);
        ((HashMap) (obj)).put("InRange", Boolean.valueOf(d));
        if (f == null) goto _L2; else goto _L1
_L1:
        ((HashMap) (obj)).put("PartialBarcode", new BarcodeResultInternal(f));
        ((HashMap) (obj)).put("Guidance", Integer.valueOf(2));
_L4:
        if (g == null)
        {
            break MISSING_BLOCK_LABEL_218;
        }
        ((HashMap) (obj)).put("CameraSnapshot", g);
        g = null;
_L5:
        c.clear();
        this;
        JVM INSTR monitorexit ;
        return ((HashMap) (obj));
_L2:
        if (e <= 15) goto _L4; else goto _L3
_L3:
        ((HashMap) (obj)).put("Guidance", Integer.valueOf(1));
          goto _L4
        ((HashMap) (obj)).remove("CameraSnapshot");
          goto _L5
    }

    final void a(byte abyte0[])
    {
        this;
        JVM INSTR monitorenter ;
        g = abyte0;
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        throw abyte0;
    }

    final void a(BarcodeResultInternal abarcoderesultinternal[])
    {
        this;
        JVM INSTR monitorenter ;
        if (abarcoderesultinternal != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        int i = 0;
_L11:
        if (i >= abarcoderesultinternal.length) goto _L1; else goto _L3
_L3:
        if (!b.contains(abarcoderesultinternal[i])) goto _L5; else goto _L4
_L4:
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            BarcodeResultInternal barcoderesultinternal = (BarcodeResultInternal)iterator.next();
            if (abarcoderesultinternal[i].equals(barcoderesultinternal))
            {
                barcoderesultinternal.barcodeLocation = abarcoderesultinternal[i].barcodeLocation;
                barcoderesultinternal.mostRecentScanTime = new Date();
                barcoderesultinternal.recognizeCount = barcoderesultinternal.recognizeCount + abarcoderesultinternal[i].recognizeCount;
                barcoderesultinternal.recognizedBy = barcoderesultinternal.recognizedBy | abarcoderesultinternal[i].recognizedBy;
            }
        } while (true);
          goto _L6
        abarcoderesultinternal;
        throw abarcoderesultinternal;
_L5:
        Object obj;
        abarcoderesultinternal[i].mostRecentScanTime = new Date();
        b.add(abarcoderesultinternal[i]);
        c.add(abarcoderesultinternal[i]);
        (new StringBuilder("Recognized ")).append(abarcoderesultinternal[i].barcodeString).toString();
        RLSDK.c.a(abarcoderesultinternal[i]);
        if (f != null && abarcoderesultinternal[i].barcodeType == f.barcodeType && abarcoderesultinternal[i].barcodeString.startsWith(f.barcodeString))
        {
            f = null;
        }
        obj = abarcoderesultinternal[i].associatedBarcode;
        if (obj == null) goto _L6; else goto _L7
_L7:
        int j = 0;
_L10:
        if (j >= abarcoderesultinternal.length)
        {
            break MISSING_BLOCK_LABEL_373;
        }
        if (obj != abarcoderesultinternal[j].uniqueID) goto _L9; else goto _L8
_L8:
        obj = abarcoderesultinternal[j];
_L12:
        Iterator iterator1 = b.iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            BarcodeResultInternal barcoderesultinternal1 = (BarcodeResultInternal)iterator1.next();
            if (((BarcodeResult) (barcoderesultinternal1)).barcodeType == ((BarcodeResult) (obj)).barcodeType && ((BarcodeResult) (barcoderesultinternal1)).barcodeString.equals(((BarcodeResult) (obj)).barcodeString))
            {
                abarcoderesultinternal[i].AssociateWith(barcoderesultinternal1);
            }
        } while (true);
          goto _L6
_L9:
        j++;
          goto _L10
_L6:
        i++;
          goto _L11
        obj = null;
          goto _L12
    }

    final void b()
    {
        a = true;
    }

    public final void handleMessage(Message message)
    {
        if (a) goto _L2; else goto _L1
_L1:
        message.what;
        JVM INSTR lookupswitch 6: default 68
    //                   7751744: 112
    //                   7751745: 118
    //                   7877121: 69
    //                   7877122: 88
    //                   7877123: 100
    //                   7877124: 124;
           goto _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L2:
        return;
_L5:
        message = (d.a)message.obj;
        RLSDK.g.get().addCallbackBuffer(((d.a) (message)).a);
        return;
_L6:
        a((BarcodeResultInternal[])message.obj);
        return;
_L7:
        a((BarcodeResultInternal)message.obj);
        return;
_L3:
        a(true);
        return;
_L4:
        a(false);
        return;
_L8:
        a(((Integer)message.obj).intValue());
        return;
    }

}
