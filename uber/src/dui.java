// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import com.ubercab.payment.model.PaymentProfile;
import com.ubercab.rider.realtime.model.Client;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class dui
{

    public static PaymentProfile a(com.ubercab.rider.realtime.model.PaymentProfile paymentprofile)
    {
        return PaymentProfile.builder().setAccountName(paymentprofile.getAccountName()).setBillingCountryIso2(paymentprofile.getBillingCountryIso2()).setBillingZip(paymentprofile.getBillingZip()).setCardExpirationEpoch(paymentprofile.getCardExpirationEpoch()).setCardNumber(paymentprofile.getCardNumber()).setCardType(paymentprofile.getCardType()).setStatus(paymentprofile.getStatus()).setTokenDisplayName(paymentprofile.getTokenDisplayName()).setTokenType(paymentprofile.getTokenType()).setUseCase(paymentprofile.getUseCase()).setUuid(paymentprofile.getUuid()).build();
    }

    private static String a(Context context, com.ubercab.rider.realtime.model.PaymentProfile paymentprofile)
    {
        byte byte0;
        paymentprofile = paymentprofile.getUseCase();
        if (paymentprofile == null)
        {
            return null;
        }
        byte0 = -1;
        paymentprofile.hashCode();
        JVM INSTR lookupswitch 2: default 44
    //                   -1146830912: 91
    //                   443164224: 77;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break MISSING_BLOCK_LABEL_91;
_L4:
        switch (byte0)
        {
        default:
            return paymentprofile;

        case 0: // '\0'
            return context.getString(0x7f07057d);

        case 1: // '\001'
            return context.getString(0x7f07052e);
        }
_L3:
        if (paymentprofile.equals("personal"))
        {
            byte0 = 0;
        }
          goto _L4
        if (paymentprofile.equals("business"))
        {
            byte0 = 1;
        }
          goto _L4
    }

    public static String a(Context context, com.ubercab.rider.realtime.model.PaymentProfile paymentprofile, List list, boolean flag)
    {
        return a(context, paymentprofile, list, flag, false);
    }

    public static String a(Context context, com.ubercab.rider.realtime.model.PaymentProfile paymentprofile, List list, boolean flag, boolean flag1)
    {
        String s;
        byte byte0;
        s = paymentprofile.getCardType();
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 8: default 92
    //                   -2052918671: 152
    //                   -1911368973: 200
    //                   2092883: 265
    //                   76891393: 232
    //                   344963008: 216
    //                   872368606: 184
    //                   883966373: 248
    //                   1963873898: 168;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_265;
_L10:
        switch (byte0)
        {
        default:
            if (flag1)
            {
                return paymentprofile.getCardNumber();
            }
            break;

        case 0: // '\0'
            int i;
            if (flag1)
            {
                i = 0x7f070523;
            } else
            {
                i = 0x7f070505;
            }
            return context.getString(i);

        case 1: // '\001'
            if (flag1)
            {
                return context.getString(0x7f070525);
            }
            if (gki.a(gki.a(list, new gka() {

        private static boolean a(com.ubercab.rider.realtime.model.PaymentProfile paymentprofile1)
        {
            return "Alipay".equals(paymentprofile1.getCardType());
        }

        public final boolean apply(Object obj)
        {
            return a((com.ubercab.rider.realtime.model.PaymentProfile)obj);
        }

    })) > 1)
            {
                return paymentprofile.getAccountName();
            } else
            {
                return context.getString(0x7f070525);
            }

        case 2: // '\002'
            if (flag1)
            {
                return context.getString(0x7f07052c);
            }
            paymentprofile = paymentprofile.getCardNumber();
            if ("bdw".equals(paymentprofile))
            {
                return context.getString(0x7f07052b);
            } else
            {
                return (new StringBuilder()).append(context.getString(0x7f07052b)).append(String.format(" \u2022\u2022\u2022\u2022 %s", new Object[] {
                    paymentprofile
                })).toString();
            }

        case 3: // '\003'
            if (flag1)
            {
                return context.getString(0x7f07057a);
            }
            if (gki.a(gki.a(list, new gka() {

        private static boolean a(com.ubercab.rider.realtime.model.PaymentProfile paymentprofile1)
        {
            return "PayPal".equals(paymentprofile1.getCardType());
        }

        public final boolean apply(Object obj)
        {
            return a((com.ubercab.rider.realtime.model.PaymentProfile)obj);
        }

    })) > 1)
            {
                return paymentprofile.getAccountName();
            } else
            {
                return context.getString(0x7f07057a);
            }

        case 4: // '\004'
            int j;
            if (flag1)
            {
                j = 0x7f070557;
            } else
            {
                j = 0x7f070556;
            }
            return context.getString(j);

        case 5: // '\005'
            if (flag1)
            {
                return context.getString(0x7f07057c);
            }
            if (gki.a(gki.a(list, new gka() {

        private static boolean a(com.ubercab.rider.realtime.model.PaymentProfile paymentprofile1)
        {
            return "Paytm".equals(paymentprofile1.getCardType());
        }

        public final boolean apply(Object obj)
        {
            return a((com.ubercab.rider.realtime.model.PaymentProfile)obj);
        }

    })) > 1)
            {
                return paymentprofile.getAccountName();
            } else
            {
                return context.getString(0x7f07057b);
            }

        case 6: // '\006'
            return paymentprofile.getAccountName();

        case 7: // '\007'
            return context.getString(0x7f070532);
        }
        break MISSING_BLOCK_LABEL_545;
_L2:
        if (s.equals("Airtel Money"))
        {
            byte0 = 0;
        }
          goto _L10
_L9:
        if (s.equals("Alipay"))
        {
            byte0 = 1;
        }
          goto _L10
_L7:
        if (s.equals("Baidu Wallet"))
        {
            byte0 = 2;
        }
          goto _L10
_L3:
        if (s.equals("PayPal"))
        {
            byte0 = 3;
        }
          goto _L10
_L6:
        if (s.equals("Google Wallet"))
        {
            byte0 = 4;
        }
          goto _L10
_L5:
        if (s.equals("Paytm"))
        {
            byte0 = 5;
        }
          goto _L10
_L8:
        if (s.equals("Delegate"))
        {
            byte0 = 6;
        }
          goto _L10
        if (s.equals("Cash"))
        {
            byte0 = 7;
        }
          goto _L10
        if (flag)
        {
            return String.format("%s \u2022\u2022\u2022\u2022 %s", new Object[] {
                a(context, paymentprofile), paymentprofile.getCardNumber()
            });
        } else
        {
            return String.format("\u2022\u2022\u2022\u2022 %s", new Object[] {
                paymentprofile.getCardNumber()
            });
        }
    }

    public static String a(com.ubercab.rider.realtime.model.PaymentProfile paymentprofile, Context context)
    {
        if ("PayPal".equals(paymentprofile.getCardType()))
        {
            return dxg.a(context);
        } else
        {
            return null;
        }
    }

    public static List a(List list)
    {
        ArrayList arraylist = new ArrayList(list.size());
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            com.ubercab.rider.realtime.model.PaymentProfile paymentprofile = (com.ubercab.rider.realtime.model.PaymentProfile)list.next();
            if (!d(paymentprofile))
            {
                arraylist.add(paymentprofile);
            }
        } while (true);
        return arraylist;
    }

    public static boolean a(Client client)
    {
        boolean flag;
        if (client != null && client.getPaymentProfiles() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag && !a(client.getPaymentProfiles()).isEmpty();
    }

    public static boolean a(Client client, String s)
    {
        if (client == null || client.getPaymentProfiles() == null || s == null)
        {
            return false;
        }
        for (client = client.getPaymentProfiles().iterator(); client.hasNext();)
        {
            if (TextUtils.equals(((com.ubercab.rider.realtime.model.PaymentProfile)client.next()).getUuid(), s))
            {
                return true;
            }
        }

        return false;
    }

    public static boolean a(String s, Client client)
    {
        if (client == null || client.getThirdPartyIdentities() == null)
        {
            return false;
        }
        for (client = client.getThirdPartyIdentities().keySet().iterator(); client.hasNext();)
        {
            String s1 = (String)client.next();
            if (esf.a(s) && s.equals(s1))
            {
                return true;
            }
        }

        return false;
    }

    public static boolean b(com.ubercab.rider.realtime.model.PaymentProfile paymentprofile)
    {
        return "Paytm".equals(paymentprofile.getCardType());
    }

    public static boolean c(com.ubercab.rider.realtime.model.PaymentProfile paymentprofile)
    {
        return "Airtel Money".equals(paymentprofile.getCardType());
    }

    public static boolean d(com.ubercab.rider.realtime.model.PaymentProfile paymentprofile)
    {
        return "Delegate".equals(paymentprofile.getCardType());
    }
}
