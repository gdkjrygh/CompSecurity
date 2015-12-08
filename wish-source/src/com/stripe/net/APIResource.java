// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.net;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.stripe.Stripe;
import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.model.EventData;
import com.stripe.model.EventDataDeserializer;
import com.stripe.model.StripeObject;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.net.URLStreamHandler;
import java.security.Security;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;

// Referenced classes of package com.stripe.net:
//            StripeResponse

public abstract class APIResource extends StripeObject
{
    private static class Error
    {

        String code;
        String message;
        String param;
        String type;

        private Error()
        {
        }
    }

    private static class ErrorContainer
    {

        private Error error;


        private ErrorContainer()
        {
        }
    }

    protected static final class RequestMethod extends Enum
    {

        private static final RequestMethod $VALUES[];
        public static final RequestMethod DELETE;
        public static final RequestMethod GET;
        public static final RequestMethod POST;

        public static RequestMethod valueOf(String s)
        {
            return (RequestMethod)Enum.valueOf(com/stripe/net/APIResource$RequestMethod, s);
        }

        public static RequestMethod[] values()
        {
            return (RequestMethod[])$VALUES.clone();
        }

        static 
        {
            GET = new RequestMethod("GET", 0);
            POST = new RequestMethod("POST", 1);
            DELETE = new RequestMethod("DELETE", 2);
            $VALUES = (new RequestMethod[] {
                GET, POST, DELETE
            });
        }

        private RequestMethod(String s, int i)
        {
            super(s, i);
        }
    }


    public static final String CHARSET = "UTF-8";
    private static final String CUSTOM_URL_STREAM_HANDLER_PROPERTY_NAME = "com.stripe.net.customURLStreamHandler";
    private static final String DNS_CACHE_TTL_PROPERTY_NAME = "networkaddress.cache.ttl";
    public static final Gson gson;

    public APIResource()
    {
    }

