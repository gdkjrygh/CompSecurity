// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.net.ssl.HttpsURLConnection;
import org.apache.http.conn.ssl.StrictHostnameVerifier;

// Referenced classes of package com.adobe.mobile:
//            RemoteDownload, StaticMethods

private static class ck
    implements Runnable
{

    private final ck callback;
    private final int connectionTimeout;
    private final String directory;
    private final int readTimeout;
    private final String url;

    protected static HttpURLConnection requestConnect(String s)
    {
        s = new URL(s);
        if (!s.getProtocol().equals("https"))
        {
            break MISSING_BLOCK_LABEL_42;
        }
        s = (HttpsURLConnection)s.openConnection();
        s.setHostnameVerifier(new StrictHostnameVerifier());
        return s;
        try
        {
            s = (HttpURLConnection)s.openConnection();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            StaticMethods.logErrorFormat("Cached Files - Exception opening URL(%s)", new Object[] {
                s.getLocalizedMessage()
            });
            return null;
        }
        return s;
    }

    public void run()
    {
        if (url != null) goto _L2; else goto _L1
_L1:
        StaticMethods.logDebugFormat("Cached Files - url is null and cannot be cached", new Object[0]);
        if (callback != null)
        {
            callback.call(false, null);
        }
_L4:
        return;
_L2:
        if (RemoteDownload.stringIsUrl(url))
        {
            break; /* Loop/switch isn't completed */
        }
        StaticMethods.logDebugFormat("Cached Files - given url is not valid and cannot be cached (\"%s\")", new Object[] {
            url
        });
        if (callback != null)
        {
            callback.call(false, null);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        Object obj;
        FileOutputStream fileoutputstream1;
        Object obj2;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        Object obj14;
        HttpURLConnection httpurlconnection;
        obj = RemoteDownload.getFileForCachedURL(url, directory);
        obj2 = RemoteDownload.access$100();
        httpurlconnection = requestConnect(url);
        obj12 = null;
        obj11 = null;
        obj14 = null;
        obj10 = null;
        obj13 = null;
        obj8 = null;
        obj9 = null;
        obj7 = null;
        fileoutputstream1 = null;
        obj6 = null;
        if (httpurlconnection != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (callback != null)
        {
            callback.call(false, null);
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
        Object obj1;
        FileOutputStream fileoutputstream;
        Object obj3;
        Object obj4;
        Object obj5;
        httpurlconnection.setConnectTimeout(connectionTimeout);
        httpurlconnection.setReadTimeout(readTimeout);
        if (obj != null)
        {
            String s = StaticMethods.hexToString(RemoteDownload.access$200(((File) (obj)).getPath()));
            Long long1 = Long.valueOf(RemoteDownload.access$300(((File) (obj)).getPath()));
            if (long1.longValue() != 0L)
            {
                httpurlconnection.setRequestProperty("If-Modified-Since", ((SimpleDateFormat) (obj2)).format(long1));
            }
            if (s != null)
            {
                httpurlconnection.setRequestProperty("If-None-Match", s);
            }
        }
        obj3 = obj13;
        obj4 = obj12;
        obj2 = obj11;
        obj1 = obj14;
        fileoutputstream = fileoutputstream1;
        obj5 = obj10;
        httpurlconnection.connect();
        obj3 = obj13;
        obj4 = obj12;
        obj2 = obj11;
        obj1 = obj14;
        fileoutputstream = fileoutputstream1;
        obj5 = obj10;
        if (httpurlconnection.getResponseCode() != 304)
        {
            break MISSING_BLOCK_LABEL_446;
        }
        obj3 = obj13;
        obj4 = obj12;
        obj2 = obj11;
        obj1 = obj14;
        fileoutputstream = fileoutputstream1;
        obj5 = obj10;
        StaticMethods.logDebugFormat("Cached Files - File has not been modified since last download. (%s)", new Object[] {
            url
        });
        obj3 = obj13;
        obj4 = obj12;
        obj2 = obj11;
        obj1 = obj14;
        fileoutputstream = fileoutputstream1;
        obj5 = obj10;
        if (callback == null)
        {
            break MISSING_BLOCK_LABEL_398;
        }
        obj3 = obj13;
        obj4 = obj12;
        obj2 = obj11;
        obj1 = obj14;
        fileoutputstream = fileoutputstream1;
        obj5 = obj10;
        callback.call(false, ((File) (obj)));
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                StaticMethods.logWarningFormat("Cached Files - Exception while attempting to close streams (%s)", new Object[] {
                    ((IOException) (obj)).getLocalizedMessage()
                });
            }
            break MISSING_BLOCK_LABEL_445;
        }
        if (true)
        {
            break MISSING_BLOCK_LABEL_422;
        }
        throw new NullPointerException();
        httpurlconnection.disconnect();
        return;
        return;
        obj3 = obj13;
        obj4 = obj12;
        obj2 = obj11;
        obj1 = obj14;
        fileoutputstream = fileoutputstream1;
        obj5 = obj10;
        if (httpurlconnection.getResponseCode() != 404)
        {
            break MISSING_BLOCK_LABEL_627;
        }
        obj3 = obj13;
        obj4 = obj12;
        obj2 = obj11;
        obj1 = obj14;
        fileoutputstream = fileoutputstream1;
        obj5 = obj10;
        StaticMethods.logDebugFormat("Cached Files - File not found. (%s)", new Object[] {
            url
        });
        obj3 = obj13;
        obj4 = obj12;
        obj2 = obj11;
        obj1 = obj14;
        fileoutputstream = fileoutputstream1;
        obj5 = obj10;
        if (callback == null)
        {
            break MISSING_BLOCK_LABEL_579;
        }
        obj3 = obj13;
        obj4 = obj12;
        obj2 = obj11;
        obj1 = obj14;
        fileoutputstream = fileoutputstream1;
        obj5 = obj10;
        callback.call(false, ((File) (obj)));
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                StaticMethods.logWarningFormat("Cached Files - Exception while attempting to close streams (%s)", new Object[] {
                    ((IOException) (obj)).getLocalizedMessage()
                });
            }
            break MISSING_BLOCK_LABEL_626;
        }
        if (true)
        {
            break MISSING_BLOCK_LABEL_603;
        }
        throw new NullPointerException();
        httpurlconnection.disconnect();
        return;
        return;
        obj3 = obj13;
        obj4 = obj12;
        obj2 = obj11;
        obj1 = obj14;
        fileoutputstream = fileoutputstream1;
        obj5 = obj10;
        if (httpurlconnection.getResponseCode() == 200)
        {
            break MISSING_BLOCK_LABEL_827;
        }
        obj3 = obj13;
        obj4 = obj12;
        obj2 = obj11;
        obj1 = obj14;
        fileoutputstream = fileoutputstream1;
        obj5 = obj10;
        StaticMethods.logWarningFormat("Cached Files - File could not be downloaded from URL (%s) Response: (%d) Message: (%s)", new Object[] {
            url, Integer.valueOf(httpurlconnection.getResponseCode()), httpurlconnection.getResponseMessage()
        });
        obj3 = obj13;
        obj4 = obj12;
        obj2 = obj11;
        obj1 = obj14;
        fileoutputstream = fileoutputstream1;
        obj5 = obj10;
        if (callback == null)
        {
            break MISSING_BLOCK_LABEL_779;
        }
        obj3 = obj13;
        obj4 = obj12;
        obj2 = obj11;
        obj1 = obj14;
        fileoutputstream = fileoutputstream1;
        obj5 = obj10;
        callback.call(false, ((File) (obj)));
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                StaticMethods.logWarningFormat("Cached Files - Exception while attempting to close streams (%s)", new Object[] {
                    ((IOException) (obj)).getLocalizedMessage()
                });
            }
            break MISSING_BLOCK_LABEL_826;
        }
        if (true)
        {
            break MISSING_BLOCK_LABEL_803;
        }
        throw new NullPointerException();
        httpurlconnection.disconnect();
        return;
        return;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_865;
        }
        obj3 = obj13;
        obj4 = obj12;
        obj2 = obj11;
        obj1 = obj14;
        fileoutputstream = fileoutputstream1;
        obj5 = obj10;
        RemoteDownload.access$400(url, directory);
        obj3 = obj13;
        obj4 = obj12;
        obj2 = obj11;
        obj1 = obj14;
        fileoutputstream = fileoutputstream1;
        obj5 = obj10;
        Date date = new Date(httpurlconnection.getLastModified());
        obj3 = obj13;
        obj4 = obj12;
        obj2 = obj11;
        obj1 = obj14;
        fileoutputstream = fileoutputstream1;
        obj5 = obj10;
        Object obj15 = httpurlconnection.getHeaderField("ETag");
        obj = obj15;
        if (obj15 == null)
        {
            break MISSING_BLOCK_LABEL_968;
        }
        obj3 = obj13;
        obj4 = obj12;
        obj2 = obj11;
        obj1 = obj14;
        fileoutputstream = fileoutputstream1;
        obj5 = obj10;
        obj = StaticMethods.getHexString(((String) (obj15)));
        obj3 = obj13;
        obj4 = obj12;
        obj2 = obj11;
        obj1 = obj14;
        fileoutputstream = fileoutputstream1;
        obj5 = obj10;
        obj15 = RemoteDownload.access$500(url, date, ((String) (obj)), directory);
        if (obj15 != null)
        {
            break MISSING_BLOCK_LABEL_1121;
        }
        obj3 = obj13;
        obj4 = obj12;
        obj2 = obj11;
        obj1 = obj14;
        fileoutputstream = fileoutputstream1;
        obj5 = obj10;
        if (callback == null)
        {
            break MISSING_BLOCK_LABEL_1073;
        }
        obj3 = obj13;
        obj4 = obj12;
        obj2 = obj11;
        obj1 = obj14;
        fileoutputstream = fileoutputstream1;
        obj5 = obj10;
        callback.call(false, null);
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            catch (IOException ioexception)
            {
                StaticMethods.logWarningFormat("Cached Files - Exception while attempting to close streams (%s)", new Object[] {
                    ioexception.getLocalizedMessage()
                });
            }
            break MISSING_BLOCK_LABEL_1120;
        }
        if (true)
        {
            break MISSING_BLOCK_LABEL_1097;
        }
        throw new NullPointerException();
        httpurlconnection.disconnect();
        return;
        return;
        obj3 = obj13;
        obj4 = obj12;
        obj2 = obj11;
        obj1 = obj14;
        fileoutputstream = fileoutputstream1;
        obj5 = obj10;
        ioexception = httpurlconnection.getInputStream();
        obj3 = ioexception;
        obj4 = ioexception;
        obj2 = ioexception;
        obj1 = ioexception;
        fileoutputstream = fileoutputstream1;
        obj5 = ioexception;
        fileoutputstream1 = new FileOutputStream(((File) (obj15)));
        obj1 = new byte[4096];
