// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.net.Uri;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import com.whatsapp.c2dm.C2DMRegistrar;
import com.whatsapp.fieldstats.a6;
import com.whatsapp.fieldstats.z;
import com.whatsapp.notification.a1;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import com.whatsapp.util.c1;
import de.greenrobot.event.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.whatsapp:
//            adk, App, aoz, wj, 
//            MediaData, q9, a9n, Conversation, 
//            asa, jo, ConversationRowText, u5, 
//            ij, og, k, on, 
//            my, b1, mk, alf, 
//            ab1

final class adq extends adk
{

    private static final String z[];

    adq()
    {
    }

    private void a(long l)
    {
        if (!App.af && l > 0xdbba0L && App.v(App.au))
        {
            C2DMRegistrar.a(App.au);
            App.i(z[13]);
            App.af = true;
        }
    }

    public void a()
    {
        if (App.ah.l())
        {
            com.whatsapp.App.a(new wj(this));
        }
    }

    public void a(c4 c4_1, int i)
    {
        int j = App.am;
        i;
        JVM INSTR tableswitch -1 4: default 44
    //                   -1 249
    //                   0 44
    //                   1 70
    //                   2 44
    //                   3 83
    //                   4 70;
           goto _L1 _L2 _L1 _L3 _L1 _L4 _L3
_L1:
        Log.w((new StringBuilder()).append(z[2]).append(i).toString());
_L5:
        return;
_L3:
        App.p(c4_1);
        App.c(c4_1);
        if (j == 0) goto _L5; else goto _L4
_L4:
        MediaData mediadata = (MediaData)c4_1.B;
        if (mediadata == null || !mediadata.transferred) goto _L5; else goto _L6
_L6:
        c1.a(App.au, c4_1);
        com.whatsapp.App.a(new q9(c4_1.l, mediadata.dedupeDownload));
        if (c4_1.w != 2 || c4_1.n != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (c4_1.j == null)
        {
            break; /* Loop/switch isn't completed */
        }
        com.whatsapp.App.a(true, App.aW);
        App.aW = true;
        if (j == 0) goto _L5; else goto _L7
_L7:
        com.whatsapp.App.a(true, false);
        if (j == 0) goto _L5; else goto _L8
_L8:
        if (android.os.Build.VERSION.SDK_INT < 16) goto _L5; else goto _L9
_L9:
        a9n a9n1 = (a9n)g.a().a(com/whatsapp/a9n);
        asa asa1 = Conversation.B();
        if (!asa1.a() || a9n1.a() || !asa1.b().A.equals(c4_1.y.a))
        {
            com.whatsapp.App.a(true, true, true, false);
        }
        if (j == 0) goto _L5; else goto _L2
_L2:
        if (j == 0) goto _L5; else goto _L1
    }

    public void a(c4 c4_1, boolean flag)
    {
        if (c4_1 != null)
        {
            com.whatsapp.App.a(z[0], c4_1);
            Log.i((new StringBuilder()).append(z[1]).append(flag).toString());
            App.f(c4_1);
            if (!c4_1.y.b && flag && com.whatsapp.App.a(c4_1) && App.i(c4_1))
            {
                com.whatsapp.jo.a().a(c4_1);
            }
        }
    }

    public void a(Collection collection, Map map)
    {
        int j = App.am;
        HashMap hashmap = new HashMap();
        Iterator iterator = collection.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            c4 c4_1 = (c4)iterator.next();
            Collection collection1 = (Collection)hashmap.get(c4_1.y.a);
            collection = collection1;
            if (collection1 == null)
            {
                collection = new ArrayList();
                hashmap.put(c4_1.y.a, collection);
            }
            collection.add(c4_1);
        } while (j == 0);
        collection = hashmap.entrySet().iterator();
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            Object obj = (java.util.Map.Entry)collection.next();
            Integer integer = (Integer)map.get(((java.util.Map.Entry) (obj)).getKey());
            String s = (String)((java.util.Map.Entry) (obj)).getKey();
            obj = (Collection)((java.util.Map.Entry) (obj)).getValue();
            int i;
            if (integer == null)
            {
                i = 0;
            } else
            {
                i = integer.intValue();
            }
            com.whatsapp.App.a(s, ((Collection) (obj)), i);
        } while (j == 0);
    }

    public void b(c4 c4_1)
    {
        if (c4_1.j != null && !App.ao && c4_1.w != 8 && System.currentTimeMillis() - c4_1.I > 0xdbba0L)
        {
            App.ao = true;
            boolean flag = App.v(App.au);
            if (flag)
            {
                com.whatsapp.App.a(App.au, App.c(App.au) + 1);
                if (App.v(App.au) != flag)
                {
                    com.whatsapp.App.a(App.au);
                }
            }
        }
    }

    public void b(c4 c4_1, int i)
    {
        int j1 = App.am;
        if (c4_1 == null) goto _L2; else goto _L1
_L1:
        byte byte0 = c4_1.w;
        if (byte0 == 8) goto _L2; else goto _L3
_L3:
        Object obj;
        URLSpan aurlspan[];
        Object obj2;
        String s;
        int j;
        int l;
        int i1;
        long l1;
        boolean flag;
        try
        {
            byte0 = c4_1.w;
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            throw c4_1;
        }
        if (byte0 != 0) goto _L5; else goto _L4
_L4:
        byte0 = 0;
        j = byte0;
        obj = new SpannableString(c4_1.e());
        j = byte0;
        Linkify.addLinks(((android.text.Spannable) (obj)), 1);
        j = byte0;
        aurlspan = (URLSpan[])((SpannableString) (obj)).getSpans(0, ((SpannableString) (obj)).length(), android/text/style/URLSpan);
        if (aurlspan == null) goto _L7; else goto _L6
_L6:
        j = aurlspan.length;
        if (j <= 0) goto _L7; else goto _L8
_L8:
        byte0 = 1;
_L23:
        if (!byte0)
        {
            break MISSING_BLOCK_LABEL_1322;
        }
        j = byte0;
        l = aurlspan.length;
_L35:
        i1 = byte0;
        j = byte0;
        if (c4_1.e().length() == 0)
        {
            break MISSING_BLOCK_LABEL_170;
        }
        j = byte0;
        aurlspan = new a6();
        j = byte0;
        aurlspan.a = Double.valueOf(l);
        j = byte0;
        com.whatsapp.fieldstats.z.a(App.au, aurlspan);
        i1 = byte0;
_L22:
        if (i1 == 0) goto _L5; else goto _L9
_L9:
        flag = com.whatsapp.ConversationRowText.a(c4_1);
        if (flag)
        {
            try
            {
                if (App.i(c4_1))
                {
                    com.whatsapp.jo.a().a(c4_1);
                }
            }
            // Misplaced declaration of an exception variable
            catch (c4 c4_1)
            {
                throw c4_1;
            }
        }
_L5:
        if (c4_1.y.b) goto _L11; else goto _L10
_L10:
        l1 = System.currentTimeMillis() - c4_1.I;
        s = c4_1.y.a;
        obj2 = u5.d(s);
        Object obj3;
        try
        {
            if (App.o.b(s, c4_1.G) >= 0)
            {
                App.o.a(s, c4_1.G);
                App.s(s);
            }
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            throw c4_1;
        }
        try
        {
            flag = ((og) (obj2)).k();
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            try
            {
                throw c4_1;
            }
            // Misplaced declaration of an exception variable
            catch (c4 c4_1)
            {
                throw c4_1;
            }
        }
        if (!flag) goto _L13; else goto _L12
_L12:
        if (c4_1.G == null) goto _L15; else goto _L14
_L14:
        aurlspan = App.az.e(c4_1.G);
_L24:
        try
        {
            if (TextUtils.isEmpty(c4_1.p))
            {
                Log.w((new StringBuilder()).append(z[7]).append(s).append(z[9]).append(c4_1.y.toString()).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            throw c4_1;
        }
        if (aurlspan == null)
        {
            break MISSING_BLOCK_LABEL_406;
        }
        flag = TextUtils.isEmpty(c4_1.p);
        if (!flag)
        {
            try
            {
                if (!c4_1.p.equals(((og) (aurlspan)).N))
                {
                    aurlspan.N = c4_1.p;
                    App.b(new on(this, aurlspan));
                }
            }
            // Misplaced declaration of an exception variable
            catch (c4 c4_1)
            {
                throw c4_1;
            }
        }
        flag = com.whatsapp.App.a(c4_1, ((og) (obj2)), aurlspan);
        if (flag)
        {
            try
            {
                if (App.i(c4_1))
                {
                    com.whatsapp.jo.a().a(c4_1);
                }
            }
            // Misplaced declaration of an exception variable
            catch (c4 c4_1)
            {
                throw c4_1;
            }
        }
        obj3 = (a9n)g.a().a(com/whatsapp/a9n);
        aurlspan = Conversation.B();
        flag = aurlspan.a();
        if (!flag) goto _L17; else goto _L16
_L16:
        flag = ((a9n) (obj3)).a();
        if (flag) goto _L17; else goto _L18
_L18:
        flag = aurlspan.b().A.equals(s);
        if (!flag) goto _L17; else goto _L19
_L19:
        obj3 = c4_1.j;
        if (obj3 == null) goto _L21; else goto _L20
_L20:
        try
        {
            a(l1);
            flag = App.aW;
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            throw c4_1;
        }
        if (!flag) goto _L21; else goto _L2
_L2:
        return;
        c4_1;
        throw c4_1;
        aurlspan;
        try
        {
            throw aurlspan;
        }
        // Misplaced declaration of an exception variable
        catch (URLSpan aurlspan[])
        {
            j = byte0;
        }
        try
        {
            throw aurlspan;
        }
        // Misplaced declaration of an exception variable
        catch (URLSpan aurlspan[])
        {
            i1 = j;
        }
          goto _L22
_L7:
        byte0 = 0;
          goto _L23
        c4_1;
        throw c4_1;
_L15:
        aurlspan = null;
          goto _L24
_L13:
        aurlspan = ((URLSpan []) (obj2));
          goto _L24
        c4_1;
        throw c4_1;
        c4_1;
        throw c4_1;
        c4_1;
        try
        {
            throw c4_1;
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1) { }
        try
        {
            throw c4_1;
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1) { }
        try
        {
            throw c4_1;
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1) { }
        throw c4_1;
_L21:
        App.aW = true;
        flag = ((og) (obj2)).a.equals(aurlspan.b().aD.a);
        if (flag)
        {
            try
            {
                a1.c().b();
                if (Conversation.au)
                {
                    com.whatsapp.App.a(Uri.parse(z[4]));
                }
            }
            // Misplaced declaration of an exception variable
            catch (c4 c4_1)
            {
                throw c4_1;
            }
        }
        flag = my.d();
        if (!flag) goto _L26; else goto _L25
_L25:
        c4_1.d = z[8];
        if (j1 == 0) goto _L26; else goto _L17
_L17:
        Object obj1;
        byte byte1;
        boolean flag1;
        try
        {
            obj2.c = ((og) (obj2)).c + 1;
            if (android.os.Build.VERSION.SDK_INT >= 16)
            {
                a1.c().a(s, c4_1);
            }
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            throw c4_1;
        }
        try
        {
            App.b(new b1(this, ((og) (obj2))));
            obj1 = c4_1.j;
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            try
            {
                throw c4_1;
            }
            // Misplaced declaration of an exception variable
            catch (c4 c4_1) { }
            try
            {
                throw c4_1;
            }
            // Misplaced declaration of an exception variable
            catch (c4 c4_1)
            {
                throw c4_1;
            }
        }
        if (obj1 == null) goto _L28; else goto _L27
_L27:
        byte1 = c4_1.w;
        if (byte1 != 2)
        {
            break MISSING_BLOCK_LABEL_755;
        }
        if (c4_1.n == 1)
        {
            break MISSING_BLOCK_LABEL_766;
        }
        com.whatsapp.App.a(true, App.aW);
        App.aW = true;
        try
        {
            a(l1);
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            try
            {
                throw c4_1;
            }
            // Misplaced declaration of an exception variable
            catch (c4 c4_1) { }
            try
            {
                throw c4_1;
            }
            // Misplaced declaration of an exception variable
            catch (c4 c4_1)
            {
                throw c4_1;
            }
        }
        if (j1 == 0) goto _L26; else goto _L28
_L28:
        byte1 = c4_1.w;
        if (byte1 != 2) goto _L30; else goto _L29
_L29:
        if (c4_1.n == 1) goto _L26; else goto _L30
_L30:
        com.whatsapp.App.a(true, false);
_L26:
        App.e(c4_1);
        App.f(c4_1);
        if (j1 == 0) goto _L2; else goto _L11
_L11:
        flag1 = c4_1.y.b;
        if (!flag1)
        {
            break; /* Loop/switch isn't completed */
        }
        flag1 = z[5].equals(c4_1.d);
        if (!flag1)
        {
            break; /* Loop/switch isn't completed */
        }
        byte1 = c4_1.w;
        if (byte1 != 5)
        {
            break MISSING_BLOCK_LABEL_899;
        }
        obj1 = c4_1.B;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_899;
        }
        flag1 = c4_1.B instanceof MediaData;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_899;
        }
        ((MediaData)c4_1.B).transferred = true;
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_913;
        }
        try
        {
            if (c4_1.w != 0)
            {
                com.whatsapp.jo.a().a(c4_1);
            }
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            throw c4_1;
        }
        App.p(c4_1);
        if (j1 == 0) goto _L2; else goto _L31
