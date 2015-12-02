// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            bz, di, DataLayer, bh, 
//            cr, dl, dm, k, 
//            ag, bk, aj, ck, 
//            cm, cs, bx, cn, 
//            af, t

class ct
{

    private static final bz atb = new bz(di.rb(), true);
    private final DataLayer aqn;
    private final ag atd;
    private final Map ate;
    private final Map atf;
    private final Map atg;
    private final k ath;
    private final k ati;
    private final Set atj;
    private final Map atk;
    private volatile String atl;
    private int atm;

    private bz a(com.google.android.gms.internal.d.a a1, Set set, dl dl1)
    {
        boolean flag;
        flag = DataLayer.a;
        if (!a1.gF)
        {
            return new bz(a1, true);
        }
        a1.type;
        JVM INSTR tableswitch 2 7: default 64
    //                   2 93
    //                   3 191
    //                   4 390
    //                   5 64
    //                   6 64
    //                   7 501;
           goto _L1 _L2 _L3 _L4 _L1 _L1 _L5
_L1:
        bh.T((new StringBuilder()).append("Unknown type: ").append(a1.type).toString());
        return atb;
_L2:
        com.google.android.gms.internal.d.a a2;
        int i;
        a2 = com.google.android.gms.tagmanager.cr.g(a1);
        a2.gw = new com.google.android.gms.internal.d.a[a1.gw.length];
        i = 0;
_L18:
        if (i >= a1.gw.length) goto _L7; else goto _L6
_L6:
        bz bz1 = a(a1.gw[i], set, dl1.fK(i));
        if (bz1 == atb)
        {
            return atb;
        }
        a2.gw[i] = (com.google.android.gms.internal.d.a)bz1.getObject();
        if (!flag) goto _L8; else goto _L7
_L7:
        return new bz(a2, false);
_L3:
        a2 = com.google.android.gms.tagmanager.cr.g(a1);
        if (a1.gx.length != a1.gy.length)
        {
            bh.T((new StringBuilder()).append("Invalid serving value: ").append(a1.toString()).toString());
            return atb;
        }
        a2.gx = new com.google.android.gms.internal.d.a[a1.gx.length];
        a2.gy = new com.google.android.gms.internal.d.a[a1.gx.length];
        i = 0;
_L16:
        if (i >= a1.gx.length) goto _L10; else goto _L9
_L9:
        bz bz2 = a(a1.gx[i], set, dl1.fL(i));
        bz bz4 = a(a1.gy[i], set, dl1.fM(i));
        if (bz2 == atb || bz4 == atb)
        {
            return atb;
        }
        a2.gx[i] = (com.google.android.gms.internal.d.a)bz2.getObject();
        a2.gy[i] = (com.google.android.gms.internal.d.a)bz4.getObject();
        if (!flag) goto _L11; else goto _L10
_L10:
        return new bz(a2, false);
_L4:
        if (set.contains(a1.gz))
        {
            bh.T((new StringBuilder()).append("Macro cycle detected.  Current macro reference: ").append(a1.gz).append(".").append("  Previous macro references: ").append(set.toString()).append(".").toString());
            return atb;
        } else
        {
            set.add(a1.gz);
            dl1 = dm.a(a(a1.gz, set, dl1.pW()), a1.gE);
            set.remove(a1.gz);
            return dl1;
        }
_L5:
        a2 = com.google.android.gms.tagmanager.cr.g(a1);
        a2.gD = new com.google.android.gms.internal.d.a[a1.gD.length];
        i = 0;
_L15:
        if (i >= a1.gD.length) goto _L13; else goto _L12
_L12:
        bz bz3 = a(a1.gD[i], set, dl1.fN(i));
        if (bz3 == atb)
        {
            return atb;
        }
        a2.gD[i] = (com.google.android.gms.internal.d.a)bz3.getObject();
        if (!flag) goto _L14; else goto _L13
_L13:
        return new bz(a2, false);
_L14:
        i++;
        if (true) goto _L15; else goto _L11
_L11:
        i++;
        if (true) goto _L16; else goto _L8
_L8:
        i++;
        if (true) goto _L18; else goto _L17
_L17:
    }

    private bz a(String s, Set set, bk bk1)
    {
        atm = atm + 1;
        Object obj = (b)ati.get(s);
        if (obj != null && !atd.pH())
        {
            a(((b) (obj)).qm(), set);
            atm = atm - 1;
            return ((b) (obj)).qG();
        }
        obj = (c)atk.get(s);
        if (obj == null)
        {
            bh.T((new StringBuilder()).append(qF()).append("Invalid macro: ").append(s).toString());
            atm = atm - 1;
            return atb;
        }
        bz bz1 = a(s, ((c) (obj)).qH(), ((c) (obj)).qI(), ((c) (obj)).qJ(), ((c) (obj)).qL(), ((c) (obj)).qK(), set, bk1.py());
        if (((Set)bz1.getObject()).isEmpty())
        {
            obj = ((c) (obj)).qM();
        } else
        {
            if (((Set)bz1.getObject()).size() > 1)
            {
                bh.W((new StringBuilder()).append(qF()).append("Multiple macros active for macroName ").append(s).toString());
            }
            obj = (cr.a)((Set)bz1.getObject()).iterator().next();
        }
        if (obj == null)
        {
            atm = atm - 1;
            return atb;
        }
        bk1 = a(atg, ((cr.a) (obj)), set, bk1.pN());
        boolean flag;
        if (bz1.pX() && bk1.pX())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (bk1 == atb)
        {
            bk1 = atb;
        } else
        {
            bk1 = new bz(bk1.getObject(), flag);
        }
        obj = ((cr.a) (obj)).qm();
        if (bk1.pX())
        {
            ati.e(s, new b(bk1, ((com.google.android.gms.internal.d.a) (obj))));
        }
        a(((com.google.android.gms.internal.d.a) (obj)), set);
        atm = atm - 1;
        return bk1;
    }

