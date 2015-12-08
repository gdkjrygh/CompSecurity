// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad;

import android.util.SparseArray;
import com.jiubang.commerce.ad.a.a;
import com.jiubang.commerce.ad.b.a.f;

public class e
{

    public static final String a[] = {
        "\u5E7F\u544A\u5BF9\u8C61\u7C7B\u578B-->0\uFF1A\u79BB\u7EBF\u6216\u5728\u7EBFAPI\uFF0C \u5BF9\u5E94AdInfoBean", "\u5E7F\u544A\u5BF9\u8C61\u7C7B\u578B-->1\uFF1Afacebook banner", "\u5E7F\u544A\u5BF9\u8C61\u7C7B\u578B-->2\uFF1Afacebook\u5168\u5C4F", "\u5E7F\u544A\u5BF9\u8C61\u7C7B\u578B-->3\uFF1Afacebook native", "\u5E7F\u544A\u5BF9\u8C61\u7C7B\u578B-->4\uFF1Aadmob banner", "\u5E7F\u544A\u5BF9\u8C61\u7C7B\u578B-->5\uFF1Aadmob\u5168\u5C4F", "\u5E7F\u544A\u5BF9\u8C61\u7C7B\u578B-->6\uFF1Aadmob native, \u5305\u62ECCententAd\u548CInstallAppAd", "\u5E7F\u544A\u5BF9\u8C61\u7C7B\u578B-->7\uFF1Aloopme banner", "\u5E7F\u544A\u5BF9\u8C61\u7C7B\u578B-->8\uFF1Aloopme\u5168\u5C4F", "\u5E7F\u544A\u5BF9\u8C61\u7C7B\u578B-->9\uFF1Amobile core\u5E7F\u544A"
    };
    public static final String b[] = {
        "\u5E7F\u544A\u6570\u636E\u6E90::->0:\u5927\u6570\u636E(\u672C\u5730\u4F18\u5148)", "\u5E7F\u544A\u6570\u636E\u6E90::->1:\u672C\u5730\u914D\u7F6E(\u533A\u5206\u56FA\u5B9A\u968F\u673A)", "\u5E7F\u544A\u6570\u636E\u6E90::->2:FacebookNativeAD", "\u5E7F\u544A\u6570\u636E\u6E90::->3:GO\u684C\u9762\u6E05\u7406(\u5927\u6570\u636E)", "\u5E7F\u544A\u6570\u636E\u6E90::->4:GO\u684C\u9762\u6E05\u7406(Quettra)", "\u5E7F\u544A\u6570\u636E\u6E90::->5:\u5927\u6570\u636E(\u672C\u5730\u9012\u8865)", "\u5E7F\u544A\u6570\u636E\u6E90::->6:\u5E15\u5C14\u52A0\u7279", "\u5E7F\u544A\u6570\u636E\u6E90::->7:mobivista", "\u5E7F\u544A\u6570\u636E\u6E90::->8:Admob", "\u5E7F\u544A\u6570\u636E\u6E90::->9:MobileCore\u5168\u5C4F", 
        "\u5E7F\u544A\u6570\u636E\u6E90::->10:MobileCoreBanner", "\u5E7F\u544A\u6570\u636E\u6E90::->11:Facebook\u5168\u5C4F", "\u5E7F\u544A\u6570\u636E\u6E90::->12:\u901A\u7528\u5728\u7EBF\u6570\u636E\u6E90", "\u5E7F\u544A\u6570\u636E\u6E90::->13:\u667A\u80FD\u9884\u52A0\u8F7D\u6570\u636E\u6E90", "\u5E7F\u544A\u6570\u636E\u6E90::->14:\u672C\u5730\u914D\u7F6E(\u56FD\u5185)", "\u5E7F\u544A\u6570\u636E\u6E90::->15:\u667A\u80FD\u9884\u52A0\u8F7D\u6570\u636E\u6E90(\u5206\u7C7B\u63A8\u8350)", "\u5E7F\u544A\u6570\u636E\u6E90::->16:LoopMe"
    };
    private static SparseArray c;