_L31:
        try
        {
            if (!c4_1.y.b)
            {
                break; /* Loop/switch isn't completed */
            }
            flag1 = (new StringBuilder()).append(App.k()).append(z[3]).toString().equals(c4_1.y.a);
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            throw c4_1;
        }
        if (!flag1)
        {
            break; /* Loop/switch isn't completed */
        }
        App.e(c4_1);
        if (j1 == 0) goto _L2; else goto _L32
_L32:
        App.e(c4_1);
        if (i == -1)
        {
            try
            {
                if (c4_1.M != 6)
                {
                    App.p(c4_1);
                }
            }
            // Misplaced declaration of an exception variable
            catch (c4 c4_1)
            {
                throw c4_1;
            }
        }
        obj1 = (a9n)g.a().a(com/whatsapp/a9n);
        obj2 = Conversation.B();
        try
        {
            flag1 = com.whatsapp.mk.a(c4_1);
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            try
            {
                throw c4_1;
            }
            // Misplaced declaration of an exception variable
            catch (c4 c4_1) { }
            try
            {
                throw c4_1;
            }
            // Misplaced declaration of an exception variable
            catch (c4 c4_1) { }
            try
            {
                throw c4_1;
            }
            // Misplaced declaration of an exception variable
            catch (c4 c4_1)
            {
                throw c4_1;
            }
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_1149;
        }
        flag1 = ((asa) (obj2)).a();
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_1076;
        }
        flag1 = ((a9n) (obj1)).a();
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_1076;
        }
        if (((asa) (obj2)).b().A.equals(c4_1.y.a))
        {
            break MISSING_BLOCK_LABEL_1149;
        }
        l1 = c4_1.t;
        if (l1 != 1L)
        {
            obj1 = u5.d(c4_1.y.a);
            obj1.c = ((og) (obj1)).c + 1;
            App.b(new alf(this, ((og) (obj1))));
        }
        try
        {
            if (android.os.Build.VERSION.SDK_INT >= 16)
            {
                a1.c().a(c4_1.y.a, c4_1);
            }
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            throw c4_1;
        }
        com.whatsapp.App.a(true, false);
        i = c4_1.M;
        if (i == 6)
        {
            try
            {
                if (c4_1 instanceof ab1)
                {
                    com.whatsapp.App.a(((ab1)c4_1).Q);
                }
            }
            // Misplaced declaration of an exception variable
            catch (c4 c4_1)
            {
                throw c4_1;
            }
        }
        try
        {
            i = c4_1.M;
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            try
            {
                throw c4_1;
            }
            // Misplaced declaration of an exception variable
            catch (c4 c4_1)
            {
                throw c4_1;
            }
        }
        if (i != 6) goto _L2; else goto _L33