    private bz a(Map map, cr.a a1, Set set, ck ck1)
    {
        boolean flag1 = DataLayer.a;
        Object obj = (com.google.android.gms.internal.d.a)a1.ql().get(com.google.android.gms.internal.b.cU.toString());
        if (obj == null)
        {
            bh.T("No function id in properties");
            map = atb;
        } else
        {
            obj = ((com.google.android.gms.internal.d.a) (obj)).gA;
            aj aj1 = (aj)map.get(obj);
            if (aj1 == null)
            {
                bh.T((new StringBuilder()).append(((String) (obj))).append(" has no backing implementation.").toString());
                return atb;
            }
            map = (bz)ath.get(a1);
            if (map == null || atd.pH())
            {
                map = new HashMap();
                Iterator iterator = a1.ql().entrySet().iterator();
                boolean flag = true;
label0:
                do
                {
                    java.util.Map.Entry entry;
                    Object obj1;
label1:
                    {
                        if (!iterator.hasNext())
                        {
                            break label0;
                        }
                        entry = (java.util.Map.Entry)iterator.next();
                        obj1 = ck1.cJ((String)entry.getKey());
                        obj1 = a((com.google.android.gms.internal.d.a)entry.getValue(), set, ((cm) (obj1)).e((com.google.android.gms.internal.d.a)entry.getValue()));
                        if (obj1 == atb)
                        {
                            return atb;
                        }
                        if (((bz) (obj1)).pX())
                        {
                            a1.a((String)entry.getKey(), (com.google.android.gms.internal.d.a)((bz) (obj1)).getObject());
                            if (!flag1)
                            {
                                break label1;
                            }
                        }
                        flag = false;
                    }
                    map.put(entry.getKey(), ((bz) (obj1)).getObject());
                } while (!flag1);
                if (!aj1.a(map.keySet()))
                {
                    bh.T((new StringBuilder()).append("Incorrect keys for function ").append(((String) (obj))).append(" required ").append(aj1.pJ()).append(" had ").append(map.keySet()).toString());
                    return atb;
                }
                if (flag && aj1.pe())
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                map = new bz(aj1.B(map), flag1);
                if (flag1)
                {
                    ath.e(a1, map);
                }
                ck1.d((com.google.android.gms.internal.d.a)map.getObject());
                return map;
            }
        }
        return map;
    }

    private bz a(Set set, Set set1, a a1, cs cs1)
    {
        boolean flag1 = DataLayer.a;
        HashSet hashset = new HashSet();
        HashSet hashset1 = new HashSet();
        set = set.iterator();
        boolean flag = true;
        do
        {
            if (!set.hasNext())
            {
                break;
            }
            cr.e e = (cr.e)set.next();
            cn cn1 = cs1.pV();
            bz bz1 = a(e, set1, cn1);
            if (((Boolean)bz1.getObject()).booleanValue())
            {
                a1.a(e, hashset, hashset1, cn1);
            }
            if (flag && bz1.pX())
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } while (!flag1);
        hashset.removeAll(hashset1);
        cs1.b(hashset);
        return new bz(hashset, flag);
    }

