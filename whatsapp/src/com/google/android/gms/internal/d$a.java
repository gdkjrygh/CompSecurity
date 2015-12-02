// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            qq, qu, qw, qp, 
//            jx, qz

public final class s extends qq
{

    private static volatile azh gu[];
    public String gA;
    public long gB;
    public boolean gC;
    public azh gD[];
    public int gE[];
    public boolean gF;
    public String gv;
    public azh gw[];
    public azh gx[];
    public azh gy[];
    public String gz;
    public int type;

    public static s[] r()
    {
        if (gu == null)
        {
            synchronized (qu.azg)
            {
                if (gu == null)
                {
                    gu = new gu[0];
                }
            }
        }
        return gu;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(qp qp1)
    {
        boolean flag = false;
        boolean flag1 = qw.a;
        qp1.t(1, type);
        if (!gv.equals(""))
        {
            qp1.b(2, gv);
        }
        if (gw != null && gw.length > 0)
        {
            int i = 0;
            do
            {
                if (i >= gw.length)
                {
                    break;
                }
                gu gu1 = gw[i];
                if (gu1 != null)
                {
                    qp1.a(3, gu1);
                }
                i++;
            } while (!flag1);
        }
        if (gx != null && gx.length > 0)
        {
            int j = 0;
            do
            {
                if (j >= gx.length)
                {
                    break;
                }
                gu gu2 = gx[j];
                if (gu2 != null)
                {
                    qp1.a(4, gu2);
                }
                j++;
            } while (!flag1);
        }
        if (gy != null && gy.length > 0)
        {
            int k = 0;
            do
            {
                if (k >= gy.length)
                {
                    break;
                }
                gu gu3 = gy[k];
                if (gu3 != null)
                {
                    qp1.a(5, gu3);
                }
                k++;
            } while (!flag1);
        }
        if (!gz.equals(""))
        {
            qp1.b(6, gz);
        }
        if (!gA.equals(""))
        {
            qp1.b(7, gA);
        }
        if (gB != 0L)
        {
            qp1.b(8, gB);
        }
        if (gF)
        {
            qp1.b(9, gF);
        }
        if (gE != null && gE.length > 0)
        {
            int l = 0;
            do
            {
                if (l >= gE.length)
                {
                    break;
                }
                qp1.t(10, gE[l]);
                l++;
            } while (!flag1);
        }
        if (gD != null && gD.length > 0)
        {
            int i1 = ((flag) ? 1 : 0);
            do
            {
                if (i1 >= gD.length)
                {
                    break;
                }
                gu gu4 = gD[i1];
                if (gu4 != null)
                {
                    qp1.a(11, gu4);
                }
                i1++;
            } while (!flag1);
        }
        if (gC)
        {
            qp1.b(12, gC);
        }
        super.a(qp1);
    }

    protected int c()
    {
        boolean flag = false;
        boolean flag1 = qw.a;
        int j = super.c() + qp.v(1, type);
        int i = j;
        if (!gv.equals(""))
        {
            i = j + qp.j(2, gv);
        }
        int j1;
        if (gw != null && gw.length > 0)
        {
            int k = 0;
            do
            {
                j = i;
                if (k >= gw.length)
                {
                    break;
                }
                  = gw[k];
                j = i;
                if ( != null)
                {
                    j = i + qp.c(3, );
                }
                k++;
                i = j;
            } while (!flag1);
        } else
        {
            j = i;
        }
        i = j;
        if (gx != null)
        {
            i = j;
            if (gx.length > 0)
            {
                int l = 0;
                do
                {
                    i = j;
                    if (l >= gx.length)
                    {
                        break;
                    }
                     1 = gx[l];
                    i = j;
                    if (1 != null)
                    {
                        i = j + qp.c(4, 1);
                    }
                    l++;
                    j = i;
                } while (!flag1);
            }
        }
        j = i;
        if (gy != null)
        {
            j = i;
            if (gy.length > 0)
            {
                int i1 = 0;
                do
                {
                    j = i;
                    if (i1 >= gy.length)
                    {
                        break;
                    }
                     2 = gy[i1];
                    j = i;
                    if (2 != null)
                    {
                        j = i + qp.c(5, 2);
                    }
                    i1++;
                    i = j;
                } while (!flag1);
            }
        }
        i = j;
        if (!gz.equals(""))
        {
            i = j + qp.j(6, gz);
        }
        j = i;
        if (!gA.equals(""))
        {
            j = i + qp.j(7, gA);
        }
        j1 = j;
        if (gB != 0L)
        {
            j1 = j + qp.d(8, gB);
        }
        i = j1;
        if (gF)
        {
            i = j1 + qp.c(9, gF);
        }
        j = i;
        if (gE != null)
        {
            j = i;
            if (gE.length > 0)
            {
                int k1 = 0;
                j = 0;
                int i2;
                do
                {
                    i2 = j;
                    if (k1 >= gE.length)
                    {
                        break;
                    }
                    i2 = j + qp.gZ(gE[k1]);
                    k1++;
                    j = i2;
                } while (!flag1);
                j = gE.length * 1 + (i + i2);
            }
        }
        i = j;
        if (gD != null)
        {
            i = j;
            if (gD.length > 0)
            {
                int l1 = 0;
                do
                {
                    i = j;
                    if (l1 >= gD.length)
                    {
                        break;
                    }
                     3 = gD[l1];
                    i = j;
                    if (3 != null)
                    {
                        i = j + qp.c(11, 3);
                    }
                    l1++;
                    j = i;
                } while (!flag1);
            }
        }
        j = i;
        if (gC)
        {
            j = i + qp.c(12, gC);
        }
        if (jx.a != 0)
        {
            if (!flag1)
            {
                flag = true;
            }
            qw.a = flag;
        }
        return j;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        if (obj != this) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (!(obj instanceof )) goto _L4; else goto _L3
_L3:
        obj = ()obj;
        flag = flag1;
        if (type != ((type) (obj)).type) goto _L4; else goto _L5
_L5:
        if (gv != null) goto _L7; else goto _L6
_L6:
        flag = flag1;
        if (((gv) (obj)).gv != null) goto _L4; else goto _L8
_L8:
        flag = flag1;
        if (!qu.equals(gw, ((gw) (obj)).gw)) goto _L4; else goto _L9
_L9:
        flag = flag1;
        if (!qu.equals(gx, ((gx) (obj)).gx)) goto _L4; else goto _L10
_L10:
        flag = flag1;
        if (!qu.equals(gy, ((gy) (obj)).gy)) goto _L4; else goto _L11
_L11:
        if (gz != null) goto _L13; else goto _L12
_L12:
        flag = flag1;
        if (((gz) (obj)).gz != null) goto _L4; else goto _L14
_L14:
        if (gA != null)
        {
            break MISSING_BLOCK_LABEL_244;
        }
        flag = flag1;
        if (((gA) (obj)).gA != null) goto _L4; else goto _L15
_L15:
        flag = flag1;
        if (gB == ((gB) (obj)).gB)
        {
            flag = flag1;
            if (gC == ((gC) (obj)).gC)
            {
                flag = flag1;
                if (qu.equals(gD, ((gD) (obj)).gD))
                {
                    flag = flag1;
                    if (qu.equals(gE, ((gE) (obj)).gE))
                    {
                        flag = flag1;
                        if (gF == ((gF) (obj)).gF)
                        {
                            return a(((qq) (obj)));
                        }
                    }
                }
            }
        }
          goto _L4
_L7:
        if (!gv.equals(((gv) (obj)).gv))
        {
            return false;
        }
          goto _L8
_L13:
        if (!gz.equals(((gz) (obj)).gz))
        {
            return false;
        }
          goto _L14
        if (!gA.equals(((gA) (obj)).gA))
        {
            return false;
        }
          goto _L15
    }

    public int hashCode()
    {
        char c2 = '\u04CF';
        int k = 0;
        boolean flag = qw.a;
        int l = type;
        int i;
        int j;
        char c1;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        if (gv == null)
        {
            i = 0;
        } else
        {
            i = gv.hashCode();
        }
        i1 = qu.hashCode(gw);
        j1 = qu.hashCode(gx);
        k1 = qu.hashCode(gy);
        if (gz == null)
        {
            j = 0;
        } else
        {
            j = gz.hashCode();
        }
        if (gA != null)
        {
            k = gA.hashCode();
        }
        l1 = (int)(gB ^ gB >>> 32);
        if (gC)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        i2 = qu.hashCode(gD);
        j2 = qu.hashCode(gE);
        if (!gF)
        {
            c2 = '\u04D5';
        }
        k2 = rQ();
        if (flag)
        {
            jx.a++;
        }
        return ((((c1 + (((j + ((((i + (l + 527) * 31) * 31 + i1) * 31 + j1) * 31 + k1) * 31) * 31 + k) * 31 + l1) * 31) * 31 + i2) * 31 + j2) * 31 + c2) * 31 + k2;
    }

    public  s()
    {
        type = 1;
        gv = "";
        gw = r();
        gx = r();
        gy = r();
        gz = "";
        gA = "";
        gB = 0L;
        gC = false;
        gD = r();
        gE = qz.azj;
        gF = false;
        ayW = null;
        azh = -1;
        return this;
    }

    public ()
    {
        s();
    }
}