    protected static Object _request(RequestMethod requestmethod, String s, Map map, Class class1, String s1)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        String s2;
        if ((Stripe.apiKey == null || Stripe.apiKey.length() == 0) && (s1 == null || s1.length() == 0))
        {
            throw new AuthenticationException("No API key provided. (HINT: set your API key using 'Stripe.apiKey = <API-KEY>'. You can generate API keys from the Stripe web interface. See https://stripe.com/api for details or email support@stripe.com if you have questions.");
        }
        s2 = s1;
        if (s1 == null)
        {
            s2 = Stripe.apiKey;
        }
        int i;
        try
        {
            s1 = createQuery(map);
        }
        // Misplaced declaration of an exception variable
        catch (RequestMethod requestmethod)
        {
            throw new InvalidRequestException("Unable to encode parameters to UTF-8. Please contact support@stripe.com for assistance.", null, requestmethod);
        }
        map = makeURLConnectionRequest(requestmethod, s, s1, s2);
        requestmethod = map;
_L2:
        i = ((StripeResponse) (requestmethod)).responseCode;
        requestmethod = ((StripeResponse) (requestmethod)).responseBody;
        if (i < 200 || i >= 300)
        {
            handleAPIError(requestmethod, i);
        }
        return gson.fromJson(requestmethod, class1);
        map;
        if (System.getProperty("com.google.appengine.runtime.environment", null) != null)
        {
            requestmethod = makeAppEngineRequest(requestmethod, s, s1, s2);
        } else
        {
            throw map;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static String className(Class class1)
    {
        return class1.getSimpleName().toLowerCase().replace("$", "");
    }

    protected static String classURL(Class class1)
    {
        return String.format("%ss", new Object[] {
            singleClassURL(class1)
        });
    }

    private static HttpsURLConnection createDeleteConnection(String s, String s1, String s2)
        throws IOException
    {
        s = createStripeConnection(String.format("%s?%s", new Object[] {
            s, s1
        }), s2);
        s.setRequestMethod("DELETE");
        return s;
    }

    private static HttpsURLConnection createGetConnection(String s, String s1, String s2)
        throws IOException
    {
        s = createStripeConnection(String.format("%s?%s", new Object[] {
            s, s1
        }), s2);
        s.setRequestMethod("GET");
        return s;
    }

    private static HttpsURLConnection createPostConnection(String s, String s1, String s2)
        throws IOException
    {
        HttpsURLConnection httpsurlconnection;
        httpsurlconnection = createStripeConnection(s, s2);
        httpsurlconnection.setDoOutput(true);
        httpsurlconnection.setRequestMethod("POST");
        httpsurlconnection.setRequestProperty("Content-Type", String.format("application/x-www-form-urlencoded;charset=%s", new Object[] {
            "UTF-8"
        }));
        s = null;
        s2 = httpsurlconnection.getOutputStream();
        s = s2;
        s2.write(s1.getBytes("UTF-8"));
        if (s2 != null)
        {
            s2.close();
        }
        return httpsurlconnection;
        s1;
        if (s != null)
        {
            s.close();
        }
        throw s1;
    }

    private static String createQuery(Map map)
        throws UnsupportedEncodingException
    {
        Object obj = flattenParams(map);
        map = new StringBuffer();
        java.util.Map.Entry entry;
        for (obj = ((Map) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); map.append(urlEncodePair((String)entry.getKey(), (String)entry.getValue())))
        {
            entry = (java.util.Map.Entry)((Iterator) (obj)).next();
            map.append("&");
        }

        if (map.length() > 0)
        {
            map.deleteCharAt(0);
        }
        return map.toString();
    }

    private static HttpsURLConnection createStripeConnection(String s, String s1)
        throws IOException
    {
        String s2 = System.getProperty("com.stripe.net.customURLStreamHandler", null);
        if (s2 != null)
        {
            try
            {
                s = new URL(null, s, (URLStreamHandler)Class.forName(s2).getConstructor(new Class[0]).newInstance(new Object[0]));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new IOException(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new IOException(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new IOException(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new IOException(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new IOException(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new IOException(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new IOException(s);
            }
        } else
        {
            s = new URL(s);
        }
        s = (HttpsURLConnection)s.openConnection();
        s.setConnectTimeout(30000);
        s.setReadTimeout(0x13880);
        s.setUseCaches(false);
        java.util.Map.Entry entry;
        for (s1 = getHeaders(s1).entrySet().iterator(); s1.hasNext(); s.setRequestProperty((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)s1.next();
        }

        return s;
    }

    private static Map flattenParams(Map map)
    {
        if (map != null) goto _L2; else goto _L1
_L1:
        map = new HashMap();
_L4:
        return map;
_L2:
        HashMap hashmap = new HashMap();
        Iterator iterator = map.entrySet().iterator();
        do
        {
            map = hashmap;
            if (!iterator.hasNext())
            {
                continue;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            map = (String)entry.getKey();
            Object obj = entry.getValue();
            if (obj instanceof Map)
            {
                HashMap hashmap1 = new HashMap();
                java.util.Map.Entry entry1;
                for (obj = ((Map)obj).entrySet().iterator(); ((Iterator) (obj)).hasNext(); hashmap1.put(String.format("%s[%s]", new Object[] {
    map, entry1.getKey()
}), entry1.getValue()))
                {
                    entry1 = (java.util.Map.Entry)((Iterator) (obj)).next();
                }

                hashmap.putAll(flattenParams(((Map) (hashmap1))));
            } else
            if (obj != null)
            {
                hashmap.put(map, obj.toString());
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    static Map getHeaders(String s)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("Accept-Charset", "UTF-8");
        hashmap.put("User-Agent", String.format("Stripe/v1 JavaBindings/%s", new Object[] {
            "1.1.15"
        }));
        Object obj = s;
        if (s == null)
        {
            obj = Stripe.apiKey;
        }
        hashmap.put("Authorization", String.format("Bearer %s", new Object[] {
            obj
        }));
        s = new String[7];
        s[0] = "os.name";
        s[1] = "os.version";
        s[2] = "os.arch";
        s[3] = "java.version";
        s[4] = "java.vendor";
        s[5] = "java.vm.version";
        s[6] = "java.vm.vendor";
        obj = new HashMap();
        int j = s.length;
        for (int i = 0; i < j; i++)
        {
            String s1 = s[i];
            ((Map) (obj)).put(s1, System.getProperty(s1));
        }

        ((Map) (obj)).put("bindings.version", "1.1.15");
        ((Map) (obj)).put("lang", "Java");
        ((Map) (obj)).put("publisher", "Stripe");
        hashmap.put("X-Stripe-Client-User-Agent", gson.toJson(obj));
        if (Stripe.apiVersion != null)
        {
            hashmap.put("Stripe-Version", Stripe.apiVersion);
        }
        return hashmap;
    }

    private static String getResponseBody(InputStream inputstream)
        throws IOException
    {
        String s = (new Scanner(inputstream, "UTF-8")).useDelimiter("\\A").next();
        inputstream.close();
        return s;
    }

    private static void handleAPIError(String s, int i)
        throws InvalidRequestException, AuthenticationException, CardException, APIException
    {
        s = ((ErrorContainer)gson.fromJson(s, com/stripe/net/APIResource$ErrorContainer)).error;
        switch (i)
        {
        case 403: 
        default:
            throw new APIException(((Error) (s)).message, null);

        case 400: 
            throw new InvalidRequestException(((Error) (s)).message, ((Error) (s)).param, null);

        case 404: 
            throw new InvalidRequestException(((Error) (s)).message, ((Error) (s)).param, null);

        case 401: 
            throw new AuthenticationException(((Error) (s)).message);

        case 402: 
            throw new CardException(((Error) (s)).message, ((Error) (s)).code, ((Error) (s)).param, null);
        }
    }

    protected static String instanceURL(Class class1, String s)
    {
        return String.format("%s/%s", new Object[] {
            classURL(class1), s
        });
    }

    private static StripeResponse makeAppEngineRequest(RequestMethod requestmethod, String s, String s1, String s2)
        throws APIException
    {
        if (requestmethod == RequestMethod.GET)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        Object obj = s;
        if (requestmethod != RequestMethod.DELETE)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        obj = String.format("%s?%s", new Object[] {
            s, s1
        });
        URL url;
        Class class1;
        Object obj1;
        url = new URL(((String) (obj)));
        class1 = Class.forName("com.google.appengine.api.urlfetch.HTTPMethod");
        obj1 = class1.getDeclaredField(requestmethod.name()).get(null);
        obj = Class.forName("com.google.appengine.api.urlfetch.FetchOptions$Builder");
        s = ((String) (((Class) (obj)).getDeclaredMethod("validateCertificate", new Class[0]).invoke(null, new Object[0])));
_L1:
        try
        {
            Class class2 = Class.forName("com.google.appengine.api.urlfetch.FetchOptions");
            class2.getDeclaredMethod("setDeadline", new Class[] {
                java/lang/Double
            }).invoke(s, new Object[] {
                new Double(55D)
            });
            obj = Class.forName("com.google.appengine.api.urlfetch.HTTPRequest");
            s = ((String) (((Class) (obj)).getDeclaredConstructor(new Class[] {
                java/net/URL, class1, class2
            }).newInstance(new Object[] {
                url, obj1, s
            })));
            if (requestmethod == RequestMethod.POST)
            {
                ((Class) (obj)).getDeclaredMethod("setPayload", new Class[] {
                    [B
                }).invoke(s, new Object[] {
                    s1.getBytes()
                });
            }
            for (requestmethod = getHeaders(s2).entrySet().iterator(); requestmethod.hasNext(); ((Class) (obj)).getDeclaredMethod("setHeader", new Class[] {
    s1
}).invoke(s, new Object[] {
    s2
}))
            {
                s2 = (java.util.Map.Entry)requestmethod.next();
                s1 = Class.forName("com.google.appengine.api.urlfetch.HTTPHeader");
                s2 = ((String) (s1.getDeclaredConstructor(new Class[] {
                    java/lang/String, java/lang/String
                }).newInstance(new Object[] {
                    s2.getKey(), s2.getValue()
                })));
            }

        }
        // Misplaced declaration of an exception variable
        catch (RequestMethod requestmethod)
        {
            throw new APIException("Sorry, an unknown error occurred while trying to use the Google App Engine runtime. Please contact support@stripe.com for assistance.", requestmethod);
        }
        break MISSING_BLOCK_LABEL_407;
        requestmethod;
        throw new APIException("Sorry, an unknown error occurred while trying to use the Google App Engine runtime. Please contact support@stripe.com for assistance.", requestmethod);
        s;
        System.err.println("Warning: this App Engine SDK version does not allow verification of SSL certificates;this exposes you to a MITM attack. Please upgrade your App Engine SDK to >=1.5.0. If you have questions, contact support@stripe.com.");
        s = ((String) (((Class) (obj)).getDeclaredMethod("withDefaults", new Class[0]).invoke(null, new Object[0])));
          goto _L1
        requestmethod = ((RequestMethod) (Class.forName("com.google.appengine.api.urlfetch.URLFetchServiceFactory").getDeclaredMethod("getURLFetchService", new Class[0]).invoke(null, new Object[0])));
        s1 = requestmethod.getClass().getDeclaredMethod("fetch", new Class[] {
            obj
        });
        s1.setAccessible(true);
        requestmethod = ((RequestMethod) (s1.invoke(requestmethod, new Object[] {
            s
        })));
        requestmethod = new StripeResponse(((Integer)requestmethod.getClass().getDeclaredMethod("getResponseCode", new Class[0]).invoke(requestmethod, new Object[0])).intValue(), new String((byte[])(byte[])requestmethod.getClass().getDeclaredMethod("getContent", new Class[0]).invoke(requestmethod, new Object[0]), "UTF-8"));
        return requestmethod;
        requestmethod;
        throw new APIException("Sorry, an unknown error occurred while trying to use the Google App Engine runtime. Please contact support@stripe.com for assistance.", requestmethod);
        requestmethod;
        throw new APIException("Sorry, an unknown error occurred while trying to use the Google App Engine runtime. Please contact support@stripe.com for assistance.", requestmethod);
        requestmethod;
        throw new APIException("Sorry, an unknown error occurred while trying to use the Google App Engine runtime. Please contact support@stripe.com for assistance.", requestmethod);
        requestmethod;
        throw new APIException("Sorry, an unknown error occurred while trying to use the Google App Engine runtime. Please contact support@stripe.com for assistance.", requestmethod);
        requestmethod;
        throw new APIException("Sorry, an unknown error occurred while trying to use the Google App Engine runtime. Please contact support@stripe.com for assistance.", requestmethod);
        requestmethod;
        throw new APIException("Sorry, an unknown error occurred while trying to use the Google App Engine runtime. Please contact support@stripe.com for assistance.", requestmethod);
        requestmethod;
        throw new APIException("Sorry, an unknown error occurred while trying to use the Google App Engine runtime. Please contact support@stripe.com for assistance.", requestmethod);
        requestmethod;
        throw new APIException("Sorry, an unknown error occurred while trying to use the Google App Engine runtime. Please contact support@stripe.com for assistance.", requestmethod);
    }

    private static StripeResponse makeURLConnectionRequest(RequestMethod requestmethod, String s, String s1, String s2)
        throws APIConnectionException
    {
        RequestMethod requestmethod1;
        RequestMethod requestmethod2;
        Object obj;
        Object obj1;
        obj1 = null;
        obj = null;
        requestmethod2 = obj;
        requestmethod1 = obj1;
        static class _cls1
        {

            static final int $SwitchMap$com$stripe$net$APIResource$RequestMethod[];

            static 
            {
                $SwitchMap$com$stripe$net$APIResource$RequestMethod = new int[RequestMethod.values().length];
                try
                {
                    $SwitchMap$com$stripe$net$APIResource$RequestMethod[RequestMethod.GET.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$stripe$net$APIResource$RequestMethod[RequestMethod.POST.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$stripe$net$APIResource$RequestMethod[RequestMethod.DELETE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.stripe.net.APIResource.RequestMethod[requestmethod.ordinal()];
        JVM INSTR tableswitch 1 3: default 258
    //                   1 121
    //                   2 205
    //                   3 223;
           goto _L1 _L2 _L3 _L4
_L1:
        requestmethod2 = obj;
        requestmethod1 = obj1;
        try
        {
            throw new APIConnectionException(String.format("Unrecognized HTTP method %s. This indicates a bug in the Stripe bindings. Please contact support@stripe.com for assistance.", new Object[] {
                requestmethod
            }));
        }
        // Misplaced declaration of an exception variable
        catch (RequestMethod requestmethod)
        {
            requestmethod1 = requestmethod2;
        }
        finally
        {
            if (requestmethod1 == null) goto _L0; else goto _L0
        }
        throw new APIConnectionException(String.format("Could not connect to Stripe (%s). Please check your internet connection and try again. If this problem persists,you should check Stripe's service status at https://twitter.com/stripestatus, or let us know at support@stripe.com.", new Object[] {
            "https://api.stripe.com"
        }), requestmethod);
        requestmethod1.disconnect();
        throw requestmethod;
_L2:
        requestmethod2 = obj;
        requestmethod1 = obj1;
        requestmethod = createGetConnection(s, s1, s2);
_L7:
        requestmethod2 = requestmethod;
        requestmethod1 = requestmethod;
        int i = requestmethod.getResponseCode();
        if (i < 200 || i >= 300) goto _L6; else goto _L5
_L5:
        requestmethod2 = requestmethod;
        requestmethod1 = requestmethod;
        s = getResponseBody(requestmethod.getInputStream());
_L8:
        requestmethod2 = requestmethod;
        requestmethod1 = requestmethod;
        s = new StripeResponse(i, s);
        if (requestmethod != null)
        {
            requestmethod.disconnect();
        }
        return s;
_L3:
        requestmethod2 = obj;
        requestmethod1 = obj1;
        requestmethod = createPostConnection(s, s1, s2);
          goto _L7
_L4:
        requestmethod2 = obj;
        requestmethod1 = obj1;
        requestmethod = createDeleteConnection(s, s1, s2);
          goto _L7
_L6:
        requestmethod2 = requestmethod;
        requestmethod1 = requestmethod;
        s = getResponseBody(requestmethod.getErrorStream());
          goto _L8
    }

    protected static Object request(RequestMethod requestmethod, String s, Map map, Class class1, String s1)
        throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException
    {
        String s2;
        Boolean boolean1;
        s2 = null;
        boolean1 = Boolean.valueOf(true);
        Object obj = Security.getProperty("networkaddress.cache.ttl");
        s2 = ((String) (obj));
        Security.setProperty("networkaddress.cache.ttl", "0");
        s2 = ((String) (obj));
        obj = boolean1;
_L2:
        requestmethod = ((RequestMethod) (_request(requestmethod, s, map, class1, s1)));
        if (((Boolean) (obj)).booleanValue())
        {
            if (s2 != null)
            {
                break; /* Loop/switch isn't completed */
            }
            Security.setProperty("networkaddress.cache.ttl", "-1");
        }
        return requestmethod;
        obj;
        obj = Boolean.valueOf(false);
        if (true) goto _L2; else goto _L1
_L1:
        Security.setProperty("networkaddress.cache.ttl", s2);
        return requestmethod;
        requestmethod;
        if (((Boolean) (obj)).booleanValue())
        {
            if (s2 == null)
            {
                Security.setProperty("networkaddress.cache.ttl", "-1");
            } else
            {
                Security.setProperty("networkaddress.cache.ttl", s2);
            }
        }
        throw requestmethod;
    }

    protected static String singleClassURL(Class class1)
    {
        return String.format("%s/v1/%s", new Object[] {
            "https://api.stripe.com", className(class1)
        });
    }

    private static String urlEncodePair(String s, String s1)
        throws UnsupportedEncodingException
    {
        return String.format("%s=%s", new Object[] {
            URLEncoder.encode(s, "UTF-8"), URLEncoder.encode(s1, "UTF-8")
        });
    }

    static 
    {
        gson = (new GsonBuilder()).setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).registerTypeAdapter(com/stripe/model/EventData, new EventDataDeserializer()).create();
    }
}