    private void a(com.google.android.gms.internal.d.a a1, Set set)
    {
        boolean flag = DataLayer.a;
        if (a1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if ((a1 = a(a1, set, ((dl) (new bx())))) == atb) goto _L1; else goto _L3
_L3:
        a1 = ((com.google.android.gms.internal.d.a) (di.o((com.google.android.gms.internal.d.a)a1.getObject())));
        if (!(a1 instanceof Map))
        {
            break; /* Loop/switch isn't completed */
        }
        set = (Map)a1;
        aqn.push(set);
        if (!flag) goto _L1; else goto _L4
_L4:
        if (!(a1 instanceof List))
        {
            break; /* Loop/switch isn't completed */
        }
        a1 = ((List)a1).iterator();
        do
        {
            if (!a1.hasNext())
            {
                break;
            }
            set = ((Set) (a1.next()));
            if (set instanceof Map)
            {
                set = (Map)set;
                aqn.push(set);
                if (!flag)
                {
                    continue;
                }
            }
            bh.W("pushAfterEvaluate: value not a Map");
        } while (!flag);
        if (!flag) goto _L1; else goto _L5
_L5:
        bh.W("pushAfterEvaluate: value not a Map or List");
        return;
    }

    private String qF()
    {
        boolean flag = DataLayer.a;
        if (atm <= 1)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(Integer.toString(atm));
        int i = 2;
        do
        {
            if (i >= atm)
            {
                break;
            }
            stringbuilder.append(' ');
            i++;
        } while (!flag);
        stringbuilder.append(": ");
        return stringbuilder.toString();
    }

    bz a(cr.a a1, Set set, ck ck1)
    {
        a1 = a(atf, a1, set, ck1);
        set = di.n((com.google.android.gms.internal.d.a)a1.getObject());
        ck1.d(di.u(set));
        return new bz(set, a1.pX());
    }

    bz a(cr.e e, Set set, cn cn1)
    {
        boolean flag1 = DataLayer.a;
        Iterator iterator = e.qu().iterator();
        boolean flag = true;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            bz bz2 = a((cr.a)iterator.next(), set, cn1.pP());
            if (((Boolean)bz2.getObject()).booleanValue())
            {
                cn1.f(di.u(Boolean.valueOf(false)));
                return new bz(Boolean.valueOf(false), bz2.pX());
            }
            if (flag && bz2.pX())
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } while (!flag1);
        e = e.qt().iterator();
        do
        {
            if (!e.hasNext())
            {
                break;
            }
            bz bz1 = a((cr.a)e.next(), set, cn1.pQ());
            if (!((Boolean)bz1.getObject()).booleanValue())
            {
                cn1.f(di.u(Boolean.valueOf(false)));
                return new bz(Boolean.valueOf(false), bz1.pX());
            }
            if (flag && bz1.pX())
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } while (!flag1);
        cn1.f(di.u(Boolean.valueOf(true)));
        return new bz(Boolean.valueOf(true), flag);
    }

    bz a(String s, Set set, Map map, Map map1, Map map2, Map map3, Set set1, 
            cs cs1)
    {
        return a(set, set1, ((a) (new _cls3(map, map1, map2, map3))), cs1);
    }

    bz a(Set set, cs cs1)
    {
        return a(set, ((Set) (new HashSet())), ((a) (new _cls4())), cs1);
    }

    void cU(String s)
    {
        this;
        JVM INSTR monitorenter ;
        atl = s;
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void cr(String s)
    {
        this;
        JVM INSTR monitorenter ;
        t t1;
        Iterator iterator;
        boolean flag;
        flag = DataLayer.a;
        cU(s);
        s = atd.cD(s);
        t1 = s.pF();
        iterator = ((Set)a(atj, t1.py()).getObject()).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            cr.a a1 = (cr.a)iterator.next();
            a(ate, a1, new HashSet(), t1.px());
        } while (!flag);
        s.pG();
        cU(null);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }


    private class b
    {

        private com.google.android.gms.internal.d.a asN;
        private bz ats;

        public bz qG()
        {
            return ats;
        }

        public com.google.android.gms.internal.d.a qm()
        {
            return asN;
        }

        public b(bz bz1, com.google.android.gms.internal.d.a a1)
        {
            ats = bz1;
            asN = a1;
        }
    }


    private class c
    {

        private final Set atj = new HashSet();
        private final Map att = new HashMap();
        private final Map atu = new HashMap();
        private final Map atv = new HashMap();
        private final Map atw = new HashMap();
        private cr.a atx;

        public Set qH()
        {
            return atj;
        }

        public Map qI()
        {
            return att;
        }

        public Map qJ()
        {
            return atv;
        }

        public Map qK()
        {
            return atw;
        }

        public Map qL()
        {
            return atu;
        }

        public cr.a qM()
        {
            return atx;
        }

        public c()
        {
        }
    }


    private class a
    {

        public abstract void a(cr.e e, Set set, Set set1, cn cn1);
    }


    private class _cls3
        implements a
    {

        final ct atn;
        final Map ato;
        final Map atp;
        final Map atq;
        final Map atr;

        public void a(cr.e e, Set set, Set set1, cn cn1)
        {
            List list = (List)ato.get(e);
            List list1 = (List)atp.get(e);
            if (list != null)
            {
                set.addAll(list);
                cn1.pR().c(list, list1);
            }
            set = (List)atq.get(e);
            e = (List)atr.get(e);
            if (set != null)
            {
                set1.addAll(set);
                cn1.pS().c(set, e);
            }
        }

        _cls3(Map map, Map map1, Map map2, Map map3)
        {
            atn = ct.this;
            ato = map;
            atp = map1;
            atq = map2;
            atr = map3;
            super();
        }
    }


    private class _cls4
        implements a
    {

        final ct atn;

        public void a(cr.e e, Set set, Set set1, cn cn1)
        {
            set.addAll(e.qv());
            set1.addAll(e.qw());
            cn1.pT().c(e.qv(), e.qA());
            cn1.pU().c(e.qw(), e.qB());
        }

        _cls4()
        {
            atn = ct.this;
            super();
        }
    }

}