    public static String a(a a1)
    {
        if (a1 == null)
        {
            return "{[AdInfoBean] null}";
        } else
        {
            return String.format("{[AdInfoBean] mModuleId:%d, mMapId:%d, mPkgName:%s, mName:%s, mAdPreload:%b, mIconUrl:%s, mBannerUrl:%s, mRemdMsg:%s, mAdUrl:%s}", new Object[] {
                Integer.valueOf(a1.c()), Integer.valueOf(a1.e()), a1.f(), a1.g(), Integer.valueOf(a1.r()), a1.h(), a1.i(), a1.l(), a1.q()
            });
        }
    }

    public static String a(f f1)
    {
        if (f1 == null)
        {
            return "{[BaseModuleDataItemBean] null}";
        }
        if (f1.t())
        {
            return String.format("{[BaseModuleDataItemBean] \u6A21\u5757id:%d, %s, %s, %s, mAdvPositionId:%d, OnlineAdvPositionId:%d, \u5E7F\u544Aid:%s}", new Object[] {
                Integer.valueOf(f1.b()), c(f1), d(f1), b(f1), Integer.valueOf(f1.c()), Integer.valueOf(f1.m()), a(f1.h())
            });
        } else
        {
            return String.format("{[BaseModuleDataItemBean] \u6A21\u5757id:%d, %s, %s, %s, mAdvPositionId:%d, OnlineAdvPositionId:%d}", new Object[] {
                Integer.valueOf(f1.b()), c(f1), d(f1), b(f1), Integer.valueOf(f1.c()), Integer.valueOf(f1.m())
            });
        }
    }

    private static String a(String as[])
    {
        String s1 = "";
        String s = s1;
        if (as != null)
        {
            s = s1;
            if (as.length > 0)
            {
                s = "";
                int i = 0;
                while (i < as.length) 
                {
                    String s3 = as[i];
                    if (s3 != null)
                    {
                        String s2 = s;
                        if (s.length() > 0)
                        {
                            s2 = (new StringBuilder()).append(s).append("#").toString();
                        }
                        s = (new StringBuilder()).append(s2).append(s3).toString();
                    }
                    i++;
                }
            }
        }
        as = s;
        if (s.length() == 0)
        {
            as = "null";
        }
        return as;
    }

    private static String b(f f1)
    {
        if (f.a(f1))
        {
            return "banner\u6837\u5F0F";
        }
        if (f.b(f1))
        {
            return "\u5168\u5C4F\u6837\u5F0F";
        } else
        {
            return "native\u6837\u5F0F";
        }
    }

    private static String c(f f1)
    {
        if (f1 == null)
        {
            return null;
        }
        if (f1.t())
        {
            return "SDK\u5E7F\u544A";
        }
        if (f1.u())
        {
            return "\u79BB\u7EBF\u5E7F\u544A";
        } else
        {
            return "\u5728\u7EBFAPI\u5E7F\u544A";
        }
    }

    private static String d(f f1)
    {
        int i;
        if (f1 != null)
        {
            if ((i = f1.d()) >= 0 && i < b.length)
            {
                return b[i];
            }
        }
        return null;
    }

    static 
    {
        c = new SparseArray();
        c.put(17, "17->\u7F51\u7EDC\u9519\u8BEF");
        c.put(18, "18->\u8BF7\u6C42\u9519\u8BEF");
        c.put(19, "19->\u6A21\u5757\u4E0B\u7EBF");
        c.put(20, "20->\u83B7\u53D6\u5E7F\u544A\u63A7\u5236\u4FE1\u606F\u5217\u8868\u4E3A\u7A7A");
        c.put(21, "21->\u83B7\u53D6\u5E7F\u544A\u4FE1\u606F\u5217\u8868\u4E3A\u7A7A");
    }
}
