// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.d;

import com.jiubang.commerce.ad.e.ah;

// Referenced classes of package com.jiubang.commerce.ad.d:
//            k

public class b
{

    protected int a;
    private final int b;

    public b(int i, String s, String s1)
    {
        b = i;
        a = b(s, s1);
    }

    private int a(String s, String s1, boolean flag)
    {
        if (!"4".equals(s)) goto _L2; else goto _L1
_L1:
        if (!s1.equals("2")) goto _L4; else goto _L3
_L3:
        if (!flag) goto _L6; else goto _L5
_L5:
        return 370;
_L6:
        return 412;
_L4:
        return !flag ? 432 : 318;
_L2:
        if ("6".equals(s))
        {
            if (s1.equals("2"))
            {
                return !flag ? 410 : 378;
            }
            return !flag ? 428 : 320;
        }
        if ("8".equals(s))
        {
            if (s1.equals("2"))
            {
                return !flag ? 414 : 374;
            }
            return !flag ? 434 : 326;
        }
        if ("5".equals(s))
        {
            if (s1.equals("2"))
            {
                return !flag ? 416 : 382;
            }
            return !flag ? 436 : 324;
        }
        if ("11".equals(s))
        {
            return !flag ? 430 : 328;
        }
        if ("7".equals(s))
        {
            return !flag ? 424 : 322;
        }
        if ("12".equals(s))
        {
            return !flag ? 422 : 330;
        }
        if ("13".equals(s))
        {
            return !flag ? 426 : 332;
        }
        if ("9".equals(s))
        {
            if (s1.equals("2"))
            {
                if (!flag)
                {
                    return 412;
                }
            } else
            {
                return !flag ? 420 : 354;
            }
        } else
        {
            if ("15".equals(s))
            {
                return !flag ? 418 : 390;
            }
            if ("21".equals(s))
            {
                return !flag ? 676 : 678;
            } else
            {
                return -1;
            }
        }
        if (true) goto _L5; else goto _L7
_L7:
    }

    private int d(String s, String s1)
    {
        if (!"4".equals(s)) goto _L2; else goto _L1
_L1:
        if (!s1.equals("2")) goto _L4; else goto _L3
_L3:
        return 372;
_L4:
        return 276;
_L2:
        if ("6".equals(s))
        {
            return !s1.equals("2") ? 696 : 380;
        }
        if ("8".equals(s))
        {
            return !s1.equals("2") ? 280 : 376;
        }
        if ("5".equals(s))
        {
            return !s1.equals("2") ? 282 : 384;
        }
        if ("11".equals(s))
        {
            return !s1.equals("2") ? 284 : 532;
        }
        if ("7".equals(s))
        {
            return !s1.equals("2") ? 294 : 528;
        }
        if ("12".equals(s))
        {
            return !s1.equals("2") ? 292 : 530;
        }
        if ("13".equals(s))
        {
            return 298;
        }
        if ("9".equals(s))
        {
            if (!s1.equals("2"))
            {
                return 352;
            }
        } else
        {
            if ("15".equals(s))
            {
                return 388;
            }
            return !"21".equals(s) ? -1 : 680;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    private int e(String s, String s1)
    {
        if (!"4".equals(s)) goto _L2; else goto _L1
_L1:
        if (!s1.equals("2")) goto _L4; else goto _L3
_L3:
        return 446;
_L4:
        return 462;
_L2:
        if ("6".equals(s))
        {
            return !s1.equals("2") ? 470 : 444;
        }
        if ("8".equals(s))
        {
            return !s1.equals("2") ? 464 : 448;
        }
        if ("5".equals(s))
        {
            return !s1.equals("2") ? 466 : 450;
        }
        if ("11".equals(s))
        {
            return 460;
        }
        if ("7".equals(s))
        {
            return 458;
        }
        if ("12".equals(s))
        {
            return 456;
        }
        if ("13".equals(s))
        {
            return 468;
        }
        if (!"9".equals(s))
        {
            break; /* Loop/switch isn't completed */
        }
        if (!s1.equals("2"))
        {
            return 454;
        }
        if (true) goto _L3; else goto _L5
_L5:
        if ("15".equals(s))
        {
            return 452;
        }
        if ("21".equals(s))
        {
            return 674;
        }
        if (true) goto _L3; else goto _L6
_L6:
    }

    protected int a(String s, String s1)
    {
        switch (b)
        {
        default:
            return -1;

        case 0: // '\0'
            return d(s, s1);

        case 1: // '\001'
            return a(s, s1, true);

        case 2: // '\002'
            return a(s, s1, false);

        case 3: // '\003'
            return e(s, s1);
        }
    }

    protected int b(String s, String s1)
    {
        if (ah.a().b())
        {
            return c(s, s1);
        } else
        {
            return a(s, s1);
        }
    }

    protected int c(String s, String s1)
    {
        if (b >= 0) goto _L2; else goto _L1
_L1:
        return -1;
_L2:
        Object obj;
        obj = null;
        if (!"4".equals(s))
        {
            break; /* Loop/switch isn't completed */
        }
        if (s1.equals("2"))
        {
            s1 = k.l;
        } else
        {
            s1 = k.e;
        }
_L4:
        if (s1 != null && b < s1.length)
        {
            return s1[b];
        }
        if (true) goto _L1; else goto _L3
_L3:
        if ("6".equals(s))
        {
            if (s1.equals("2"))
            {
                s1 = k.n;
            } else
            {
                s1 = k.h;
            }
        } else
        if ("8".equals(s))
        {
            if (s1.equals("2"))
            {
                s1 = k.m;
            } else
            {
                s1 = k.i;
            }
        } else
        if ("5".equals(s))
        {
            if (s1.equals("2"))
            {
                s1 = k.o;
            } else
            {
                s1 = k.j;
            }
        } else
        if ("11".equals(s))
        {
            if (s1.equals("2"))
            {
                s1 = k.r;
            } else
            {
                s1 = k.f;
            }
        } else
        if ("7".equals(s))
        {
            if (s1.equals("2"))
            {
                s1 = k.p;
            } else
            {
                s1 = k.g;
            }
        } else
        if ("12".equals(s))
        {
            if (s1.equals("2"))
            {
                s1 = k.q;
            } else
            {
                s1 = k.d;
            }
        } else
        if ("13".equals(s))
        {
            s1 = k.a;
        } else
        if ("9".equals(s))
        {
            if (s1.equals("2"))
            {
                s1 = k.l;
            } else
            {
                s1 = k.k;
            }
        } else
        if ("15".equals(s))
        {
            s1 = k.c;
        } else
        if ("21".equals(s))
        {
            s1 = k.b;
        } else
        if ("19".equals(s))
        {
            s1 = k.s;
        } else
        if ("10".equals(s))
        {
            s1 = k.t;
        } else
        {
            s1 = obj;
            if ("20".equals(s))
            {
                s1 = k.u;
            }
        }
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }
}
