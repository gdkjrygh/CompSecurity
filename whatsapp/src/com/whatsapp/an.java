// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Messenger;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.adm.ADMMessageHandler;
import com.whatsapp.c2dm.C2DMRegistrar;
import com.whatsapp.contact.b;
import com.whatsapp.contact.f;
import com.whatsapp.messaging.bi;
import com.whatsapp.messaging.e;
import com.whatsapp.messaging.r;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.b0;
import com.whatsapp.protocol.b3;
import com.whatsapp.protocol.c4;
import com.whatsapp.protocol.ct;
import com.whatsapp.util.Log;
import com.whatsapp.util.bk;
import com.whatsapp.util.x;
import de.greenrobot.event.g;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;
import org.whispersystems.aa;

// Referenced classes of package com.whatsapp:
//            App, a3d, k, og, 
//            em, DeleteAccountConfirmation, aoz, a9v, 
//            bi, dc, un, a9n, 
//            Conversation, asa, mk, oh, 
//            MediaData, pp, p5, ys, 
//            a8g, h5, ck, jy, 
//            u5, a3, jo, ala, 
//            asw, rk, ft, l1, 
//            xb, ij, ns, o4, 
//            SettingsPrivacy, m7, ChangeNumber, fl, 
//            er, aty, mb, a9g

