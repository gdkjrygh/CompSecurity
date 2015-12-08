// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import javax.net.ssl.HttpsURLConnection;
import org.apache.http.conn.ssl.StrictHostnameVerifier;

// Referenced classes of package com.adobe.mobile:
//            StaticMethods

class RemoteDownload
{
    private static class DownloadFileTask
        implements Runnable
    {

        private final RemoteDownloadBlock callback;
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
            obj2 = RemoteDownload.createRFC2822Formatter();
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
                String s = StaticMethods.hexToString(RemoteDownload.getEtagOfFile(((File) (obj)).getPath()));
                Long long1 = Long.valueOf(RemoteDownload.getLastModifiedOfFile(((File) (obj)).getPath()));
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
            RemoteDownload.deleteCachedDataForURL(url, directory);
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
            obj15 = RemoteDownload.getNewCachedFile(url, date, ((String) (obj)), directory);
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

        private DownloadFileTask(String s, RemoteDownloadBlock remotedownloadblock, int i, int j, String s1)
        {
            url = s;
            callback = remotedownloadblock;
            connectionTimeout = i;
            readTimeout = j;
            directory = s1;
        }

    }

    protected static interface RemoteDownloadBlock
    {

        public abstract void call(boolean flag, File file);
    }


    private static final String DEFAULT_CACHE_DIR = "adbdownloadcache";
    private static final int DEFAULT_CONNECTION_TIMEOUT = 10000;
    private static final int DEFAULT_READ_TIMEOUT = 10000;

    RemoteDownload()
    {
    }

    private static SimpleDateFormat createRFC2822Formatter()
    {
        SimpleDateFormat simpledateformat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss Z", Locale.US);
        simpledateformat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpledateformat;
    }

    private static boolean deleteCachedDataForURL(String s, String s1)
    {
        boolean flag = true;
        if (s == null || s.length() < 1)
        {
            StaticMethods.logWarningFormat("Cached File - tried to delete cached file, but file path was empty", new Object[0]);
            flag = false;
        } else
        {
            s = getFileForCachedURL(s, s1);
            if (s == null || !s.delete())
            {
                return false;
            }
        }
        return flag;
    }

