// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import com.whatsapp.a8a;
import com.whatsapp.a8e;
import com.whatsapp.a9g;
import com.whatsapp.a9q;
import com.whatsapp.a9v;
import com.whatsapp.hi;
import com.whatsapp.ho;
import com.whatsapp.protocol.c4;
import com.whatsapp.protocol.cr;
import com.whatsapp.q9;
import com.whatsapp.qx;
import com.whatsapp.uj;
import com.whatsapp.un;
import com.whatsapp.wc;

// Referenced classes of package com.whatsapp.messaging:
//            bq, f, an, ap, 
//            at, b9, b, l, 
//            u, v, w

class d
    implements bq
{

    final f a;

    d(f f1)
    {
        a = f1;
        super();
    }

    public void A(Bundle bundle)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(54, bundle).sendToTarget();
    }

    public void B(Bundle bundle)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(63, bundle).sendToTarget();
    }

    public void a()
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(86).sendToTarget();
    }

    public void a(Bundle bundle)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(84, bundle).sendToTarget();
    }

    public void a(Pair pair)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(34, pair).sendToTarget();
    }

    public void a(a8a a8a)
    {
        com.whatsapp.messaging.f.d(a).obtainMessage(78, a8a).sendToTarget();
    }

    public void a(a8e a8e)
    {
        com.whatsapp.messaging.f.d(a).obtainMessage(79, a8e).sendToTarget();
    }

    public void a(a9g a9g)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(23, a9g).sendToTarget();
    }

    public void a(a9q a9q)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(2, a9q).sendToTarget();
    }

    public void a(a9v a9v)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(24, a9v).sendToTarget();
    }

    public void a(hi hi)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(53, hi).sendToTarget();
    }

    public void a(ho ho)
    {
        com.whatsapp.messaging.f.d(a).obtainMessage(80, ho).sendToTarget();
    }

    public void a(an an)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(9, an).sendToTarget();
    }

    public void a(ap ap)
    {
        com.whatsapp.messaging.f.d(a).obtainMessage(27, ap).sendToTarget();
    }

    public void a(at at)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(35, at).sendToTarget();
    }

    public void a(b9 b9)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(73, b9).sendToTarget();
    }

    public void a(b b1)
    {
        com.whatsapp.messaging.f.d(a).obtainMessage(67, b1).sendToTarget();
    }

    public void a(l l1)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(26, l1).sendToTarget();
    }

    public void a(u u1)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(58, u1).sendToTarget();
    }

    public void a(v v1)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(49, v1).sendToTarget();
    }

    public void a(w w1)
    {
        com.whatsapp.messaging.f.d(a).obtainMessage(55, w1).sendToTarget();
    }

    public void a(c4 c4)
    {
        com.whatsapp.messaging.f.d(a).obtainMessage(7, c4).sendToTarget();
    }

    public void a(cr cr)
    {
        com.whatsapp.messaging.f.d(a).obtainMessage(82, cr).sendToTarget();
    }

    public void a(q9 q9)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(30, q9).sendToTarget();
    }

    public void a(qx qx)
    {
        com.whatsapp.messaging.f.d(a).obtainMessage(81, qx).sendToTarget();
    }

    public void a(uj uj)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(29, uj).sendToTarget();
    }

    public void a(un un)
    {
        com.whatsapp.messaging.f.d(a).obtainMessage(87, un).sendToTarget();
    }

    public void a(wc wc)
    {
        com.whatsapp.messaging.f.d(a).obtainMessage(15, wc).sendToTarget();
    }

    public void a(Runnable runnable)
    {
        com.whatsapp.messaging.f.d(a).obtainMessage(20, runnable).sendToTarget();
    }

    public void a(String s1)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(3, s1).sendToTarget();
    }

    public void a(String s1, int i1)
    {
        com.whatsapp.messaging.f.d(a).obtainMessage(4, 0, i1, s1).sendToTarget();
    }

    public void a(boolean flag)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(43, Boolean.valueOf(flag)).sendToTarget();
    }

    public void a(String as[])
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(92, as).sendToTarget();
    }

    public void b()
    {
        com.whatsapp.messaging.f.a(a).sendEmptyMessage(25);
    }

    public void b(Bundle bundle)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(59, bundle).sendToTarget();
    }

    public void b(v v1)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(44, v1).sendToTarget();
    }

    public void b(c4 c4)
    {
        com.whatsapp.messaging.f.d(a).obtainMessage(75, c4).sendToTarget();
    }

    public void b(wc wc)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(89, wc).sendToTarget();
    }

    public void b(String s1)
    {
        com.whatsapp.messaging.f.d(a).obtainMessage(16, s1).sendToTarget();
    }

    public void b(String s1, int i1)
    {
        com.whatsapp.messaging.f.d(a).obtainMessage(18, i1, 0, s1).sendToTarget();
    }

    public void b(boolean flag)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(36, Boolean.valueOf(flag)).sendToTarget();
    }

    public void c()
    {
        com.whatsapp.messaging.f.d(a).sendEmptyMessage(11);
    }

    public void c(Bundle bundle)
    {
        com.whatsapp.messaging.f.d(a).obtainMessage(74, bundle).sendToTarget();
    }

    public void c(v v1)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(47, v1).sendToTarget();
    }

    public void c(c4 c4)
    {
        com.whatsapp.messaging.f.d(a).obtainMessage(6, c4).sendToTarget();
    }

    public void c(wc wc)
    {
        com.whatsapp.messaging.f.d(a).obtainMessage(14, wc).sendToTarget();
    }

    public void c(String s1)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(10, s1).sendToTarget();
    }

    public void d()
    {
        com.whatsapp.messaging.f.d(a).obtainMessage(19).sendToTarget();
    }

    public void d(Bundle bundle)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(38, bundle).sendToTarget();
    }

    public void d(v v1)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(46, v1).sendToTarget();
    }

    public void d(c4 c4)
    {
        com.whatsapp.messaging.f.d(a).obtainMessage(37, c4).sendToTarget();
    }

    public void d(wc wc)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(57, wc).sendToTarget();
    }

    public void d(String s1)
    {
        com.whatsapp.messaging.f.d(a).obtainMessage(5, s1).sendToTarget();
    }

    public void e()
    {
        com.whatsapp.messaging.f.a(a).sendEmptyMessage(32);
    }

    public void e(Bundle bundle)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(77, bundle).sendToTarget();
    }

    public void e(v v1)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(52, v1).sendToTarget();
    }

    public void e(c4 c4)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(8, c4).sendToTarget();
    }

    public void e(wc wc)
    {
        com.whatsapp.messaging.f.d(a).obtainMessage(12, wc).sendToTarget();
    }

    public void e(String s1)
    {
        com.whatsapp.messaging.f.d(a).obtainMessage(0, s1).sendToTarget();
    }

    public void f()
    {
        com.whatsapp.messaging.f.d(a).sendEmptyMessage(21);
    }

    public void f(Bundle bundle)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(70, bundle).sendToTarget();
    }

    public void f(v v1)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(50, v1).sendToTarget();
    }

    public void f(wc wc)
    {
        com.whatsapp.messaging.f.d(a).obtainMessage(90, wc).sendToTarget();
    }

    public void f(String s1)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(33, s1).sendToTarget();
    }

    public void g()
    {
        com.whatsapp.messaging.f.d(a).obtainMessage(68).sendToTarget();
    }

    public void g(Bundle bundle)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(60, bundle).sendToTarget();
    }

    public void g(v v1)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(45, v1).sendToTarget();
    }

    public void g(wc wc)
    {
        com.whatsapp.messaging.f.d(a).obtainMessage(88, wc).sendToTarget();
    }

    public void h()
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(56).sendToTarget();
    }

    public void h(Bundle bundle)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(61, bundle).sendToTarget();
    }

    public void h(v v1)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(51, v1).sendToTarget();
    }

    public void h(wc wc)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(28, wc).sendToTarget();
    }

    public void i()
    {
        com.whatsapp.messaging.f.d(a).sendEmptyMessage(22);
    }

    public void i(Bundle bundle)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(41, bundle).sendToTarget();
    }

    public void i(wc wc)
    {
        com.whatsapp.messaging.f.d(a).obtainMessage(13, wc).sendToTarget();
    }

    public void j()
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(85).sendToTarget();
    }

    public void j(Bundle bundle)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(42, bundle).sendToTarget();
    }

    public void k()
    {
        com.whatsapp.messaging.f.d(a).obtainMessage(17).sendToTarget();
    }

    public void k(Bundle bundle)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(62, bundle).sendToTarget();
    }

    public void l(Bundle bundle)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(91, bundle).sendToTarget();
    }

    public void m(Bundle bundle)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(65, bundle).sendToTarget();
    }

    public void n(Bundle bundle)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(40, bundle).sendToTarget();
    }

    public void o(Bundle bundle)
    {
        com.whatsapp.messaging.f.d(a).obtainMessage(31, bundle).sendToTarget();
    }

    public void p(Bundle bundle)
    {
        com.whatsapp.messaging.f.d(a).obtainMessage(72, bundle).sendToTarget();
    }

    public void q(Bundle bundle)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(83, bundle).sendToTarget();
    }

    public void r(Bundle bundle)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(48, bundle).sendToTarget();
    }

    public void s(Bundle bundle)
    {
        com.whatsapp.messaging.f.d(a).obtainMessage(66, bundle).sendToTarget();
    }

    public void t(Bundle bundle)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(39, bundle).sendToTarget();
    }

    public void u(Bundle bundle)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(69, bundle).sendToTarget();
    }

    public void v(Bundle bundle)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(76, bundle).sendToTarget();
    }

    public void w(Bundle bundle)
    {
        com.whatsapp.messaging.f.d(a).obtainMessage(1, bundle).sendToTarget();
    }

    public void x(Bundle bundle)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(64, bundle).sendToTarget();
    }

    public void y(Bundle bundle)
    {
        com.whatsapp.messaging.f.d(a).obtainMessage(93, bundle).sendToTarget();
    }

    public void z(Bundle bundle)
    {
        com.whatsapp.messaging.f.a(a).obtainMessage(71, bundle).sendToTarget();
    }
}
