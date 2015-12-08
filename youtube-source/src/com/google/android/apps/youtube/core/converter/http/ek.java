// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.a.a.a.a.ac;
import com.google.a.a.a.a.ex;
import com.google.a.a.a.a.he;
import com.google.a.a.a.a.hh;
import com.google.a.a.a.a.hi;
import com.google.a.a.a.a.j;
import com.google.a.a.a.a.ky;
import com.google.a.a.a.a.ll;
import com.google.a.a.a.a.mp;
import com.google.a.a.a.a.p;
import com.google.a.a.a.a.ta;
import com.google.a.a.a.a.tt;
import com.google.a.a.a.a.tz;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.common.e.m;
import com.google.android.apps.youtube.core.client.q;
import com.google.android.apps.youtube.datalib.legacy.model.VastAd;
import com.google.android.apps.youtube.datalib.legacy.model.ba;
import java.net.MalformedURLException;

public final class ek
{

    public static VastAd a(tz tz1, b b1)
    {
        if (tz1 == null)
        {
            return null;
        }
        tz1 = a(tz1);
        if (b1 != null)
        {
            tz1.b(b1.a() + q.a);
        }
        return tz1.d();
    }

    private static ba a(tz tz1)
    {
        ba ba1;
        boolean flag;
        flag = false;
        ba1 = new ba(m.b(tz1.b, 3));
        if (tz1.c != null && tz1.c.length != 0) goto _L2; else goto _L1
_L1:
        L.c("Invalid Vast Ad proto with no Ads.");
_L41:
        return ba1;
_L2:
        Object aobj[];
        int i;
        int k;
        aobj = tz1.c;
        k = aobj.length;
        i = 0;
_L8:
        if (i >= k) goto _L4; else goto _L3
_L3:
        tz1 = aobj[i];
        if (((j) (tz1)).b != 1) goto _L6; else goto _L5
_L5:
        he he1;
        if (tz1 == null)
        {
            L.c("Invalid Vast Ad proto with no inLine Ad.");
            return ba1;
        }
        ba1.f(((j) (tz1)).e);
        he1 = ((j) (tz1)).c;
        ba1.d(he1.c);
        if (he1.b != null)
        {
            ba1.g(he1.b.b);
        }
        if (he1.i != null)
        {
            tz1 = he1.i;
            k = tz1.length;
            i = 0;
            while (i < k) 
            {
                Object obj1 = tz1[i];
                try
                {
                    ba1.a(com.google.android.apps.youtube.common.e.p.b(((tt) (obj1)).b));
                }
                catch (MalformedURLException malformedurlexception)
                {
                    L.c("Badly formed impression uri - ignoring");
                }
                i++;
            }
        }
        if (he1.h != null)
        {
            tz1 = he1.h;
            k = tz1.length;
            i = 0;
            while (i < k) 
            {
                String s = tz1[i];
                try
                {
                    ba1.q(com.google.android.apps.youtube.common.e.p.b(s));
                }
                catch (MalformedURLException malformedurlexception1)
                {
                    L.c("Badly formed error uri - ignoring");
                }
                i++;
            }
        }
          goto _L7
_L6:
        i++;
          goto _L8
_L7:
        if (he1.j == null) goto _L10; else goto _L9
_L9:
        tz1 = he1.j;
        k = tz1.length;
        i = 0;
_L39:
        Object aobj1[];
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        aobj1 = tz1[i];
        if (((hh) (aobj1)).b != 1) goto _L12; else goto _L11
_L11:
        aobj1 = ((hh) (aobj1)).c.e;
        k = aobj1.length;
        i = 0;
_L14:
        Object obj2;
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = aobj1[i];
        if (obj2 != null)
        {
            break; /* Loop/switch isn't completed */
        }
        L.c("Badly formed tracking event - ignoring");
_L28:
        i++;
        if (true) goto _L14; else goto _L13
_L13:
        tz1 = com.google.android.apps.youtube.common.e.p.b(((ta) (obj2)).c);
        ((ta) (obj2)).b;
        JVM INSTR tableswitch 1 19: default 888
    //                   1 461
    //                   2 461
    //                   3 470
    //                   4 479
    //                   5 488
    //                   6 497
    //                   7 524
    //                   8 444
    //                   9 506
    //                   10 444
    //                   11 515
    //                   12 533
    //                   13 444
    //                   14 444
    //                   15 444
    //                   16 444
    //                   17 542
    //                   18 551
    //                   19 568;
           goto _L15 _L16 _L16 _L17 _L18 _L19 _L20 _L21 _L15 _L22 _L15 _L23 _L24 _L15 _L15 _L15 _L15 _L25 _L26 _L27
_L15:
        L.c("Badly formed tracking uri - ignoring");
          goto _L28
_L16:
        try
        {
            ba1.b(tz1);
        }
        // Misplaced declaration of an exception variable
        catch (tz tz1)
        {
            L.c("Badly formed tracking uri - ignoring");
        }
          goto _L28
_L17:
        ba1.c(tz1);
          goto _L28
_L18:
        ba1.d(tz1);
          goto _L28
_L19:
        ba1.e(tz1);
          goto _L28
_L20:
        ba1.i(tz1);
          goto _L28
_L22:
        ba1.k(tz1);
          goto _L28
_L23:
        ba1.l(tz1);
          goto _L28
_L21:
        ba1.m(tz1);
          goto _L28
_L24:
        ba1.n(tz1);
          goto _L28
_L25:
        ba1.j(tz1);
          goto _L28
_L26:
        if (ba1.a < 3) goto _L28; else goto _L29
_L29:
        ba1.f(tz1);
          goto _L28
_L27:
        if (ba1.a < 3) goto _L28; else goto _L30
_L30:
        obj2 = ((ta) (obj2)).d;
        if (((mp) (obj2)).b != 1) goto _L32; else goto _L31
_L31:
        if (((mp) (obj2)).c < 0.0F || ((mp) (obj2)).c > 100F) goto _L34; else goto _L33
_L33:
        tz1 = new com.google.android.apps.youtube.datalib.legacy.model.VastAd.ProgressPing((int)((mp) (obj2)).c, true, tz1);
_L38:
        if (tz1 == null) goto _L28; else goto _L35
_L35:
        ba1.a(tz1);
          goto _L28
_L32:
        if (((mp) (obj2)).b != 2) goto _L37; else goto _L36
_L36:
        tz1 = new com.google.android.apps.youtube.datalib.legacy.model.VastAd.ProgressPing(((mp) (obj2)).d, false, tz1);
          goto _L38
_L37:
        L.c("Badly formed progress tracking uri - ignoring");
_L34:
        tz1 = null;
          goto _L38
_L12:
        i++;
        if (true) goto _L39; else goto _L10
_L10:
        he1 = he1.k;
        if (he1 == null) goto _L41; else goto _L40
_L40:
        int l;
        l = he1.length;
        i = 0;
_L51:
        if (i >= l) goto _L43; else goto _L42
_L42:
        int i1;
        tz1 = he1[i];
        aobj1 = ((ex) (tz1)).b;
        i1 = aobj1.length;
        k = 0;
_L50:
        if (k >= i1) goto _L45; else goto _L44
_L44:
        obj2 = aobj1[k];
        if (((ac) (obj2)).b == null || !"type".equalsIgnoreCase(((ac) (obj2)).b.b) || !"adsense".equalsIgnoreCase(((ac) (obj2)).c)) goto _L47; else goto _L46
_L46:
        if (tz1 == null) goto _L41; else goto _L48
_L48:
        tz1 = ((ex) (tz1)).d;
        k = tz1.length;
        i = ((flag) ? 1 : 0);
_L52:
        if (i >= k) goto _L41; else goto _L49
_L47:
        k++;
          goto _L50
_L45:
        i++;
          goto _L51
_L43:
        tz1 = null;
          goto _L46
_L49:
        Object obj = tz1[i];
        if (((ll) (obj)).b != null && "ConversionUrl".equalsIgnoreCase(((ll) (obj)).b.b))
        {
            try
            {
                ba1.v(com.google.android.apps.youtube.common.e.p.b(((ll) (obj)).d));
            }
            // Misplaced declaration of an exception variable
            catch (tz tz1)
            {
                L.c("Badly formed ConversionUrl uri - ignoring");
                return ba1;
            }
            return ba1;
        }
        i++;
          goto _L52
_L4:
        tz1 = null;
          goto _L5
    }
}