    protected static void deleteFilesForDirectoryNotInList(String s, List list)
    {
        if (list != null && list.size() > 0) goto _L2; else goto _L1
_L1:
        deleteFilesInDirectory(s);
_L4:
        return;
_L2:
        s = getDownloadCacheDirectory(s);
        if (s != null)
        {
            s = s.listFiles();
            if (s != null && s.length > 0)
            {
                ArrayList arraylist = new ArrayList();
                for (list = list.iterator(); list.hasNext(); arraylist.add(md5hash((String)list.next()))) { }
                int j = s.length;
                int i = 0;
                while (i < j) 
                {
                    list = s[i];
                    String s1 = list.getName();
                    if (!arraylist.contains(s1.substring(0, s1.indexOf("."))))
                    {
                        if (list.delete())
                        {
                            StaticMethods.logDebugFormat("Cached File - Removed unused cache file", new Object[0]);
                        } else
                        {
                            StaticMethods.logWarningFormat("Cached File - Failed to remove unused cache file", new Object[0]);
                        }
                    }
                    i++;
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected static void deleteFilesInDirectory(String s)
    {
        s = getDownloadCacheDirectory(s);
        if (s != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if ((s = s.listFiles()) != null && s.length > 0)
        {
            int j = s.length;
            int i = 0;
            while (i < j) 
            {
                if (s[i].delete())
                {
                    StaticMethods.logDebugFormat("Cached File - Removed unused cache file", new Object[0]);
                } else
                {
                    StaticMethods.logWarningFormat("Cached File - Failed to remove unused cache file", new Object[0]);
                }
                i++;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private static File getDownloadCacheDirectory(String s)
    {
        File file = new File(StaticMethods.getCacheDirectory(), s);
        s = file;
        if (!file.exists())
        {
            s = file;
            if (!file.mkdir())
            {
                StaticMethods.logWarningFormat("Cached File - unable to open/make download cache directory", new Object[0]);
                s = null;
            }
        }
        return s;
    }

    private static String getEtagOfFile(String s)
    {
        if (s == null || s.length() < 1)
        {
            StaticMethods.logWarningFormat("Cached File - Path was null or empty for Cache File", new Object[0]);
            return null;
        }
        s = splitPathExtension(getPathExtension(s));
        if (s == null || s.length < 2)
        {
            StaticMethods.logWarningFormat("Cached File - No etag for file. Extension had no second value after split.", new Object[0]);
            return null;
        } else
        {
            return s[1];
        }
    }

    protected static File getFileForCachedURL(String s)
    {
        return getFileForCachedURL(s, "adbdownloadcache");
    }

    protected static File getFileForCachedURL(String s, String s1)
    {
        if (s != null && s.length() >= 1)
        {
            if ((s1 = getDownloadCacheDirectory(s1)) != null)
            {
                String as[] = s1.list();
                if (as == null || as.length < 1)
                {
                    StaticMethods.logDebugFormat("Cached Files - Directory is empty (%s).", new Object[] {
                        s1.getAbsolutePath()
                    });
                    return null;
                }
                String s2 = md5hash(s);
                int j = as.length;
                for (int i = 0; i < j; i++)
                {
                    String s3 = as[i];
                    if (s3.substring(0, s3.lastIndexOf('.')).equals(s2))
                    {
                        return new File(s1, s3);
                    }
                }

                StaticMethods.logDebugFormat("Cached Files - This file has not previously been cached (%s).", new Object[] {
                    s
                });
                return null;
            }
        }
        return null;
    }

    private static long getLastModifiedOfFile(String s)
    {
        if (s == null || s.length() < 1)
        {
            StaticMethods.logWarningFormat("Cached File - Path was null or empty for Cache File. Could not get Last Modified Date.", new Object[0]);
            return 0L;
        }
        s = splitPathExtension(getPathExtension(s));
        if (s == null || s.length < 1)
        {
            StaticMethods.logWarningFormat("Cached File - No last modified date for file. Extension had no values after split.", new Object[0]);
            return 0L;
        } else
        {
            return Long.parseLong(s[0]);
        }
    }

    private static File getNewCachedFile(String s, Date date, String s1, String s2)
    {
        if (s == null || s.length() < 1)
        {
            StaticMethods.logWarningFormat("Cached File - Invalid url parameter while attempting to create cache file. Could not save data.", new Object[0]);
        } else
        {
            if (date == null)
            {
                StaticMethods.logWarningFormat("Cached File - Invalid lastModified parameter while attempting to create cache file. Could not save data.", new Object[0]);
                return null;
            }
            if (s1 == null || s1.length() < 1)
            {
                StaticMethods.logWarningFormat("Cached File - Invalid etag parameter while attempting to create cache file. Could not save data.", new Object[0]);
                return null;
            }
            s2 = getDownloadCacheDirectory(s2);
            if (s2 != null)
            {
                String s3 = md5hash(s);
                if (s3 != null && s3.length() >= 1)
                {
                    return new File((new StringBuilder()).append(s2.getPath()).append(File.separator).append(md5hash(s)).append(".").append(date.getTime()).append("_").append(s1).toString());
                }
            }
        }
        return null;
    }

    private static String getPathExtension(String s)
    {
        if (s == null || s.length() < 1)
        {
            StaticMethods.logWarningFormat("Cached File - Path was null or empty for Cache File", new Object[0]);
            return null;
        } else
        {
            return s.substring(s.lastIndexOf(".") + 1);
        }
    }

    private static String md5hash(String s)
    {
        if (s == null || s.length() < 1)
        {
            return null;
        }
        byte abyte0[];
        StringBuilder stringbuilder;
        int i;
        int j;
        try
        {
            MessageDigest messagedigest = MessageDigest.getInstance("MD5");
            messagedigest.update(s.getBytes("UTF-8"));
            abyte0 = messagedigest.digest();
            stringbuilder = new StringBuilder();
            j = abyte0.length;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            StaticMethods.logErrorFormat("Cached Files - unable to get md5 hash (%s)", new Object[] {
                s.getMessage()
            });
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            StaticMethods.logErrorFormat("Cached Files - Unsupported Encoding: UTF-8 (%s)", new Object[] {
                s.getMessage()
            });
            return null;
        }
        i = 0;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        for (s = Integer.toHexString(abyte0[i] & 0xff); s.length() < 2; s = (new StringBuilder()).append("0").append(s).toString()) { }
        stringbuilder.append(s);
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_51;
_L1:
        s = stringbuilder.toString();
        return s;
    }

    protected static void remoteDownloadAsync(String s, int i, int j, RemoteDownloadBlock remotedownloadblock)
    {
        remoteDownloadAsync(s, i, j, remotedownloadblock, "adbdownloadcache");
    }

    protected static void remoteDownloadAsync(String s, int i, int j, RemoteDownloadBlock remotedownloadblock, String s1)
    {
        (new Thread(new DownloadFileTask(s, remotedownloadblock, i, j, s1))).start();
    }

    protected static void remoteDownloadAsync(String s, RemoteDownloadBlock remotedownloadblock)
    {
        remoteDownloadAsync(s, 10000, 10000, remotedownloadblock, "adbdownloadcache");
    }

    protected static void remoteDownloadAsync(String s, String s1, RemoteDownloadBlock remotedownloadblock)
    {
        remoteDownloadAsync(s, 10000, 10000, remotedownloadblock, s1);
    }

    protected static void remoteDownloadSync(String s, int i, int j, RemoteDownloadBlock remotedownloadblock)
    {
        remoteDownloadSync(s, i, j, remotedownloadblock, "adbdownloadcache");
    }

    protected static void remoteDownloadSync(String s, int i, int j, RemoteDownloadBlock remotedownloadblock, String s1)
    {
        (new DownloadFileTask(s, remotedownloadblock, i, j, s1)).run();
    }

    protected static void remoteDownloadSync(String s, RemoteDownloadBlock remotedownloadblock)
    {
        remoteDownloadSync(s, 10000, 10000, remotedownloadblock, "adbdownloadcache");
    }

    protected static void remoteDownloadSync(String s, String s1, RemoteDownloadBlock remotedownloadblock)
    {
        remoteDownloadSync(s, 10000, 10000, remotedownloadblock, s1);
    }

    private static String[] splitPathExtension(String s)
    {
        String as[];
        if (s == null || s.length() < 1)
        {
            StaticMethods.logWarningFormat("Cached File - Extension was null or empty on Cache File", new Object[0]);
            as = null;
        } else
        {
            String as1[] = s.split("_");
            as = as1;
            if (as1.length != 2)
            {
                StaticMethods.logWarningFormat("Cached File - Invalid Extension on Cache File (%s)", new Object[] {
                    s
                });
                return null;
            }
        }
        return as;
    }

    protected static boolean stringIsUrl(String s)
    {
        if (s == null || s.length() <= 0)
        {
            return false;
        }
        try
        {
            new URL(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return true;
    }





}