_L8:
        int i = ioexception.read(((byte []) (obj1)));
        if (i == -1) goto _L7; else goto _L6
_L6:
        fileoutputstream1.write(((byte []) (obj1)), 0, i);
          goto _L8
        obj1;
_L20:
        obj1 = ioexception;
        fileoutputstream = fileoutputstream1;
        StaticMethods.logWarningFormat("Cached Files - Timed out making request (%s)", new Object[] {
            url
        });
        obj1 = ioexception;
        fileoutputstream = fileoutputstream1;
        if (callback == null)
        {
            break MISSING_BLOCK_LABEL_1258;
        }
        obj1 = ioexception;
        fileoutputstream = fileoutputstream1;
        callback.call(false, null);
        if (fileoutputstream1 != null)
        {
            try
            {
                fileoutputstream1.close();
            }
            // Misplaced declaration of an exception variable
            catch (IOException ioexception)
            {
                StaticMethods.logWarningFormat("Cached Files - Exception while attempting to close streams (%s)", new Object[] {
                    ioexception.getLocalizedMessage()
                });
                return;
            }
        }
        if (ioexception == null)
        {
            break MISSING_BLOCK_LABEL_1276;
        }
        ioexception.close();
        httpurlconnection.disconnect();
        return;
_L7:
        StaticMethods.logDebugFormat("Cached Files - Caching successful (%s)", new Object[] {
            url
        });
        if (callback != null)
        {
            callback.call(true, ((File) (obj15)));
        }
        if (fileoutputstream1 != null)
        {
            try
            {
                fileoutputstream1.close();
            }
            // Misplaced declaration of an exception variable
            catch (IOException ioexception)
            {
                StaticMethods.logWarningFormat("Cached Files - Exception while attempting to close streams (%s)", new Object[] {
                    ioexception.getLocalizedMessage()
                });
                return;
            }
        }
        if (ioexception == null)
        {
            break MISSING_BLOCK_LABEL_1353;
        }
        ioexception.close();
        httpurlconnection.disconnect();
        return;
        obj2;
        fileoutputstream1 = obj8;
        ioexception = ((IOException) (obj3));
