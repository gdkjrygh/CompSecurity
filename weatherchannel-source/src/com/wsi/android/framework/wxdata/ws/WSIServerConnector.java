// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.framework.wxdata.ws;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.wsi.android.framework.settings.helpers.ConfigInfo;
import com.wsi.android.framework.wxdata.exceptions.BitmapCorruptedException;
import com.wsi.android.framework.wxdata.exceptions.ConnectionException;
import com.wsi.android.framework.wxdata.exceptions.WrongResourceTypeException;
import com.wsi.android.framework.wxdata.exceptions.XmlParseException;
import com.wsi.android.framework.wxdata.utils.MapDataSettings;
import com.wsi.android.framework.wxdata.utils.ServiceUtils;
import com.wsi.android.weather.utils.settings.Tessera;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.ContentHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

// Referenced classes of package com.wsi.android.framework.wxdata.ws:
//            NetworkConnectionType

public class WSIServerConnector
{

    protected static final WSIServerConnector instance = new WSIServerConnector();
    protected final String TAG = getClass().getSimpleName();
    private long lastTimeTokenReceived;
    private Date tessera30LastTimeDataUpdated;
    private String token;

    public WSIServerConnector()
    {
    }

    public static WSIServerConnector getConnector()
    {
        return instance;
    }

    private String getTokenFromServer(MapDataSettings mapdatasettings)
        throws ConnectionException
    {
        int i;
        resetToken();
        i = 0;
_L9:
        String s;
        s = getTokenStringUrlRequest(mapdatasettings);
        if (ConfigInfo.DEBUG)
        {
            Log.d(TAG, (new StringBuilder()).append("getTokenFromServer: url = ").append(s).toString());
        }
        s = loadResourceAsString(s, "UTF-8");
        if (s == null) goto _L2; else goto _L1
_L1:
        if ("".equals(s)) goto _L2; else goto _L3
_L3:
        lastTimeTokenReceived = ServiceUtils.getCurrentTimeMs();
        token = s;
        if (ConfigInfo.DEBUG)
        {
            Log.d(TAG, (new StringBuilder()).append("Got a new token = ").append(token).toString());
        }
_L5:
        return token;
_L2:
        if (i < 5)
        {
            break; /* Loop/switch isn't completed */
        }
        Log.w(TAG, "Got an empty token from the server.");
        if (true) goto _L5; else goto _L4
        ConnectionException connectionexception;
        connectionexception;
        if (i >= 5) goto _L7; else goto _L6
_L6:
        Log.d(TAG, "Failed to get token. Retrying...");
        this;
        JVM INSTR monitorenter ;
        wait(5000L);
        this;
        JVM INSTR monitorexit ;
          goto _L4
        mapdatasettings;
        throw connectionexception;
        mapdatasettings;
        this;
        JVM INSTR monitorexit ;
        throw mapdatasettings;
_L7:
        throw connectionexception;
_L4:
        i++;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private void resetToken()
    {
        token = null;
        lastTimeTokenReceived = 0L;
    }

    public String geTileMapsRequestUrl(MapDataSettings mapdatasettings)
        throws ConnectionException
    {
        return String.format("%s%s?t=%s", new Object[] {
            mapdatasettings.getLayerTilesUrl(), "tiles.axd", getToken(mapdatasettings)
        });
    }

    public NetworkInfo getActiveNetworkInfo(Context context)
    {
        context = (ConnectivityManager)context.getSystemService("connectivity");
        if (context != null)
        {
            context = context.getAllNetworkInfo();
            if (context != null)
            {
                int j = context.length;
                for (int i = 0; i < j; i++)
                {
                    NetworkInfo networkinfo = context[i];
                    if (networkinfo.getState() == android.net.NetworkInfo.State.CONNECTED)
                    {
                        return networkinfo;
                    }
                }

            }
        }
        Log.w(com/wsi/android/framework/wxdata/ws/WSIServerConnector.getSimpleName(), "Network is currently unavailable.");
        return null;
    }

    public String getCapabilityRequestURL(MapDataSettings mapdatasettings)
    {
        String s;
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            s = "false";
        } else
        {
            s = "true";
        }
        mapdatasettings = mapdatasettings.getTesseraConfiguration();
        return String.format("%s/%s/%s/%s/%s/%s?%s", new Object[] {
            mapdatasettings.getDomain(), mapdatasettings.getRelease(), mapdatasettings.getCulture(), mapdatasettings.getMemberId(), mapdatasettings.getMapId(), "capability.json", (new StringBuilder()).append("trim=").append(s).toString()
        });
    }

