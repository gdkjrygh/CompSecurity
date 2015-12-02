// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.PaymentProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class doa
{

    private static final List a = (new gkf()).a("zaakpay").a("airtel_money").a();
    private final gmg b;

    public doa(gmg gmg1)
    {
        b = gmg1;
    }

    private void a(Context context, Client client, List list)
    {
        boolean flag1 = false;
        boolean flag;
        boolean flag2;
        if (duh.a(b))
        {
            list.add(new gzi(context));
        } else
        {
            list.add(dnz.c(context));
        }
        if (client != null && client.getPaymentProfiles() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            flag2 = gki.b(client.getPaymentProfiles(), new gka() {

                final doa a;

                private static boolean a(PaymentProfile paymentprofile)
                {
                    return dui.b(paymentprofile);
                }

                public final boolean apply(Object obj)
                {
                    return a((PaymentProfile)obj);
                }

            
            {
                a = doa.this;
                super();
            }
            });
            flag1 = gki.b(client.getPaymentProfiles(), new gka() {

                final doa a;

                private static boolean a(PaymentProfile paymentprofile)
                {
                    return dui.c(paymentprofile);
                }

                public final boolean apply(Object obj)
                {
                    return a((PaymentProfile)obj);
                }

            
            {
                a = doa.this;
                super();
            }
            });
        } else
        {
            flag2 = false;
        }
        if (!flag2)
        {
            list.add(dnz.a(context));
        }
        if (duh.b(b) && !flag1)
        {
            list.add(new gvt(context));
        }
    }

    private void a(Context context, List list)
    {
        if (a())
        {
            list.add(new gxl(context));
        }
        if (duh.e(b))
        {
            list.add(new gzc(context));
        }
        if (b())
        {
            list.add(dnz.b(context));
        }
        list.add(new gym(context));
    }

    private boolean a()
    {
        return b.a(dbf.aQ);
    }

    public static boolean a(Client client)
    {
        client = client.getPaymentProfiles();
        if (client == null)
        {
            return false;
        }
        for (client = client.iterator(); client.hasNext();)
        {
            PaymentProfile paymentprofile = (PaymentProfile)client.next();
            if (paymentprofile.getTokenType() != null && a.contains(paymentprofile.getTokenType()))
            {
                return true;
            }
        }

        return false;
    }

    private static boolean a(String s, String s1)
    {
        return "CHINA".equals(s) || dcg.b.a().equals(s1);
    }

    private static void b(Context context, List list)
    {
        list.add(new gym(context));
    }

    private boolean b()
    {
        return b.b(dbf.u);
    }

    private static boolean b(String s, String s1)
    {
        return "INDIA".equals(s) || dcg.c.a().equals(s1);
    }

    public final List a(Context context, String s, Client client)
    {
        ArrayList arraylist = new ArrayList();
        String s1 = client.getMobileCountryIso2();
        if (a(s, s1))
        {
            a(context, ((List) (arraylist)));
        } else
        if (b(s, s1))
        {
            a(context, client, ((List) (arraylist)));
        } else
        {
            b(context, arraylist);
        }
        if (dxg.a(s1, s, b))
        {
            arraylist.add(new gyw(context));
        }
        return arraylist;
    }

    public final List a(Context context, String s, String s1)
    {
        ArrayList arraylist = new ArrayList();
        if (a(s, s1))
        {
            a(context, ((List) (arraylist)));
        } else
        if (b(s, s1))
        {
            a(context, ((Client) (null)), ((List) (arraylist)));
        } else
        {
            b(context, arraylist);
        }
        if (dxg.a(s1, s, b))
        {
            arraylist.add(new gyw(context));
        }
        if (duh.c(b, s1))
        {
            arraylist.add(new gxz(context));
        }
        return arraylist;
    }

    public final boolean b(Context context, String s, String s1)
    {
        if (duh.d(b))
        {
            return true;
        }
        context = a(context, s, s1);
        return context.size() == 1 && ((gsa)context.get(0)).a().equals("cash");
    }

}
