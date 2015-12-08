// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import org.apache.http.conn.ssl.StrictHostnameVerifier;

// Referenced classes of package com.adobe.mobile:
//            StaticMethods, WearableFunctionBridge

final class RequestHandler
{

    private static final int BUF_SIZE = 1024;
    private static final int CONNECTION_TIMEOUT = 2000;
    private static final Object _hostnameVerifierMutex = new Object();
    private static StrictHostnameVerifier _strictHostnameVerifier = null;

    RequestHandler()
    {
    }

    private static HttpURLConnection requestConnect(String s)
    {
        obj = new URL(s);
        if (!((URL) (obj)).getProtocol().equals("https"))
        {
            break MISSING_BLOCK_LABEL_86;
        }
        synchronized (_hostnameVerifierMutex)
        {
            if (_strictHostnameVerifier == null)
            {
                _strictHostnameVerifier = new StrictHostnameVerifier();
            }
        }
        s = (HttpsURLConnection)((URL) (obj)).openConnection();
        s.setHostnameVerifier(_strictHostnameVerifier);
        return s;
        obj;
        s;
        JVM INSTR monitorexit ;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            StaticMethods.logErrorFormat("Adobe Mobile - Exception opening URL(%s)", new Object[] {
                s.getLocalizedMessage()
            });
        }
        return null;
        s = (HttpURLConnection)((URL) (obj)).openConnection();
        return s;
    }

    protected static byte[] retrieveData(String s, Map map, int i, String s1)
    {
        if (!StaticMethods.isWearableApp()) goto _L2; else goto _L1
_L1:
        s = WearableFunctionBridge.retrieveData(s, map, i, s1);
_L6:
        return s;
_L2:
        byte abyte0[];
        String s2;
        Map map1;
        String s3;
        Map map2;
        String s4;
        Map map3;
        String s5;
        byte abyte1[];
        ByteArrayOutputStream bytearrayoutputstream;
        Object obj;
        Object obj1;
        s4 = null;
        s5 = null;
        s2 = null;
        s3 = null;
        bytearrayoutputstream = null;
        abyte1 = null;
        obj1 = null;
        obj = null;
        map1 = obj;
        map2 = bytearrayoutputstream;
        map3 = abyte1;
        abyte0 = obj1;
        s = requestConnect(s);
        s3 = s;
        map1 = obj;
        s4 = s;
        map2 = bytearrayoutputstream;
        s5 = s;
        map3 = abyte1;
        s2 = s;
        abyte0 = obj1;
        s.setConnectTimeout(2000);
        s3 = s;
        map1 = obj;
        s4 = s;
        map2 = bytearrayoutputstream;
        s5 = s;
        map3 = abyte1;
        s2 = s;
        abyte0 = obj1;
        s.setReadTimeout(i);
        if (map == null)
        {
            break; /* Loop/switch isn't completed */
        }
        s3 = s;
        map1 = obj;
        s4 = s;
        map2 = bytearrayoutputstream;
        s5 = s;
        map3 = abyte1;
        s2 = s;
        abyte0 = obj1;
        map = map.entrySet().iterator();
_L4:
        s3 = s;
        map1 = obj;
        s4 = s;
        map2 = bytearrayoutputstream;
        s5 = s;
        map3 = abyte1;
        s2 = s;
        abyte0 = obj1;
        if (!map.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s3 = s;
        map1 = obj;
        s4 = s;
        map2 = bytearrayoutputstream;
        s5 = s;
        map3 = abyte1;
        s2 = s;
        abyte0 = obj1;
        java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
        s3 = s;
        map1 = obj;
        s4 = s;
        map2 = bytearrayoutputstream;
        s5 = s;
        map3 = abyte1;
        s2 = s;
        abyte0 = obj1;
        s.setRequestProperty((String)entry.getKey(), (String)entry.getValue());
        if (true) goto _L4; else goto _L3
_L3:
        break; /* Loop/switch isn't completed */
        s;
        s2 = s3;
        abyte0 = map1;
        StaticMethods.logWarningFormat("%s - IOException while sending request (%s)", new Object[] {
            s1, s.getLocalizedMessage()
        });
        s = null;
        if (s3 != null)
        {
            s3.disconnect();
        }
        if (map1 != null)
        {
            try
            {
                map1.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                StaticMethods.logWarningFormat("%s - Unable to close stream (%s)", new Object[] {
                    s1, s.getLocalizedMessage()
                });
                return null;
            }
            return null;
        }
        if (true) goto _L6; else goto _L5
_L5:
        s3 = s;
        map1 = obj;
        s4 = s;
        map2 = bytearrayoutputstream;
        s5 = s;
        map3 = abyte1;
        s2 = s;
        abyte0 = obj1;
        if (s.getResponseCode() != 200)
        {
            break; /* Loop/switch isn't completed */
        }
        s3 = s;
        map1 = obj;
        s4 = s;
        map2 = bytearrayoutputstream;
        s5 = s;
        map3 = abyte1;
        s2 = s;
        abyte0 = obj1;
        map = s.getInputStream();
        s3 = s;
        map1 = map;
        s4 = s;
        map2 = map;
        s5 = s;
        map3 = map;
        s2 = s;
        abyte0 = map;
        abyte1 = new byte[1024];
        s3 = s;
        map1 = map;
        s4 = s;
        map2 = map;
        s5 = s;
        map3 = map;
        s2 = s;
        abyte0 = map;
        bytearrayoutputstream = new ByteArrayOutputStream();
_L7:
        s3 = s;
        map1 = map;
        s4 = s;
        map2 = map;
        s5 = s;
        map3 = map;
        s2 = s;
        abyte0 = map;
        if (map.read(abyte1) == -1)
        {
            break MISSING_BLOCK_LABEL_659;
        }
        s3 = s;
        map1 = map;
        s4 = s;
        map2 = map;
        s5 = s;
        map3 = map;
        s2 = s;
        abyte0 = map;
        bytearrayoutputstream.write(abyte1);
          goto _L7
        s;
        s2 = s4;
        abyte0 = map2;
        StaticMethods.logWarningFormat("%s - Exception while sending request (%s)", new Object[] {
            s1, s.getLocalizedMessage()
        });
        s = null;
        if (s4 != null)
        {
            s4.disconnect();
        }
        if (map2 != null)
        {
            try
            {
                map2.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                StaticMethods.logWarningFormat("%s - Unable to close stream (%s)", new Object[] {
                    s1, s.getLocalizedMessage()
                });
                return null;
            }
            return null;
        }
        continue; /* Loop/switch isn't completed */
        s3 = s;
        map1 = map;
        s4 = s;
        map2 = map;
        s5 = s;
        map3 = map;
        s2 = s;
        abyte0 = map;
        map.close();
        s3 = s;
        map1 = map;
        s4 = s;
        map2 = map;
        s5 = s;
        map3 = map;
        s2 = s;
        abyte0 = map;
        abyte1 = bytearrayoutputstream.toByteArray();
        abyte0 = abyte1;
        if (s != null)
        {
            s.disconnect();
        }
        s = abyte0;
        if (map != null)
        {
            try
            {
                map.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                StaticMethods.logWarningFormat("%s - Unable to close stream (%s)", new Object[] {
                    s1, s.getLocalizedMessage()
                });
                return abyte0;
            }
            return abyte0;
        }
        if (true) goto _L6; else goto _L8
_L8:
        if (s != null)
        {
            s.disconnect();
        }
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                StaticMethods.logWarningFormat("%s - Unable to close stream (%s)", new Object[] {
                    s1, s.getLocalizedMessage()
                });
            }
        }
        return null;
        s;
        s2 = s5;
        abyte0 = map3;
        StaticMethods.logWarningFormat("%s - Unexpected error while sending request (%s)", new Object[] {
            s1, s.getLocalizedMessage()
        });
        s = null;
        if (s5 != null)
        {
            s5.disconnect();
        }
        if (map3 == null) goto _L6; else goto _L9