_L18:
        obj1 = ioexception;
        fileoutputstream = fileoutputstream1;
        StaticMethods.logWarningFormat("Cached Files - IOException while making request (%s)", new Object[] {
            ((IOException) (obj2)).getLocalizedMessage()
        });
        obj1 = ioexception;
        fileoutputstream = fileoutputstream1;
        if (callback == null)
        {
            break MISSING_BLOCK_LABEL_1436;
        }
        obj1 = ioexception;
        fileoutputstream = fileoutputstream1;
        callback.call(false, null);
        if (fileoutputstream1 != null)
        {
            try
            {
                fileoutputstream1.close();
            }
            // Misplaced declaration of an exception variable
            catch (IOException ioexception)
            {
                StaticMethods.logWarningFormat("Cached Files - Exception while attempting to close streams (%s)", new Object[] {
                    ioexception.getLocalizedMessage()
                });
                return;
            }
        }
        if (ioexception == null)
        {
            break MISSING_BLOCK_LABEL_1454;
        }
        ioexception.close();
        httpurlconnection.disconnect();
        return;
        obj2;
        fileoutputstream1 = obj9;
        ioexception = ((IOException) (obj4));
_L16:
        obj1 = ioexception;
        fileoutputstream = fileoutputstream1;
        StaticMethods.logWarningFormat("Cached Files - Unexpected exception while attempting to get remote file (%s)", new Object[] {
            ((Exception) (obj2)).getLocalizedMessage()
        });
        obj1 = ioexception;
        fileoutputstream = fileoutputstream1;
        if (callback == null)
        {
            break MISSING_BLOCK_LABEL_1537;
        }
        obj1 = ioexception;
        fileoutputstream = fileoutputstream1;
        callback.call(false, null);
        if (fileoutputstream1 != null)
        {
            try
            {
                fileoutputstream1.close();
            }
            // Misplaced declaration of an exception variable
            catch (IOException ioexception)
            {
                StaticMethods.logWarningFormat("Cached Files - Exception while attempting to close streams (%s)", new Object[] {
                    ioexception.getLocalizedMessage()
                });
                return;
            }
        }
        if (ioexception == null)
        {
            break MISSING_BLOCK_LABEL_1555;
        }
        ioexception.close();
        httpurlconnection.disconnect();
        return;
        obj1;
        fileoutputstream1 = obj7;
        ioexception = ((IOException) (obj2));
        obj2 = obj1;