final class an
    implements e
{

    private static final String z[];
    private final App a;

    public an(App app)
    {
        a = app;
    }

    static App a(an an1)
    {
        return an1.a;
    }

    private void a(a3d a3d1, int i, long l, String s, String s1)
    {
label0:
        {
            int j = App.am;
            if (!App.a3)
            {
                if (App.s || 1000L * l < System.currentTimeMillis())
                {
                    if (a3d.GIFT_RECEIVED == a3d1)
                    {
                        Pair pair = Pair.create(s, s1);
                        com.whatsapp.App.e.add(pair);
                    }
                    com.whatsapp.App.a(a3d1, i, l);
                    if (j == 0)
                    {
                        break label0;
                    }
                }
                App.C = l;
                App.B = i;
                App.ax = a3d1;
                App.a3 = true;
                if (a3d.GIFT_RECEIVED != a3d1)
                {
                    break label0;
                }
                Pair pair1 = Pair.create(s, s1);
                com.whatsapp.App.e.add(pair1);
                if (j == 0)
                {
                    break label0;
                }
            }
            if (a3d.GIFT_RECEIVED == a3d1)
            {
                a3d1 = Pair.create(s, s1);
                com.whatsapp.App.e.add(a3d1);
            }
        }
    }

    private void c(String s, int i)
    {
label0:
        {
            og og1 = App.az.e(s);
            if (og1 == null || og1.u == i && og1.q == i)
            {
                break label0;
            }
            if (i == -1)
            {
                App.d(s);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            com.whatsapp.App.b(new em(this, og1, i));
        }
    }

    public void a()
    {
        com.whatsapp.DeleteAccountConfirmation.e();
    }

    public void a(int i)
    {
        Log.e((new StringBuilder()).append(z[8]).append(i).toString());
    }

    public void a(int i, long l)
    {
        int j = App.am;
        i;
        JVM INSTR tableswitch 0 1: default 28
    //                   0 84
    //                   1 68;
           goto _L1 _L2 _L3
_L1:
        Log.e((new StringBuilder()).append(z[33]).append(i).append(z[34]).append(l).toString());
_L4:
        return;
_L3:
        a(a3d.PAYMENT_COMPLETED, i, l, ((String) (null)), ((String) (null)));
        if (j == 0) goto _L4; else goto _L2
_L2:
        a(a3d.WHATSAPP_INITIATED, i, l, ((String) (null)), ((String) (null)));
        if (j == 0) goto _L4; else goto _L1
    }

    public void a(int i, byte abyte0[], String s, byte abyte1[], byte abyte2[], Runnable runnable)
    {
label0:
        {
            if (s != null && abyte1 != null)
            {
                App.ah.a(i, abyte0, s, abyte1, abyte2);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            Log.w(z[44]);
        }
        if (runnable != null)
        {
            runnable.run();
        }
    }

    public void a(long l, long l2)
    {
label0:
        {
            if (l2 > l && l > 0L && l2 > 0L)
            {
                App.a0.sendEmptyMessageDelayed(0, l2 - l);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            App.a0.sendEmptyMessage(0);
        }
    }

    public void a(Bundle bundle)
    {
    }

    public void a(a9v a9v1)
    {
label0:
        {
            if (a9v1.b == -1)
            {
                App.d(a9v1.a);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            com.whatsapp.App.b(new com.whatsapp.bi(this, App.az.e(a9v1.a), a9v1));
        }
    }

    public void a(bi bi1)
    {
        if (bi1.a != null)
        {
            a(a3d.EXTENSION_REQUESTED, bi1.a.b, bi1.a.a, ((String) (null)), ((String) (null)));
        }
    }

    public void a(r r1)
    {
        App.as.a(r1.a);
        if (r1.b != null)
        {
            a(a3d.PAYMENT_COMPLETED, r1.b.b, r1.b.a, ((String) (null)), ((String) (null)));
        }
    }

    public void a(a a1)
    {
        com.whatsapp.un.a(a1);
    }

    public void a(a a1, int i, long l)
    {
        a.a7.remove(a1);
        boolean flag = App.ah.a(a1, i, l);
        a9n a9n1 = (a9n)g.a().a(com/whatsapp/a9n);
        asa asa1 = Conversation.B();
        if (asa1.a() && !a9n1.a() && asa1.b().A.equals(a1.a) && flag && Conversation.au)
        {
            com.whatsapp.App.a(Uri.parse(z[43]));
        }
    }

    public void a(a a1, int i, String s)
    {
label0:
        {
            int j;
            boolean flag;
label1:
            {
label2:
                {
                    j = App.am;
                    a.a7.remove(a1);
                    flag = mk.h(a1.a);
                    if (!flag || i != 401)
                    {
                        break label1;
                    }
                    App.ah.g(com.whatsapp.mk.g(a1.a));
                    s = App.ah.a(a1);
                    if (s != null)
                    {
                        s.M = 7;
                        App.ah.e(s);
                        if (j == 0)
                        {
                            break label2;
                        }
                    }
                    Log.w((new StringBuilder()).append(z[2]).append(a1).toString());
                }
                if (!mk.c(a1.a))
                {
                    mk.d(a1.a, App.az.f().a);
                    App.S.sendEmptyMessage(0);
                }
                if (j == 0)
                {
                    break label0;
                }
            }
label3:
            {
label4:
                {
                    if (!flag || i != 409)
                    {
                        break label0;
                    }
                    App.w(a1.a);
                    s = App.ah.a(a1);
                    if (s == null)
                    {
                        break label3;
                    }
                    Set set = App.ah.e(a1.a, ((c4) (s)).C);
                    if (set != null)
                    {
                        Log.i((new StringBuilder()).append(z[3]).append(a1).append(z[5]).append(((c4) (s)).C).toString());
                        s.M = 0;
                        s.q = (String[])bk.a(set, new String[set.size()]);
                        App.ah.i(s);
                        App.ah.d(s, -1);
                        App.aG();
                        if (j == 0)
                        {
                            break label4;
                        }
                    }
                    Log.w((new StringBuilder()).append(z[0]).append(a1).append(z[1]).append(((c4) (s)).C).toString());
                }
                if (j == 0)
                {
                    break label0;
                }
            }
            Log.w((new StringBuilder()).append(z[4]).append(a1).toString());
        }
    }

    public void a(a a1, String s)
    {
label0:
        {
label1:
            {
                int i;
label2:
                {
label3:
                    {
label4:
                        {
label5:
                            {
label6:
                                {
label7:
                                    {
                                        i = App.am;
                                        Log.i((new StringBuilder()).append(z[58]).append(a1.c).append(z[50]).append(s).toString());
                                        Object obj = a1;
                                        if (a1.a.endsWith(z[54]))
                                        {
                                            obj = a1;
                                            if (s != null)
                                            {
                                                obj = new a(s, a1.b, a1.c);
                                            }
                                        }
                                        a.a7.remove(obj);
                                        obj = App.ah.a(((a) (obj)));
                                        if (obj == null)
                                        {
                                            break label1;
                                        }
                                        if (((c4) (obj)).w != 1 && ((c4) (obj)).w != 3 && ((c4) (obj)).w != 2)
                                        {
                                            break label2;
                                        }
                                        s = null;
                                        a1 = s;
                                        if (((c4) (obj)).B != null)
                                        {
                                            a1 = s;
                                            if (((c4) (obj)).B instanceof MediaData)
                                            {
                                                a1 = new MediaData((MediaData)((c4) (obj)).B);
                                            }
                                        }
                                        if (a1 == null || ((MediaData) (a1)).file == null)
                                        {
                                            break label4;
                                        }
                                        if (!((MediaData) (a1)).file.exists())
                                        {
                                            break label5;
                                        }
                                        if (((MediaData) (a1)).fileSize != 0L && ((MediaData) (a1)).fileSize != ((MediaData) (a1)).file.length())
                                        {
                                            break label6;
                                        }
                                        int j = App.G();
                                        if (com.whatsapp.App.a(j, ((c4) (obj))) || ((c4) (obj)).w == 1 && j != 0 && j != 3)
                                        {
                                            a1.uploader = new pp(this, ((c4) (obj)), 0L, true);
                                            a1.autodownloadRetryEnabled = true;
                                            ((MediaData) (a1)).uploader.k();
                                            if (i == 0)
                                            {
                                                break label7;
                                            }
                                        }
                                        Log.i((new StringBuilder()).append(z[55]).append(j).append(z[53]).append(((c4) (obj)).w).append(z[51]).append(((c4) (obj)).n).append(z[56]).append(((c4) (obj)).t).toString());
                                    }
                                    if (i == 0)
                                    {
                                        break label3;
                                    }
                                }
                                Log.i((new StringBuilder()).append(z[59]).append(((MediaData) (a1)).fileSize).append(((MediaData) (a1)).file.length()).toString());
                                if (i == 0)
                                {
                                    break label3;
                                }
                            }
                            Log.i(z[52]);
                            if (i == 0)
                            {
                                break label3;
                            }
                        }
                        Log.e((new StringBuilder()).append(z[57]).append(a1).toString());
                    }
                    if (i == 0)
                    {
                        break label0;
                    }
                }
                Log.e(z[49]);
                if (i == 0)
                {
                    break label0;
                }
            }
            Log.i(z[60]);
        }
    }

    public void a(a a1, String s, int i, long l)
    {
label0:
        {
            int j;
label1:
            {
                byte byte0 = 5;
                if (i != 5 && i != 13)
                {
                    j = i;
                    if (i != 8)
                    {
                        break label1;
                    }
                }
                if (i == 13 && !com.whatsapp.App.e(a1.a))
                {
                    i = byte0;
                }
                App.ah.a(a1, s, i, l);
                a.a(a1);
                if (App.am == 0)
                {
                    break label0;
                }
                j = i;
            }
            App.ah.b(a1, j);
        }
    }

    public void a(a a1, byte abyte0[], int i, long l)
    {
        int j = aa.a(abyte0);
        Log.i((new StringBuilder()).append(z[39]).append(i).append(z[38]).append(a1).append(z[41]).append(j).append(z[40]).append(l).toString());
        a.c(new ys(this, i, a1, l, j));
    }

    public void a(b3 b3_1)
    {
        com.whatsapp.App.a(a, false, true, false, a8g.CRASH, null);
        com.whatsapp.App.a(b3_1);
    }

    public void a(b3 b3_1, a a1)
    {
        Log.i(z[37]);
        a.c(new h5(this, a1, b3_1));
    }

    public void a(b3 b3_1, a a1, byte abyte0[], int i, long l)
    {
        int j = aa.a(abyte0);
        Log.i((new StringBuilder()).append(z[17]).append(i).append(z[15]).append(a1).append(z[16]).append(j).append(z[18]).append(l).toString());
        if (i > 4)
        {
            Log.w((new StringBuilder()).append(z[13]).append(a1).toString());
            com.whatsapp.App.a(b3_1);
            return;
        }
        if (i == 4 && App.u == 1)
        {
            com.whatsapp.App.a(z[14], false, a8g.CRASH, null);
        }
        a.c(new ck(this, b3_1, a1, i, j));
    }

    public void a(b3 b3_1, Vector vector)
    {
        int i = App.am;
        Log.i((new StringBuilder()).append(z[11]).append(b3_1).toString());
        og og1 = App.az.f(b3_1.a);
        if (og1 != null)
        {
            vector = vector.iterator();
            do
            {
                if (!vector.hasNext())
                {
                    break;
                }
                b0 b0_1 = (b0)vector.next();
                if (z[12].equals(b0_1.a))
                {
                    og1.G = jy.fromText(b0_1.b);
                }
            } while (i == 0);
            App.az.i(og1);
            App.A(b3_1.a);
        }
        com.whatsapp.App.b(b3_1);
    }

    public void a(c4 c4_1)
    {
        og og1;
label0:
        {
            int i = App.am;
            String s = c4_1.y.a;
            og1 = u5.d(s);
            Log.i((new StringBuilder()).append(z[24]).append(c4_1.y.c).append(' ').append(c4_1.I).append(' ').append(System.currentTimeMillis()).append(' ').append(c4_1.D).toString());
            if (z[26].equals(s))
            {
                c4_1.I = System.currentTimeMillis();
            }
            com.whatsapp.App.g(c4_1);
            a9n a9n1 = (a9n)g.a().a(com/whatsapp/a9n);
            if ((c4_1.w == 1 || c4_1.w == 2 || c4_1.w == 3) && c4_1.r)
            {
                App.ah.d(c4_1);
                if (i == 0)
                {
                    break label0;
                }
            }
            if (c4_1.w != 0 || c4_1.b() == null || TextUtils.isEmpty(c4_1.y.a))
            {
                asa asa1 = Conversation.B();
                if (asa1.a() && !a9n1.a() && asa1.b().A.equals(s) && og1.c == 0)
                {
                    c4_1.M = 13;
                }
                App.ah.g(c4_1);
                if (i == 0)
                {
                    break label0;
                }
            }
            a.c(new a3(this, c4_1, a9n1, s, og1));
        }
        jo jo1 = com.whatsapp.jo.a();
        boolean flag;
        if (c4_1.j != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jo1.a(flag);
        if (!og1.t)
        {
            og1.t = true;
            com.whatsapp.asw.a(new ala(this), new og[] {
                og1
            });
        }
        if (og1.k() && !mk.c(og1.a))
        {
            com.whatsapp.mk.a(og1.a, App.az.f().a);
            com.whatsapp.App.a(og1.a, 0, 2);
        }
        if (c4_1.w == 5 && !c4_1.f())
        {
            ((MediaData)c4_1.B).transferring = true;
            com.whatsapp.asw.a(new rk(this, c4_1), new Void[0]);
        }
        if (c4_1.j != null && c4_1.j.intValue() == 4)
        {
            Log.i((new StringBuilder()).append(z[25]).append(App.ah.C()).toString());
            App.ah.k(z[23]);
            Log.i((new StringBuilder()).append(z[27]).append(c4_1.y.c).toString());
            if (App.u == 1)
            {
                com.whatsapp.App.a(z[28], false, a8g.CRASH, null);
            }
        }
        com.whatsapp.ft.a(c4_1);
        com.whatsapp.l1.b(c4_1);
    }

    public void a(Exception exception)
    {
        Log.w((new StringBuilder()).append(z[21]).append(exception).toString());
    }

    public void a(Integer integer, String as[])
    {
        App.as.a(integer, as);
    }

    public void a(Integer integer, String as[], String as1[])
    {
        com.whatsapp.contact.b.a(integer, as, as1);
    }

    public void a(String s)
    {
        com.whatsapp.contact.b.b(s);
    }

    public void a(String s, int i)
    {
        com.whatsapp.App.b(s, i);
    }

    public void a(String s, int i, int j, long l)
    {
        com.whatsapp.contact.b.a(a, s, i, j, l);
    }

    public void a(String s, int i, f af[])
    {
        com.whatsapp.contact.b.a(s, i, af);
    }

    public void a(String s, long l, String s1)
    {
        com.whatsapp.contact.b.a(s, l, s1);
    }

    public void a(String s, String s1)
    {
        com.whatsapp.App.b(new xb(this, s1, s));
    }

    public void a(String s, String s1, int i)
    {
        App.o.a(s, s1, i);
        App.s(s);
    }

    public void a(String s, String s1, int i, long l)
    {
        a(a3d.GIFT_RECEIVED, i, l, s, s1);
    }

    public void a(String s, String s1, long l)
    {
        Log.i((new StringBuilder()).append(z[35]).append(s).append(' ').append(s1).append(z[36]).append(l).toString());
        u5.d(s);
        s1 = App.o.a(s, l);
        App.o.a(s, true);
        if (s1 != null)
        {
            App.s(s1);
        }
        App.s(s);
    }

    public void a(String s, String s1, long l, String s2)
    {
        com.whatsapp.App.b(new ns(this, s1, l, s2, s));
    }

    public void a(String s, String s1, String s2)
    {
        com.whatsapp.App.a(s, s1, s2, false);
    }

    public void a(String s, String s1, String s2, int i, int j)
    {
        Object obj;
        int l;
label0:
        {
            l = App.am;
            obj = App.az.e(s1);
            if (s2 == null || !s2.startsWith(App.k()))
            {
                c(s1, i);
            }
            if (!((og) (obj)).k())
            {
                break MISSING_BLOCK_LABEL_225;
            }
            if (s != null)
            {
                obj = new c4(new a(s1, true, s));
                if (l == 0)
                {
                    break label0;
                }
            }
            obj = new c4(s1, (byte[])null, null);
        }
label1:
        {
            Object obj1;
            if (i == -1)
            {
                obj1 = null;
            } else
            {
                obj1 = Integer.toString(i);
            }
            ((c4) (obj)).a(((String) (obj1)));
            obj.M = 6;
            obj.t = 6L;
            obj.G = s2;
            obj.I = (long)j * 1000L;
            obj1 = App.ah.t(s1);
            if (obj1 == null || ((c4) (obj1)).M != 6 || ((c4) (obj1)).t != 6L || !s2.equals(((c4) (obj1)).G) || ((c4) (obj)).f() != ((c4) (obj1)).f())
            {
                App.ah.g(((c4) (obj)));
                if (l == 0)
                {
                    break label1;
                }
            }
            App.d(s, s1, z[6]);
        }
        if (l == 0)
        {
            break MISSING_BLOCK_LABEL_236;
        }
        App.d(s, s1, z[7]);
    }

    public void a(String s, byte abyte0[], byte abyte1[], byte abyte2[], byte abyte3[])
    {
        com.whatsapp.o4.a(s, abyte0, abyte1, abyte2, abyte3, null);
    }

    public void a(Hashtable hashtable)
    {
        com.whatsapp.SettingsPrivacy.a(hashtable);
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            App.ah.J();
        }
    }

    public void a(String as[], String s)
    {
label0:
        {
            if (App.s)
            {
                Pair pair = Pair.create(as, s);
                App.aX.add(pair);
                com.whatsapp.m7.a(App.aX);
                App.aX.clear();
                if (App.am == 0)
                {
                    break label0;
                }
            }
            as = Pair.create(as, s);
            App.aX.add(as);
        }
    }

    public void b()
    {
        if (!App.L.isEmpty())
        {
            com.whatsapp.App.a(App.L.values());
        }
    }

    public void b(int i)
    {
        Log.w((new StringBuilder()).append(z[22]).append(i).toString());
    }

    public void b(int i, long l)
    {
label0:
        {
            long l2 = ChangeNumber.d(a);
            if (l2 > 0L)
            {
                com.whatsapp.m7.a(a3d.WHATSAPP_INITIATED, l2, true);
                com.whatsapp.m7.a(a3d.WHATSAPP_INITIATED, 1000L * l, false);
                ChangeNumber.c(a);
                com.whatsapp.m7.a(i);
                com.whatsapp.m7.b(i);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            Log.i(z[42]);
        }
    }

    public void b(Bundle bundle)
    {
label0:
        {
            boolean flag1 = true;
            String s = bundle.getString(z[61]);
            bundle = bundle.getByteArray(z[64]);
            boolean flag;
            if (App.Z != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Log.b(flag);
            if (App.Z.jabber_id != null)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            Log.b(flag);
            Log.i((new StringBuilder()).append(z[62]).append(App.Z.jabber_id).toString());
            if (o4.c(bundle, App.Z.jabber_id))
            {
                com.whatsapp.App.a(App.Z.jabber_id, bundle);
                App.l(s);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            Log.e(z[63]);
        }
    }

    public void b(b3 b3_1)
    {
        com.whatsapp.App.a(b3_1);
    }

    public void b(String s)
    {
        App.L.put(s, s);
    }

    public void b(String s, int i)
    {
        c(s, i);
    }

    public void b(String s, String s1)
    {
        App.o.a(s, s1);
        App.s(s);
    }

    public void b(String s, String s1, long l)
    {
        com.whatsapp.contact.b.a(a, s, s1, l);
    }

    public void b(String s, String s1, String s2)
    {
        com.whatsapp.App.a(s, s1, s2, true);
    }

    public void b(Hashtable hashtable)
    {
label0:
        {
            if (App.n)
            {
                if (!hashtable.containsKey(z[32]))
                {
                    break label0;
                }
                Log.i(z[31]);
                synchronized (App.R)
                {
                    mk.d = true;
                    if (!com.whatsapp.mk.f)
                    {
                        x.a(new fl(this));
                    }
                }
                if (App.am == 0)
                {
                    break label0;
                }
            }
            Log.i(z[30]);
        }
        return;
        exception;
        hashtable;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void c()
    {
        App.a0();
    }

    public void c(int i)
    {
        App.ah.g();
        if (com.whatsapp.App.b(App.G()) != 0)
        {
            jo jo1 = com.whatsapp.jo.a();
            jo1.a(false);
            com.whatsapp.asw.a(new er(this, jo1), new Void[0]);
        }
        if (App.a3)
        {
            a3d a3d1;
            if (com.whatsapp.App.e.size() > 0)
            {
                a3d1 = a3d.GIFT_RECEIVED;
            } else
            {
                a3d1 = App.ax;
            }
            com.whatsapp.App.a(a3d1, App.B, App.C);
        }
        if (App.aX.size() > 0)
        {
            Log.i((new StringBuilder()).append(z[20]).append(App.aX.size()).toString());
            com.whatsapp.m7.a(App.aX);
            App.aX.clear();
        }
        App.s = true;
    }

    public void c(String s)
    {
        com.whatsapp.contact.b.a(s);
    }

    public void c(String s, String s1)
    {
        Log.i((new StringBuilder()).append(z[48]).append(s).append(' ').append(s1).toString());
        s1 = u5.d(s);
        boolean flag = App.o.d(s);
        App.o.c(s);
        App.o.a(s, true);
        if (!flag)
        {
            App.h.removeMessages(2, App.u(((og) (s1)).a));
        }
        App.s(s);
    }

    public void c(String s, String s1, String s2)
    {
        og og1 = App.az.f(s2);
        if (og1 != null)
        {
            com.whatsapp.App.b(new aty(this, og1));
            if (!App.o.d(s2))
            {
                App.o.a(s2, 0L);
                App.s(s2);
            }
            s2 = Conversation.B();
            if (s2.a() && App.an != 3 && og1.a.equals(s2.b().A))
            {
                com.whatsapp.App.a(og1);
            }
            com.whatsapp.App.a(og1.a, og1.b, new Messenger(App.a6));
            App.c(new String[] {
                og1.a
            });
        }
        App.d(s1, s, z[29]);
    }

    public void c(Hashtable hashtable)
    {
        x.a(new mb(this, hashtable));
    }

    public void d(String s, String s1)
    {
        Object obj1;
        Object obj2;
        int j;
        int l;
        obj1 = null;
        obj2 = null;
        j = 0;
        l = App.am;
        App.d(s, s1, z[45]);
        if (com.whatsapp.a9g.a(s1)) goto _L2; else goto _L1
_L1:
        s = App.az.f();
        if (s == null) goto _L2; else goto _L3
_L3:
        Object obj;
        File file;
        byte abyte0[];
        int i;
        int i1;
        boolean flag;
        try
        {
            flag = s1.equals(((og) (s)).a);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        if (!flag) goto _L2; else goto _L4
_L4:
        file = s.c();
        s = s.h();
        if (!file.exists()) goto _L2; else goto _L5
_L5:
        flag = s.exists();
        if (!flag) goto _L2; else goto _L6
_L6:
        obj = new FileInputStream(s);
        abyte0 = new byte[(int)s.length()];
        i = 0;
_L18:
        if (i >= abyte0.length) goto _L8; else goto _L7
_L7:
        i1 = ((FileInputStream) (obj)).read(abyte0, i, abyte0.length - i);
        if (i1 == -1 && l == 0) goto _L8; else goto _L9
_L8:
        s = new FileInputStream(file);
        obj1 = new byte[(int)file.length()];
        i = j;
_L19:
        if (i >= obj1.length) goto _L11; else goto _L10
_L10:
        j = s.read(((byte []) (obj1)), i, obj1.length - i);
        if (j == -1 && l == 0) goto _L11; else goto _L12
_L11:
        obj1 = new a9g(s1, ((byte []) (obj1)), abyte0);
        obj1.m = true;
        com.whatsapp.App.a(((a9g) (obj1)));
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
        }
        if (s == null) goto _L2; else goto _L13
_L13:
        s.close();
_L2:
        return;
        s;
        throw s;
        obj1;
        s = null;
        obj = obj2;
_L17:
        Log.a((new StringBuilder()).append(z[47]).append(s1).append(z[46]).toString(), ((Throwable) (obj1)));
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        if (obj == null) goto _L2; else goto _L14
_L14:
        try
        {
            ((FileInputStream) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
        s;
        obj = null;
        s1 = ((String) (obj1));
_L16:
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        if (s1 != null)
        {
            try
            {
                s1.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
        }
        throw s;
        s;
        return;
        s;
        s1 = ((String) (obj1));
        continue; /* Loop/switch isn't completed */
        obj1;
        s1 = s;
        s = ((String) (obj1));
        continue; /* Loop/switch isn't completed */
        s1;
        obj1 = s;
        s = s1;
        s1 = ((String) (obj));
        obj = obj1;
        if (true) goto _L16; else goto _L15
_L15:
        obj1;
        s = ((String) (obj));
        obj = obj2;
          goto _L17
        obj1;
        FileInputStream fileinputstream = ((FileInputStream) (obj));
        obj = s;
        s = fileinputstream;
          goto _L17
_L9:
        i += i1;
        if (l == 0) goto _L18; else goto _L8
_L12:
        i += j;
        if (l == 0) goto _L19; else goto _L11
    }

    public void e(String s, String s1)
    {
        Log.i((new StringBuilder()).append(z[19]).append(s).append(' ').append(s1).toString());
        s1 = u5.d(s);
        App.o.a(((og) (s1)).a, false);
        App.s(s);
    }

    public void f(String s, String s1)
    {
label0:
        {
            int i = App.am;
            if (z[9].equals(s))
            {
                C2DMRegistrar.a(a, s1);
                if (i == 0)
                {
                    break label0;
                }
            }
            if (z[10].equals(s))
            {
                if (!App.a2())
                {
                    break label0;
                }
                (new ADMMessageHandler(a)).b(s1);
                if (i == 0)
                {
                    break label0;
                }
            }
            if (s == null)
            {
                C2DMRegistrar.a(a, s1);
                if (App.a2())
                {
                    (new ADMMessageHandler(a)).b(s1);
                }
            }
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[65];
        obj = "*TG\031Q&TG\031[.GA\031D.WDWN.AEDF9\013G^H8LZ_Z&ECUAkQYWK'A\027BFkGX[Y>PR\026N9KBF\t;EEB@(MGWG?W\027PF9\004";
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
                i = 1;
                obj = "kEC\026Y#ED^\t";
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "*TG\031Q&TG\031[.GA\031D.WDWN.AEDF9\013UY\\%GR\026\\%EUZLkPX\026O\"JS\026D.WDWN.\004";
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "*TG\031Q&TG\031[.GA\031D.WDWN.AEDF9\013G^H8LZ_Z&ECUAkBXCG/\004ZW](L\027PF9\004PDF>T\027FH9P^U@;EYBZkBXD\t";
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "*TG\031Q&TG\031[.GA\031D.WDWN.AEDF9\013G^H8LZ_Z&ECUAkQYWK'A\027BFkB^XMkIREZ*CR\026";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "kEC\026Y#ED^\t";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = ";MTB\\9A";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = ";MTB\\9A";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "*TG\031Q&TG\031[.GA\031J'MRX]\bKYP@,aEDF9\013";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = ",GZ";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "*@Z";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "(EGWK\"H^BPkJXB@-MTW]\"KY\f\t";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "=K^F";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "*\\XZF?H\027EB\"TG_G,\004ES]9]\027PF9\004";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "*\\XZF?H\027U[\"P^UH'MCO\t.RRX]q\004DSG/";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "kBXD\t";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "kS^BAk";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "*\\XZF?H\027QF?\004ES]9]\027DL:QRE]k";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "kKE_N\"JVZE2\004DSG?\004VB\t";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i] = ((String) (obj));
                i = 19;
                obj = "*TG\031Q&TG\031[.GA\031A*JSZL\024QYE\\)WTD@)A";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i] = ((String) (obj));
                i = 20;
                obj = "*TG\031Q&TG\031[.GA\031F-B[_G.{TYD;HRBLd@RPL9VRR\004;E^R\004-KE\033O9MRXM8\004";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i] = ((String) (obj));
                i = 21;
                obj = "(EGWK\"H^BPkVRWMkAEDF9\036\027";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i] = ((String) (obj));
                i = 22;
                obj = "(EGWK\"H^BPkAEDF9\004ESZ;KYELq\004";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i] = ((String) (obj));
                i = 23;
                obj = "*TG\031Q&TG\031[.GA\031D.WDWN.\013ZEN8PXDLdMY\033Y\"TR";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i] = ((String) (obj));
                i = 24;
                obj = "*TG\031Q&TG\031[.GA\031D.WDWN.\004";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i] = ((String) (obj));
                i = 25;
                obj = "*TG\031Q&TG\031[.GA\031D.WDWN.\013ZEN8PXDLdWCWJ \004";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[i] = ((String) (obj));
                i = 26;
                obj = "z\021\002\003\031{\024\006\004\030ydD\030^#ECEH;T\031XL?";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[i] = ((String) (obj));
                i = 27;
                obj = "*TG\031Q&TG\031[.GA\031D.WDWN.\013ES]9]\030\002\t";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[i] = ((String) (obj));
                i = 28;
                obj = "&ADEH,A\027DL?VN\013\035";
                byte0 = 27;
                break;

            case 27: // '\033'
                as1[i] = ((String) (obj));
                i = 29;
                obj = "(KYBH(PD";
                byte0 = 28;
                break;

            case 28: // '\034'
                as1[i] = ((String) (obj));
                i = 30;
                obj = "*TG\031F%@^D]2\013GDL=AYB\004/F\032WJ(ADE\0068O^F";
                byte0 = 29;
                break;

            case 29: // '\035'
                as1[i] = ((String) (obj));
                i = 31;
                obj = "#EYRE.kYr@9PN\032\t(E[Z\t$JdSG/cRBn9KBFZ";
                byte0 = 30;
                break;

            case 30: // '\036'
                as1[i] = ((String) (obj));
                i = 32;
                obj = ",VXCY8";
                byte0 = 31;
                break;

            case 31: // '\037'
                as1[i] = ((String) (obj));
                i = 33;
                obj = "*TG\031F%\tVUJ$QYB\004(LVXN.\004COY.\031";
                byte0 = 32;
                break;

            case 32: // ' '
                as1[i] = ((String) (obj));
                i = 34;
                obj = "kAOF@9EC_F%{SW].\031";
                byte0 = 33;
                break;

            case 33: // '!'
                as1[i] = ((String) (obj));
                i = 35;
                obj = "*TG\031Q&TG\031[.GA\031A*JSZL\024QYW_*M[WK'A\027";
                byte0 = 34;
                break;

            case 34: // '"'
                as1[i] = ((String) (obj));
                obj = "kHVE]q";
                byte0 = 35;
                i = 36;
                break;

            case 35: // '#'
                as1[i] = ((String) (obj));
                i = 37;
                obj = "*\\XZF?H\027QF?\004V\026Z.VAS[kT[W@%PRN]kVRUL\"TC";
                byte0 = 36;
                break;

            case 36: // '$'
                as1[i] = ((String) (obj));
                i = 38;
                obj = "kBXD\t";
                byte0 = 37;
                break;

            case 37: // '%'
                as1[i] = ((String) (obj));
                i = 39;
                obj = "*\\XZF?H\027QF?\004V\026Z.VAS[kVR\\L(P\027PF9\004ES]9]\027DL:QRE]k";
                byte0 = 38;
                break;

            case 38: // '&'
                as1[i] = ((String) (obj));
                i = 40;
                obj = "kKE_N\"JVZE2\004DSG?\004VB\t";
                byte0 = 39;
                break;

            case 39: // '\''
                as1[i] = ((String) (obj));
                obj = "kS^BAk";
                byte0 = 40;
                i = 41;
                break;

            case 40: // '('
                as1[i] = ((String) (obj));
                i = 42;
                obj = "*TG\031F%G_WG,AYCD)AEWJ(KBX]\"JQY\0068O^F";
                byte0 = 41;
                break;

            case 41: // ')'
                as1[i] = ((String) (obj));
                i = 43;
                obj = "*JSDF\"@\031DL8KBDJ.\036\030\031J$I\031AA*PDWY;\013\005\007\032z\024\016\017\037~\026";
                byte0 = 42;
                break;

            case 42: // '*'
                as1[i] = ((String) (obj));
                i = 44;
                obj = "*TG\031Q&TG\031[.GA\031N.P\032UBdB^ZLkMD\026G>H[";
                byte0 = 43;
                break;

            case 43: // '+'
                as1[i] = ((String) (obj));
                i = 45;
                obj = ";MTB\\9A";
                byte0 = 44;
                break;

            case 44: // ','
                as1[i] = ((String) (obj));
                i = 46;
                obj = "dBV_E.@";
                byte0 = 45;
                break;

            case 45: // '-'
                as1[i] = ((String) (obj));
                i = 47;
                obj = "*TG\031Q&TG\031[.GA\031A*JSZL\024TEYO\"HRiY#KCYv'KDB\006!MS\026";
                byte0 = 46;
                break;

            case 46: // '.'
                as1[i] = ((String) (obj));
                i = 48;
                obj = "*TG\031Q&TG\031[.GA\031A*JSZL\024EAW@'EUZLk";
                byte0 = 47;
                break;

            case 47: // '/'
                as1[i] = ((String) (obj));
                i = 49;
                obj = "*TG\031Q&TG\031[.GA\031D.WDWN.\013DS[=AES[9KEPF9PVDN.P\030A[$JPBP;A";
                byte0 = 48;
                break;

            case 48: // '0'
                as1[i] = ((String) (obj));
                i = 50;
                obj = "kT[WP.@h\\@/\036";
                byte0 = 49;
                break;

            case 49: // '1'
                as1[i] = ((String) (obj));
                i = 51;
                obj = "kKE_N\"J\r";
                byte0 = 50;
                break;

            case 50: // '2'
                as1[i] = ((String) (obj));
                i = 52;
                obj = "*TG\031Q&TG\031[.GA\031D.WDWN.\013DS[=AES[9KEPF9PVDN.P\030P@'AZ_Z8MYQ";
                byte0 = 51;
                break;

            case 51: // '3'
                as1[i] = ((String) (obj));
                i = 53;
                obj = "kIRR@*\036";
                byte0 = 52;
                break;

            case 52: // '4'
                as1[i] = ((String) (obj));
                obj = ")VXWM(EDB";
                byte0 = 53;
                i = 54;
                break;

            case 53: // '5'
                as1[i] = ((String) (obj));
                obj = "*TG\031Q&TG\031[.GA\031D.WDWN.\013DS[=AES[9KEPF9PVDN.P\030EB\"TES\\;HXWMkJRB^$V\\\f";
                i = 55;
                byte0 = 54;
                break;

            case 54: // '6'
                as1[i] = ((String) (obj));
                i = 56;
                obj = "kIRR@*{D_S.\036\027";
                byte0 = 55;
                break;

            case 55: // '7'
                as1[i] = ((String) (obj));
                i = 57;
                obj = "*TG\031Q&TG\031[.GA\031D.WDWN.\013DS[=AES[9KEPF9PVDN.P\030TH/IRR@*@VBHk";
                byte0 = 56;
                break;

            case 56: // '8'
                as1[i] = ((String) (obj));
                i = 58;
                obj = "*TG\031Q&TG\031[.GA\031D.WDWN.\013DS[=AES[9KEPF9PVDN.P\027";
                byte0 = 57;
                break;

            case 57: // '9'
                as1[i] = ((String) (obj));
                i = 59;
                obj = "*TG\031Q&TG\031[.GA\031D.WDWN.\013DS[=AES[9KEPF9PVDN.P\030P@'AESY'ETSMk";
                byte0 = 58;
                break;

            case 58: // ':'
                as1[i] = ((String) (obj));
                i = 60;
                obj = "*TG\031Q&TG\031[.GA\031D.WDWN.\013DS[=AES[9KEPF9PVDN.P\030[L8WVQL&MDE@%C";
                byte0 = 59;
                break;

            case 59: // ';'
                as1[i] = ((String) (obj));
                i = 61;
                obj = "&WPi@/";
                byte0 = 60;
                break;

            case 60: // '<'
                as1[i] = ((String) (obj));
                i = 62;
                obj = "*TG\031Q&TG\031[.GA\031F%T@EL?\004]WK)AE\f";
                byte0 = 61;
                break;

            case 61: // '='
                as1[i] = ((String) (obj));
                i = 63;
                obj = "*TG\031Q&TG\031[.GA\031F%T@EL?\004RD[$V";
                byte0 = 62;
                break;

            case 62: // '>'
                as1[i] = ((String) (obj));
                i = 64;
                obj = ";EDE^$VS";
                byte0 = 63;
                break;

            case 63: // '?'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 1512
    //                   0 1535
    //                   1 1542
    //                   2 1549
    //                   3 1556;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_1556;
_L3:
        byte byte1 = 41;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 75;
          goto _L9
_L5:
        byte1 = 36;
          goto _L9
_L6:
        byte1 = 55;
          goto _L9
        byte1 = 54;
          goto _L9
    }
}