    public NetworkConnectionType getConnectionType(Context context)
    {
        context = getActiveNetworkInfo(context);
        if (context != null)
        {
            return NetworkConnectionType.getType(context.getTypeName());
        } else
        {
            return NetworkConnectionType.UNKNOWN;
        }
    }

    public String getFeaturesUrlRequest(MapDataSettings mapdatasettings)
        throws ConnectionException
    {
        return String.format("%s%s?t=%s", new Object[] {
            mapdatasettings.getLayerTilesUrl(), "features.axd", getToken(mapdatasettings)
        });
    }

    protected InputStream getInputStream(URLConnection urlconnection)
        throws ConnectionException
    {
        try
        {
            urlconnection = urlconnection.getInputStream();
        }
        // Misplaced declaration of an exception variable
        catch (URLConnection urlconnection)
        {
            throw new ConnectionException("Failed to get the InputStream.", urlconnection);
        }
        if (urlconnection != null)
        {
            return urlconnection;
        } else
        {
            throw new ConnectionException("Broken library implementation: the InputStream is null.");
        }
    }

    public String getSettingsRequestURL(MapDataSettings mapdatasettings)
    {
        mapdatasettings = mapdatasettings.getTesseraConfiguration();
        return String.format("%s/%s/%s/%s/%s/%s", new Object[] {
            mapdatasettings.getDomain(), mapdatasettings.getRelease(), mapdatasettings.getCulture(), mapdatasettings.getMemberId(), mapdatasettings.getMapId(), "settings.json"
        });
    }

    public String getToken(MapDataSettings mapdatasettings)
        throws ConnectionException
    {
        this;
        JVM INSTR monitorenter ;
        if (token == null || ServiceUtils.getCurrentTimeMs() - lastTimeTokenReceived >= 0x36ee80L) goto _L2; else goto _L1
_L1:
        mapdatasettings = token;
_L4:
        this;
        JVM INSTR monitorexit ;
        return mapdatasettings;
_L2:
        mapdatasettings = getTokenFromServer(mapdatasettings);
        if (true) goto _L4; else goto _L3
_L3:
        mapdatasettings;
        throw mapdatasettings;
    }

    public String getTokenStringUrlRequest(MapDataSettings mapdatasettings)
    {
        return String.format("%s%s?k=%s&s=S&m=%s", new Object[] {
            mapdatasettings.getLayerTilesUrl(), "token.axd", mapdatasettings.getTokenSharedKey(), mapdatasettings.getTokenMemeberId()
        });
    }