_L14:
        obj1 = ioexception;
        fileoutputstream = fileoutputstream1;
        StaticMethods.logWarningFormat("Cached Files - Unexpected error while attempting to get remote file (%s)", new Object[] {
            ((Error) (obj2)).getLocalizedMessage()
        });
        obj1 = ioexception;
        fileoutputstream = fileoutputstream1;
        if (callback == null)
        {
            break MISSING_BLOCK_LABEL_1641;
        }
        obj1 = ioexception;
        fileoutputstream = fileoutputstream1;
        callback.call(false, null);
        if (fileoutputstream1 != null)
        {
            try
            {
                fileoutputstream1.close();
            }
            // Misplaced declaration of an exception variable
            catch (IOException ioexception)
            {
                StaticMethods.logWarningFormat("Cached Files - Exception while attempting to close streams (%s)", new Object[] {
                    ioexception.getLocalizedMessage()
                });
                return;
            }
        }
        if (ioexception == null)
        {
            break MISSING_BLOCK_LABEL_1659;
        }
        ioexception.close();
        httpurlconnection.disconnect();
        return;
        ioexception;
_L12:
        if (fileoutputstream == null)
        {
            break MISSING_BLOCK_LABEL_1692;
        }
        fileoutputstream.close();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_1700;
        }
        ((InputStream) (obj1)).close();
        httpurlconnection.disconnect();
_L10:
        throw ioexception;
        obj1;
        StaticMethods.logWarningFormat("Cached Files - Exception while attempting to close streams (%s)", new Object[] {
            ((IOException) (obj1)).getLocalizedMessage()
        });
        if (true) goto _L10; else goto _L9
_L9:
        obj2;
        fileoutputstream = fileoutputstream1;
        obj1 = ioexception;
        ioexception = ((IOException) (obj2));
        if (true) goto _L12; else goto _L11
_L11:
        obj2;
        if (true) goto _L14; else goto _L13
_L13:
        obj2;
        if (true) goto _L16; else goto _L15
_L15:
        obj2;
        if (true) goto _L18; else goto _L17
_L17:
        SocketTimeoutException sockettimeoutexception;
        sockettimeoutexception;
        sockettimeoutexception = ((SocketTimeoutException) (obj5));
        fileoutputstream1 = obj6;
        if (true) goto _L20; else goto _L19
_L19:
    }

    private ck(String s, ck ck, int i, int j, String s1)
    {
        url = s;
        callback = ck;
        connectionTimeout = i;
        readTimeout = j;
        directory = s1;
    }

    ck(String s, ck ck, int i, int j, String s1, ck ck1)
    {
        this(s, ck, i, j, s1);
    }
}