_L9:
        try
        {
            map3.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            StaticMethods.logWarningFormat("%s - Unable to close stream (%s)", new Object[] {
                s1, s.getLocalizedMessage()
            });
            return null;
        }
        return null;
        s;
        if (s2 != null)
        {
            s2.disconnect();
        }
        if (abyte0 != null)
        {
            try
            {
                abyte0.close();
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                StaticMethods.logWarningFormat("%s - Unable to close stream (%s)", new Object[] {
                    s1, map.getLocalizedMessage()
                });
            }
        }
        throw s;
    }

    protected static boolean sendAnalyticsRequest(String s, String s1, Map map, int i)
    {
        if (s == null)
        {
            return false;
        }
        if (StaticMethods.isWearableApp())
        {
            return WearableFunctionBridge.sendAnalyticsRequest(s, s1, map, i);
        }
        s = requestConnect(s);
        if (s == null)
        {
            return false;
        }
        byte abyte0[];
        s.setConnectTimeout(i);
        s.setReadTimeout(i);
        s.setRequestMethod("POST");
        abyte0 = s1.getBytes("UTF-8");
        s.setFixedLengthStreamingMode(abyte0.length);
        s.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); s.setRequestProperty((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

        try
        {
            map = new BufferedOutputStream(s.getOutputStream());
            map.write(abyte0);
            map.close();
            s = s.getInputStream();
            for (map = new byte[10]; s.read(map) > 0;) { }
            s.close();
            StaticMethods.logDebugFormat("Analytics - Request Sent(%s)", new Object[] {
                s1
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            StaticMethods.logDebugFormat("Analytics - Timed out sending request(%s)", new Object[] {
                s1
            });
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            StaticMethods.logDebugFormat("Analytics - IOException while sending request, may retry(%s)", new Object[] {
                s.getLocalizedMessage()
            });
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            StaticMethods.logErrorFormat("Analytics - Exception while attempting to send hit, will not retry(%s)", new Object[] {
                s.getLocalizedMessage()
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            StaticMethods.logErrorFormat("Analytics - Exception while attempting to send hit, will not retry(%s)", new Object[] {
                s.getLocalizedMessage()
            });
        }
        return true;
    }

    protected static void sendGenericRequest(String s, Map map, int i, String s1)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (StaticMethods.isWearableApp())
        {
            WearableFunctionBridge.sendGenericRequest(s, map, i, s1);
            return;
        }
        HttpURLConnection httpurlconnection = requestConnect(s);
        if (httpurlconnection == null) goto _L1; else goto _L3
_L3:
        httpurlconnection.setConnectTimeout(i);
        httpurlconnection.setReadTimeout(i);
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        map = map.entrySet().iterator();
        do
        {
            if (!map.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            String s2 = (String)entry.getValue();
            if (s2.trim().length() > 0)
            {
                httpurlconnection.setRequestProperty((String)entry.getKey(), s2);
            }
        } while (true);
        try
        {
            StaticMethods.logDebugFormat("%s - Request Sent(%s)", new Object[] {
                s1, s
            });
            httpurlconnection.getResponseCode();
            httpurlconnection.getInputStream().close();
            httpurlconnection.disconnect();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            StaticMethods.logWarningFormat("%s - Timed out sending request(%s)", new Object[] {
                s1, s
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            StaticMethods.logWarningFormat("%s - IOException while sending request, may retry(%s)", new Object[] {
                s1, s.getLocalizedMessage()
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            StaticMethods.logWarningFormat("%s - Exception while attempting to send hit, will not retry(%s)", new Object[] {
                s1, s.getLocalizedMessage()
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            StaticMethods.logWarningFormat("%s - Exception while attempting to send hit, will not retry(%s)", new Object[] {
                s1, s.getLocalizedMessage()
            });
        }
        return;
    }

}