    public boolean isConnectionAvailable(MapDataSettings mapdatasettings, Context context)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = isNetworkAvailable(context);
        if (flag) goto _L2; else goto _L1
_L1:
        flag = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = mapdatasettings.getTesseraConfiguration().getVersion().isServerConnectionAvailable(this, mapdatasettings);
        if (true) goto _L4; else goto _L3
_L3:
        mapdatasettings;
        throw mapdatasettings;
    }

    public boolean isNetworkAvailable(Context context)
    {
        return getActiveNetworkInfo(context) != null;
    }

    public boolean isTessera30DataUpdateNeeded()
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        if (tessera30LastTimeDataUpdated != null) goto _L2; else goto _L1
_L1:
        tessera30LastTimeDataUpdated = new Date();
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        Date date = new Date();
        if (60000L - (date.getTime() - tessera30LastTimeDataUpdated.getTime()) <= 10000L)
        {
            tessera30LastTimeDataUpdated = date;
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_70;
        Exception exception;
        exception;
        throw exception;
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void loadAndParseXml(String s, ContentHandler contenthandler, boolean flag)
        throws ConnectionException, XmlParseException, WrongResourceTypeException
    {
        URLConnection urlconnection;
        urlconnection = (new URL(s)).openConnection();
        urlconnection.setConnectTimeout(20000);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        urlconnection.setReadTimeout(60000);
        urlconnection.setRequestProperty("Accept-Encoding", "gzip,deflate");
_L1:
        Object obj = urlconnection.getContentType();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        if (!"".equals(obj) && !((String) (obj)).toLowerCase().contains("xml") && !((String) (obj)).toLowerCase().contains("html"))
        {
            throw new WrongResourceTypeException(((String) (obj)));
        }
        break MISSING_BLOCK_LABEL_131;
        urlconnection.setReadTimeout(20000);
          goto _L1
        InputStream inputstream = getInputStream(urlconnection);
        obj = inputstream;
        if ("gzip".equals(urlconnection.getContentEncoding()))
        {
            obj = new GZIPInputStream(inputstream);
        }
        obj = new BufferedInputStream(((InputStream) (obj)), 16384);
        XMLReader xmlreader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
        xmlreader.setContentHandler(contenthandler);
        xmlreader.parse(new InputSource(((InputStream) (obj))));
        try
        {
            ((BufferedInputStream) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ContentHandler contenthandler)
        {
            wrapExceptionInConnectionException(contenthandler, s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ContentHandler contenthandler)
        {
            wrapExceptionInConnectionException(contenthandler, s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ContentHandler contenthandler)
        {
            wrapExceptionInConnectionException(contenthandler, s);
        }
        // Misplaced declaration of an exception variable
        catch (ContentHandler contenthandler)
        {
            throw new ConnectionException(String.format("Failed to load an xml for URL [%s]", new Object[] {
                s
            }), contenthandler);
        }
        // Misplaced declaration of an exception variable
        catch (ContentHandler contenthandler)
        {
            throw new XmlParseException(String.format("Failed to parse an xml resource obtained for the URL [%s]", new Object[] {
                s
            }), contenthandler);
        }
        // Misplaced declaration of an exception variable
        catch (ContentHandler contenthandler)
        {
            throw new XmlParseException(String.format("Failed to parse an xml resource obtained for the URL [%s]", new Object[] {
                s
            }), contenthandler);
        }
        return;
        contenthandler;
        ((BufferedInputStream) (obj)).close();
        throw contenthandler;
    }

    public Bitmap loadBitmap(String s)
        throws BitmapCorruptedException, ConnectionException
    {
        Object obj;
        Object obj1;
        try
        {
            obj = (new URL(s)).openConnection();
            ((URLConnection) (obj)).setConnectTimeout(20000);
            ((URLConnection) (obj)).setReadTimeout(20000);
            obj = new BufferedInputStream(getInputStream(((URLConnection) (obj))), 16384);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new ConnectionException(String.format("An error occurred when getting a bitmap image from URL [%s]", new Object[] {
                s
            }), ((Throwable) (obj)));
        }
        obj1 = BitmapFactory.decodeStream(((InputStream) (obj)));
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        throw new BitmapCorruptedException();
        obj1;
        ((BufferedInputStream) (obj)).close();
        throw obj1;
        ((BufferedInputStream) (obj)).close();
        return ((Bitmap) (obj1));
    }

    public byte[] loadBytes(String s)
        throws ConnectionException
    {
        Object obj;
        ByteArrayOutputStream bytearrayoutputstream;
        obj = (new URL(s)).openConnection();
        ((URLConnection) (obj)).setConnectTimeout(10000);
        ((URLConnection) (obj)).setReadTimeout(10000);
        obj = getInputStream(((URLConnection) (obj)));
        bytearrayoutputstream = new ByteArrayOutputStream();
        byte abyte0[] = new byte[16384];
_L1:
        int i = ((InputStream) (obj)).read(abyte0);
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        boolean flag = Thread.currentThread().isInterrupted();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        ((InputStream) (obj)).close();
        bytearrayoutputstream.close();
        return null;
        bytearrayoutputstream.write(abyte0, 0, i);
          goto _L1
        Exception exception;
        exception;
        byte abyte1[];
        try
        {
            ((InputStream) (obj)).close();
            bytearrayoutputstream.close();
            throw exception;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            wrapExceptionInConnectionException(((Exception) (obj)), s);
            return null;
        }
        catch (NullPointerException nullpointerexception)
        {
            wrapExceptionInConnectionException(nullpointerexception, s);
            return null;
        }
        catch (NumberFormatException numberformatexception)
        {
            wrapExceptionInConnectionException(numberformatexception, s);
            return null;
        }
        catch (StringIndexOutOfBoundsException stringindexoutofboundsexception)
        {
            wrapExceptionInConnectionException(stringindexoutofboundsexception, s);
        }
        break MISSING_BLOCK_LABEL_159;
        abyte1 = bytearrayoutputstream.toByteArray();
        ((InputStream) (obj)).close();
        bytearrayoutputstream.close();
        return abyte1;
        return null;
    }

    public String loadResourceAsString(String s, String s1)
        throws ConnectionException
    {
        Object obj;
        StringBuilder stringbuilder;
        String s2;
        boolean flag;
        try
        {
            obj = (new URL(s)).openConnection();
            ((URLConnection) (obj)).setConnectTimeout(10000);
            ((URLConnection) (obj)).setReadTimeout(10000);
            obj = ((URLConnection) (obj)).getInputStream();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw new ConnectionException(String.format("An error occurred when getting a resource from the URL [%s]", new Object[] {
                s
            }), s1);
        }
        s1 = new BufferedReader(new InputStreamReader(((InputStream) (obj)), s1));
_L4:
        stringbuilder = new StringBuilder();
        flag = true;
_L1:
        s2 = s1.readLine();
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        flag = false;
_L2:
        stringbuilder.append(s2);
          goto _L1
        s1;
        ((InputStream) (obj)).close();
        throw s1;
        s1;
        s1 = new BufferedReader(new InputStreamReader(((InputStream) (obj))));
        continue; /* Loop/switch isn't completed */
        stringbuilder.append("\n");
          goto _L2
        s1 = stringbuilder.toString();
        ((InputStream) (obj)).close();
        return s1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public byte[] loadResourceBytes(String s, String s1)
        throws ConnectionException, WrongResourceTypeException
    {
        Object obj;
        String s2;
        obj = (new URL(s)).openConnection();
        ((URLConnection) (obj)).setConnectTimeout(10000);
        ((URLConnection) (obj)).setReadTimeout(10000);
        s2 = ((URLConnection) (obj)).getContentType();
        if (s1 == null) goto _L2; else goto _L1
_L1:
        if (!s1.equalsIgnoreCase(s2))
        {
            throw new WrongResourceTypeException(s2);
        }
          goto _L2
_L6:
        return null;
_L2:
        s1 = getInputStream(((URLConnection) (obj)));
        obj = new ByteArrayOutputStream();
        byte abyte0[] = new byte[16384];
_L5:
        int i = s1.read(abyte0);
        if (i < 0) goto _L4; else goto _L3
_L3:
        ((ByteArrayOutputStream) (obj)).write(abyte0, 0, i);
          goto _L5
        Exception exception;
        exception;
        try
        {
            s1.close();
            ((ByteArrayOutputStream) (obj)).close();
            throw exception;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            wrapExceptionInConnectionException(s1, s);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            wrapExceptionInConnectionException(s1, s);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            wrapExceptionInConnectionException(s1, s);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            wrapExceptionInConnectionException(s1, s);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            wrapExceptionInConnectionException(s1, s);
        }
        if (true) goto _L6; else goto _L4
_L4:
        exception = ((ByteArrayOutputStream) (obj)).toByteArray();
        s1.close();
        ((ByteArrayOutputStream) (obj)).close();
        return exception;
    }

    public void resetTessera30LastTimeDataUpdatedDate()
    {
        this;
        JVM INSTR monitorenter ;
        tessera30LastTimeDataUpdated = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected void wrapExceptionInConnectionException(Exception exception, String s)
        throws ConnectionException
    {
        throw new ConnectionException(String.format("Failed to get a resource from the URL [%s]", new Object[] {
            s
        }), exception);
    }

}
