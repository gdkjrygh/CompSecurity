// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kahuna.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import javax.security.auth.x500.X500Principal;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kahuna.sdk:
//            KahunaCommon, IKahunaUserCredentials

public class KahunaUtils
{

    private static final String DEBUG_DN_START = "CN=Android Debug,O=Android";
    protected static final String MD5_ALGORITHM = "MD5";
    protected static final String SHA1_ALGORITHM = "SHA-1";
    private static Map internalPatternCache = new HashMap();
    private static Object internalPatternCacheLock = new Object();

    public KahunaUtils()
    {
    }

    protected static void clearRegexPatternCache()
    {
        synchronized (internalPatternCacheLock)
        {
            internalPatternCache.clear();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static String convertToHex(byte abyte0[])
    {
        StringBuilder stringbuilder;
        int i;
        int l;
        stringbuilder = new StringBuilder();
        l = abyte0.length;
        i = 0;
_L2:
        int j;
        int k;
        byte byte0;
        if (i >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        byte0 = abyte0[i];
        k = byte0 >>> 4 & 0xf;
        j = 0;
_L3:
        char c;
        if (k >= 0 && k <= 9)
        {
            c = (char)(k + 48);
        } else
        {
            c = (char)((k - 10) + 97);
        }
        stringbuilder.append(c);
        k = byte0 & 0xf;
        if (j < 1)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        return stringbuilder.toString();
        j++;
          goto _L3
    }

    protected static boolean doMapsOverlap(Map map, Map map1)
    {
        if (!isNullOrEmpty(map) && !isNullOrEmpty(map1))
        {
            HashSet hashset = new HashSet(map.keySet());
            hashset.retainAll(map1.keySet());
            if (!hashset.isEmpty())
            {
                map = map.entrySet().iterator();
                while (map.hasNext()) 
                {
                    Object obj1 = (java.util.Map.Entry)map.next();
                    Object obj = (String)((java.util.Map.Entry) (obj1)).getKey();
                    obj1 = (Set)((java.util.Map.Entry) (obj1)).getValue();
                    obj = (Set)map1.get(obj);
                    if (!isNullOrEmpty(((Set) (obj1))) && !isNullOrEmpty(((Set) (obj))))
                    {
                        obj1 = new HashSet(((java.util.Collection) (obj1)));
                        ((Set) (obj1)).retainAll(((java.util.Collection) (obj)));
                        if (!((Set) (obj1)).isEmpty())
                        {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    protected static String encodeStringToBase64(String s)
    {
        String s1 = "";
        try
        {
            if (!isNullOrEmpty(s))
            {
                s1 = Base64.encodeToString(s.getBytes("UTF-8"), 8);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            if (KahunaCommon.getDebugModeEnabled())
            {
                s.printStackTrace();
            }
            return "";
        }
        return s1;
    }

    protected static String getHashForString(String s, String s1, boolean flag)
    {
        String s2;
        Object obj;
        boolean flag1;
        if (s == null || "".equals(s))
        {
            return "";
        }
        s2 = s;
        if (flag)
        {
            s2 = s.toLowerCase();
        }
        flag1 = false;
        obj = null;
        s = "SHA-1";
        if ("MD5".equals(s1))
        {
            s = "MD5";
        }
        try
        {
            s = MessageDigest.getInstance(s);
            s1 = s2.getBytes("UTF-8");
            s.update(s1, 0, s1.length);
            s = s.digest();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            flag1 = true;
            s = obj;
        }
        if (flag1)
        {
            return "";
        } else
        {
            return convertToHex(s);
        }
    }

    protected static boolean getIsValidNdbKey(String s)
    {
        if (isNullOrEmpty(s))
        {
            return false;
        } else
        {
            return getRegexMatches("^[0-9a-zA-Z\\-_]{16,128}$", s);
        }
    }

    protected static boolean getIsValidRegex(String s)
    {
        if (!isNullOrEmpty(s)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Pattern.compile(s, 2);
        return true;
        PatternSyntaxException patternsyntaxexception;
        patternsyntaxexception;
        if (KahunaCommon.mDebugEnabled)
        {
            Log.d("Kahuna", (new StringBuilder()).append("Can't process invalid key regular expression: ").append(s).toString());
            return false;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected static boolean getRegexMatches(String s, String s1)
    {
        Pattern pattern;
        if (isNullOrEmpty(s) || isNullOrEmpty(s1))
        {
            return false;
        }
        pattern = null;
        Object obj = internalPatternCacheLock;
        obj;
        JVM INSTR monitorenter ;
        if (internalPatternCache.containsKey(s))
        {
            pattern = (Pattern)internalPatternCache.get(s);
        }
        Pattern pattern1;
        pattern1 = pattern;
        if (pattern != null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        pattern1 = Pattern.compile(s, 2);
        internalPatternCache.put(s, pattern1);
        obj;
        JVM INSTR monitorexit ;
        boolean flag = pattern1.matcher(s1).matches();
        return flag;
        s;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        if (KahunaCommon.mDebugEnabled)
        {
            Log.d("Kahuna", (new StringBuilder()).append("Caught invalid regex Pattern exception: ").append(s).toString());
        }
        return false;
    }

    protected static boolean isDebuggable(Context context)
    {
        boolean flag2 = false;
        boolean flag = false;
        boolean flag1 = flag2;
        CertificateFactory certificatefactory;
        int i;
        try
        {
            context = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return flag1;
        }
        flag1 = flag2;
        certificatefactory = CertificateFactory.getInstance("X.509");
        i = 0;
_L2:
        flag2 = flag;
        flag1 = flag;
        if (i >= context.length)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        flag1 = flag;
        flag = ((X509Certificate)certificatefactory.generateCertificate(new ByteArrayInputStream(context[i].toByteArray()))).getSubjectX500Principal().getName().startsWith("CN=Android Debug,O=Android");
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        flag2 = flag;
        return flag2;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static boolean isNullOrEmpty(IKahunaUserCredentials ikahunausercredentials)
    {
        return ikahunausercredentials == null || ikahunausercredentials.isEmpty();
    }

    public static boolean isNullOrEmpty(String s)
    {
        return s == null || "".equals(s);
    }

    public static boolean isNullOrEmpty(List list)
    {
        return list == null || list.size() == 0;
    }

    public static boolean isNullOrEmpty(Map map)
    {
        return map == null || map.isEmpty();
    }

    public static boolean isNullOrEmpty(Set set)
    {
        return set == null || set.size() == 0;
    }

    public static boolean isNullOrEmpty(JSONArray jsonarray)
    {
        return jsonarray == null || jsonarray.length() == 0;
    }

    public static boolean isNullOrEmpty(JSONObject jsonobject)
    {
        return jsonobject == null || jsonobject.length() == 0;
    }

    protected static Map jsonToMap(JSONObject jsonobject)
        throws JSONException
    {
        Object obj = new HashMap();
        if (jsonobject != JSONObject.NULL)
        {
            obj = toMap(jsonobject);
        }
        return ((Map) (obj));
    }

    public static String safeObjectToString(Object obj)
    {
        if (obj == null)
        {
            return "(null)";
        } else
        {
            return obj.toString();
        }
    }

    protected static Map toMap(JSONObject jsonobject)
        throws JSONException
    {
        if (jsonobject != null) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((Map) (obj));
_L2:
        HashMap hashmap = new HashMap();
        Iterator iterator = jsonobject.keys();
        do
        {
            obj = hashmap;
            if (!iterator.hasNext())
            {
                continue;
            }
            obj = (String)iterator.next();
            String s = jsonobject.optString(((String) (obj)));
            if (s != null)
            {
                hashmap.put(obj, s);
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

}
