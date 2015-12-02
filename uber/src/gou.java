// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.List;

public final class gou
{

    private static final List d = (new gkf()).a("\u611B\u65B0\u89BA\u7F85").a("\u7231\u65B0\u89C9\u7F57").a("\u5B5B\u5152\u53EA\u65A4").a("\u5B5B\u513F\u53EA\u65A4").a();
    private static final List e = (new gkf()).a("\u963F\u53F2\u90A3").a("\u8D6B\u820D\u91CC").a();
    private static final List f = (new gkf()).a("\u767E\u91CC").a("\u6DF3\u4E8E").a("\u7B2C\u4E94").a("\u6771\u65B9").a("\u4E1C\u65B9").a("\u6771\u95A3").a("\u4E1C\u9601").a("\u6771\u90ED").a("\u4E1C\u90ED").a("\u6771\u9580").a("\u4E1C\u95E8").a("\u7AEF\u6728").a("\u7368\u5B64").a("\u72EC\u5B64").a("\u516C\u5B6B").a("\u516C\u5B59").a("\u516C\u7F8A").a("\u516C\u51B6").a("\u516C\u897F").a("\u6BCC\u4E18").a("\u7A40\u6881").a("\u8CC0\u862D").a("\u8D3A\u5170").a("\u8D6B\u9023").a("\u8D6B\u8FDE").a("\u8CC0\u82E5").a("\u8D3A\u82E5").a("\u7687\u752B").a("\u547C\u5EF6").a("\u4EE4\u72D0").a("\u752A\u91CC").a("\u95AD\u4E18").a("\u95FE\u4E18").a("\u4E07\u4FDF").a("\u6155\u5BB9").a("\u7D0D\u862D").a("\u7EB3\u5170").a("\u5357\u5BAE").a("\u5357\u5BAB").a("\u6B50\u967D").a("\u6B27\u9633").a("\u6C99\u5412").a("\u4E0A\u5B98").a("\u7533\u5C60").a("\u53F8\u99AC").a("\u53F8\u9A6C").a("\u53F8\u5F92").a("\u53F8\u7A7A").a("\u53F8\u5BC7").a("\u592A\u53F2").a("\u6FB9\u81FA").a("\u6FB9\u53F0").a("\u62D3\u8DCB").a("\u5B8C\u984F").a("\u5B8C\u989C").a("\u805E\u4EBA").a("\u95FB\u4EBA").a("\u5DEB\u99AC").a("\u5DEB\u9A6C").a("\u590F\u4FAF").a("\u9BAE\u4E8E").a("\u9C9C\u4E8E").a("\u897F\u9580").a("\u897F\u95E8").a("\u8ED2\u8F45").a("\u8F69\u8F95").a("\u694A\u5B50").a("\u6768\u5B50").a("\u8036\u5F8B").a("\u6A02\u6B63").a("\u4E50\u6B63").a("\u5C09\u9072").a("\u5C09\u8FDF").a("\u5B87\u6587").a("\u9577\u5B6B").a("\u957F\u5B59").a("\u937E\u96E2").a("\u949F\u79BB").a("\u8AF8\u845B").a("\u8BF8\u845B").a("\u795D\u878D").a("\u5B50\u8ECA").a("\u5B50\u8F66").a("\u5DE6\u4EBA").a();
    String a;
    String b;
    String c;

    public gou(String s)
    {
        c = s;
        a(s);
    }

    public gou(String s, String s1)
    {
        b = s1;
        a = s;
        c = (new StringBuilder()).append(b()).append(a()).toString();
    }

    private void a(String s)
    {
        byte byte0;
        int i;
        byte0 = 4;
        if (TextUtils.isEmpty(s))
        {
            b = "";
            a = "";
            return;
        }
        i = s.length();
        if (i < 5) goto _L2; else goto _L1
_L1:
        if (!d.contains(s.substring(0, 4))) goto _L4; else goto _L3
_L3:
        b = s.substring(0, byte0);
        a = s.substring(byte0);
        return;
_L2:
        if (i == 4)
        {
            if (e.contains(s.substring(0, 3)))
            {
                byte0 = 3;
                continue; /* Loop/switch isn't completed */
            }
        } else
        if (i == 3 && f.contains(s.substring(0, 2)))
        {
            byte0 = 2;
            continue; /* Loop/switch isn't completed */
        }
_L4:
        byte0 = 1;
        if (true) goto _L3; else goto _L5
_L5:
    }

    public final String a()
    {
        if (a == null)
        {
            return "";
        } else
        {
            return a;
        }
    }

    public final String b()
    {
        if (b == null)
        {
            return "";
        } else
        {
            return b;
        }
    }

    public final String c()
    {
        if (c == null)
        {
            return "";
        } else
        {
            return c;
        }
    }

}