_L33:
        if (c4_1.t != 6L) goto _L2; else goto _L34
_L34:
        App.d(c4_1.y.c, c4_1.y.a, z[6]);
        return;
        c4_1;
        throw c4_1;
        c4_1;
        try
        {
            throw c4_1;
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1) { }
        throw c4_1;
        c4_1;
        try
        {
            throw c4_1;
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1) { }
        try
        {
            throw c4_1;
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1) { }
        try
        {
            throw c4_1;
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1) { }
        try
        {
            throw c4_1;
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1) { }
        try
        {
            throw c4_1;
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1) { }
        try
        {
            throw c4_1;
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1) { }
        throw c4_1;
        c4_1;
        throw c4_1;
        c4_1;
        try
        {
            throw c4_1;
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1) { }
        throw c4_1;
        c4_1;
        throw c4_1;
        l = 0;
          goto _L35
    }

    public void c(c4 c4_1)
    {
label0:
        {
            int i = App.am;
            if (c4_1 == null)
            {
                break label0;
            }
            com.whatsapp.App.a(z[10], c4_1);
            if (!c4_1.y.b)
            {
                App.f(c4_1);
                if (i == 0)
                {
                    break label0;
                }
            }
            if (c4_1.M == 6)
            {
                if (c4_1 instanceof ab1)
                {
                    com.whatsapp.App.a(((ab1)c4_1).Q);
                    if (i == 0)
                    {
                        break label0;
                    }
                }
                if (c4_1.t != 6L)
                {
                    break label0;
                }
                App.d(c4_1.y.c, c4_1.y.a, z[11]);
                if (i == 0)
                {
                    break label0;
                }
            }
            if (z[12].equals(c4_1.d))
            {
                App.d(c4_1.y.c, 200);
            }
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[14];
        obj = "XxD\b'\\{GF-\\'FB)\\aBB.\026fQP?Kd\024";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        j = 0;
_L8:
label0:
        {
            if (l > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "XxD\b'\\{GF-\\'FB)\\aBB.\026fQP?Kd\024";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "XxD\b'\\{GF-\\k\\F$^mP\007?WcZH=W(@^:\\(";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "y{\032P\"X|GF:I&ZB>";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "XfPU%Pl\032U/JgAU)\\2\033\b)Ve\032P\"X|GF:I'\006\026y\b8\r\036|\f9";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "KmXF3";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "IaWS?Km";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "T{SF.]mP\b,KgYx$XeQ\007#J(QJ:Mq\024\007 Pl\016";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                obj = "PfBN9";
                byte0 = 7;
                i = 8;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "\031eQT9XoQ\035";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "XxD\b'\\{GF-\\'FB)\\aBB.\026lAW&PkUS/\031";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "IaWS?Km";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "KmXF3";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "ZgY\t-VgSK/\027xFH)\\{G\t-XxDT";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c2 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 388
    //                   0 411
    //                   1 418
    //                   2 425
    //                   3 432;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_432;
_L3:
        byte byte1 = 74;
_L9:
        obj[j] = (char)(byte1 ^ c2);
        j++;
          goto _L8
_L4:
        byte1 = 57;
          goto _L9
_L5:
        byte1 = 8;
          goto _L9
_L6:
        byte1 = 52;
          goto _L9
        byte1 = 39;
          goto _L9
    }
}
