// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.ggheart.apps.desks.diy.filter.core;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.jiubang.ggheart.apps.desks.diy.filter.core:
//            FilterParameter

public class FilterParameterBuidler
{

    private static List a;
    private static List b;

    protected FilterParameterBuidler(Context context)
    {
    }

    private void a()
    {
        if (b != null);
    }

    private void b()
    {
        if (a == null)
        {
            a = new ArrayList();
            FilterParameter filterparameter = createFilterParameter(0);
            a.add(filterparameter);
            filterparameter = createFilterParameter(32768);
            a.add(filterparameter);
            filterparameter = createFilterParameter(0x10000);
            a.add(filterparameter);
            filterparameter = createFilterParameter(16384);
            a.add(filterparameter);
            filterparameter = createFilterParameter(0x20000);
            a.add(filterparameter);
            filterparameter = createFilterParameter(256);
            a.add(filterparameter);
            filterparameter = createFilterParameter(512);
            a.add(filterparameter);
            filterparameter = createFilterParameter(1024);
            a.add(filterparameter);
            filterparameter = createFilterParameter(2);
            a.add(filterparameter);
            filterparameter = createFilterParameter(4);
            a.add(filterparameter);
            filterparameter = createFilterParameter(8);
            a.add(filterparameter);
            filterparameter = createFilterParameter(16);
            a.add(filterparameter);
            filterparameter = createFilterParameter(32);
            a.add(filterparameter);
        }
    }

    public static FilterParameter createFilterParameter(int i)
    {
        FilterParameter filterparameter3;
        switch (i)
        {
        default:
            return new FilterParameter(0, 0x7f080467, new int[] {
                0, 0
            });

        case 0: // '\0'
            return new FilterParameter(0, 0x7f080467, new int[] {
                0, 0
            });

        case 32768: 
            return new FilterParameter(32768, 0x7f08046a, new int[] {
                706, 719
            });

        case 65536: 
            return new FilterParameter(0x10000, 0x7f08046b, new int[] {
                707, 720
            });

        case 16384: 
            return new FilterParameter(16384, 0x7f08046c, new int[] {
                708, 721
            });

        case 131072: 
            return new FilterParameter(0x20000, 0x7f08046d, new int[] {
                709, 722
            });

        case 256: 
            return new FilterParameter(256, 0x7f080468, new int[] {
                704, 717
            });

        case 512: 
            return new FilterParameter(512, 0x7f080469, new int[] {
                705, 718
            });

        case 1024: 
            return new FilterParameter(1024, 0x7f08046e, new int[] {
                710, 723
            });

        case 2: // '\002'
            return new FilterParameter(2, 0x7f08046f, new int[] {
                711, 724
            });

        case 4: // '\004'
            FilterParameter filterparameter = new FilterParameter(4, 0x7f080470, new int[] {
                712, 725
            });
            filterparameter.setDiyColor(0xfffea821);
            return filterparameter;

        case 8: // '\b'
            FilterParameter filterparameter1 = new FilterParameter(8, 0x7f080471, new int[] {
                713, 726
            });
            filterparameter1.setDiyColor(0xff8b1c62);
            return filterparameter1;

        case 16: // '\020'
            FilterParameter filterparameter2 = new FilterParameter(16, 0x7f080472, new int[] {
                714, 727
            });
            filterparameter2.setDiyColor(0xff1e90ff);
            return filterparameter2;

        case 32: // ' '
            filterparameter3 = new FilterParameter(32, 0x7f080473, new int[] {
                715, 728
            });
            break;
        }
        filterparameter3.setDiyColor(0xffbcee68);
        return filterparameter3;
    }

    public static String getStatisticalTypeId(int i)
    {
        switch (i)
        {
        default:
            return "1";

        case 0: // '\0'
            return "1";

        case 32768: 
            return "2";

        case 65536: 
            return "3";

        case 16384: 
            return "4";

        case 131072: 
            return "5";

        case 256: 
            return "6";

        case 512: 
            return "7";

        case 1024: 
            return "8";

        case 2: // '\002'
            return "9";

        case 4: // '\004'
            return "10";

        case 8: // '\b'
            return "11";

        case 16: // '\020'
            return "12";

        case 32: // ' '
            return "13";
        }
    }

    public List buildParameter(int i)
    {
        if (i == 0)
        {
            b();
            return a;
        }
        if (i == 1)
        {
            a();
            return b;
        } else
        {
            return null;
        }
    }

    public void cleanUp()
    {
        if (a != null)
        {
            a.clear();
            a = null;
        }
        if (b != null)
        {
            b.clear();
            b = null;
        }
    }
}
