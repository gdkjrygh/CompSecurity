// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import retrofit.client.Response;
import retrofit.http.Body;
import retrofit.http.EncodedPath;
import retrofit.http.EncodedQuery;
import retrofit.http.EncodedQueryMap;
import retrofit.http.Field;
import retrofit.http.FieldMap;
import retrofit.http.FormUrlEncoded;
import retrofit.http.Header;
import retrofit.http.Headers;
import retrofit.http.Multipart;
import retrofit.http.Part;
import retrofit.http.PartMap;
import retrofit.http.Path;
import retrofit.http.Query;
import retrofit.http.QueryMap;
import retrofit.http.RestMethod;
import retrofit.http.Streaming;

// Referenced classes of package retrofit:
//            Callback, Platform, Types

final class RestMethodInfo
{

    private static final String PARAM = "[a-zA-Z][a-zA-Z0-9_-]*";
    private static final Pattern PARAM_NAME_REGEX = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");
    private static final Pattern PARAM_URL_REGEX = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
    String contentTypeHeader;
    List headers;
    final boolean isObservable;
    boolean isStreaming;
    final boolean isSynchronous;
    boolean loaded;
    final Method method;
    boolean requestHasBody;
    String requestMethod;
    String requestParamNames[];
    ParamUsage requestParamUsage[];
    String requestQuery;
    RequestType requestType;
    String requestUrl;
    Set requestUrlParamNames;
    Type responseObjectType;
    final ResponseType responseType = parseResponseType();

    RestMethodInfo(Method method1)
    {
        boolean flag1 = true;
        super();
        loaded = false;
        requestType = RequestType.SIMPLE;
        method = method1;
        boolean flag;
        if (responseType == ResponseType.OBJECT)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isSynchronous = flag;
        if (responseType == ResponseType.OBSERVABLE)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        isObservable = flag;
    }

    private static Type getParameterUpperBound(ParameterizedType parameterizedtype)
    {
        parameterizedtype = parameterizedtype.getActualTypeArguments();
        for (int i = 0; i < parameterizedtype.length; i++)
        {
            Object obj = parameterizedtype[i];
            if (obj instanceof WildcardType)
            {
                parameterizedtype[i] = ((WildcardType)obj).getUpperBounds()[0];
            }
        }

        return parameterizedtype[0];
    }

    private transient RuntimeException methodError(String s, Object aobj[])
    {
        String s1 = s;
        if (aobj.length > 0)
        {
            s1 = String.format(s, aobj);
        }
        return new IllegalArgumentException((new StringBuilder()).append(method.getDeclaringClass().getSimpleName()).append(".").append(method.getName()).append(": ").append(s1).toString());
    }

    private transient RuntimeException parameterError(int i, String s, Object aobj[])
    {
        return methodError((new StringBuilder()).append(s).append(" (parameter #").append(i + 1).append(")").toString(), aobj);
    }

    private void parseMethodAnnotations()
    {
        Annotation aannotation[];
        int i;
        int k;
        aannotation = method.getAnnotations();
        k = aannotation.length;
        i = 0;
_L6:
        String s;
        Class class1;
        Annotation annotation;
        Annotation aannotation1[];
        int j;
        int l;
        if (i < k)
        {
            annotation = aannotation[i];
            class1 = annotation.annotationType();
            s = null;
            aannotation1 = class1.getAnnotations();
            l = aannotation1.length;
            j = 0;
            break MISSING_BLOCK_LABEL_54;
        }
          goto _L1
        j++;
        if (true) goto _L3; else goto _L2
_L3:
        Object obj = s;
        if (j < l)
        {
            obj = aannotation1[j];
            if (retrofit/http/RestMethod != ((Annotation) (obj)).annotationType())
            {
                break MISSING_BLOCK_LABEL_123;
            }
            obj = (RestMethod)obj;
        }
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (requestMethod != null)
        {
            throw methodError("Only one HTTP method is allowed. Found: %s and %s.", new Object[] {
                requestMethod, ((RestMethod) (obj)).value()
            });
        }
        try
        {
            s = (String)class1.getMethod("value", new Class[0]).invoke(annotation, new Object[0]);
        }
        catch (Exception exception)
        {
            throw methodError("Failed to extract String 'value' from @%s annotation.", new Object[] {
                class1.getSimpleName()
            });
        }
        parsePath(s);
        requestMethod = ((RestMethod) (obj)).value();
        requestHasBody = ((RestMethod) (obj)).hasBody();
_L4:
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        if (class1 == retrofit/http/Headers)
        {
            String as[] = ((Headers)annotation).value();
            if (as.length == 0)
            {
                throw methodError("@Headers annotation is empty.", new Object[0]);
            }
            headers = parseHeaders(as);
        } else
        if (class1 == retrofit/http/Multipart)
        {
            if (requestType != RequestType.SIMPLE)
            {
                throw methodError("Only one encoding annotation is allowed.", new Object[0]);
            }
            requestType = RequestType.MULTIPART;
        } else
        if (class1 == retrofit/http/FormUrlEncoded)
        {
            if (requestType != RequestType.SIMPLE)
            {
                throw methodError("Only one encoding annotation is allowed.", new Object[0]);
            }
            requestType = RequestType.FORM_URL_ENCODED;
        } else
        if (class1 == retrofit/http/Streaming)
        {
            if (responseObjectType != retrofit/client/Response)
            {
                throw methodError("Only methods having %s as data type are allowed to have @%s annotation.", new Object[] {
                    retrofit/client/Response.getSimpleName(), retrofit/http/Streaming.getSimpleName()
                });
            }
            isStreaming = true;
        }
        if (true) goto _L4; else goto _L1
_L1:
        if (requestMethod == null)
        {
            throw methodError("HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
        }
        if (!requestHasBody)
        {
            if (requestType == RequestType.MULTIPART)
            {
                throw methodError("Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
            }
            if (requestType == RequestType.FORM_URL_ENCODED)
            {
                throw methodError("FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
            }
        }
        return;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void parseParameters()
    {
        Class aclass[];
        Annotation aannotation[][];
        String as[];
        ParamUsage aparamusage[];
        int i;
        int j;
        int k;
        int l;
        int i1;
        aclass = method.getParameterTypes();
        aannotation = method.getParameterAnnotations();
        l = aannotation.length;
        if (!isSynchronous && !isObservable)
        {
            l--;
        }
        as = new String[l];
        requestParamNames = as;
        aparamusage = new ParamUsage[l];
        requestParamUsage = aparamusage;
        j = 0;
        k = 0;
        i = 0;
        i1 = 0;
_L6:
        Class class1;
        Annotation aannotation1[];
        int k1;
        int i2;
        int j2;
        if (i1 >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        class1 = aclass[i1];
        aannotation1 = aannotation[i1];
        k1 = i;
        i2 = k;
        j2 = j;
        if (aannotation1 == null) goto _L2; else goto _L1
_L1:
        int j1;
        int k2;
        k2 = aannotation1.length;
        j1 = 0;
_L4:
        k1 = i;
        i2 = k;
        j2 = j;
        if (j1 >= k2) goto _L2; else goto _L3
_L3:
        Object obj = aannotation1[j1];
        Class class2 = ((Annotation) (obj)).annotationType();
        if (class2 == retrofit/http/Path)
        {
            obj = ((Path)obj).value();
            validatePathName(i1, ((String) (obj)));
            as[i1] = ((String) (obj));
            aparamusage[i1] = ParamUsage.PATH;
            k1 = k;
            k = j;
            j = k1;
        } else
        if (class2 == retrofit/http/EncodedPath)
        {
            obj = ((EncodedPath)obj).value();
            validatePathName(i1, ((String) (obj)));
            as[i1] = ((String) (obj));
            aparamusage[i1] = ParamUsage.ENCODED_PATH;
            k1 = j;
            j = k;
            k = k1;
        } else
        if (class2 == retrofit/http/Query)
        {
            as[i1] = ((Query)obj).value();
            aparamusage[i1] = ParamUsage.QUERY;
            k1 = j;
            j = k;
            k = k1;
        } else
        if (class2 == retrofit/http/EncodedQuery)
        {
            as[i1] = ((EncodedQuery)obj).value();
            aparamusage[i1] = ParamUsage.ENCODED_QUERY;
            k1 = j;
            j = k;
            k = k1;
        } else
        if (class2 == retrofit/http/QueryMap)
        {
            if (!java/util/Map.isAssignableFrom(class1))
            {
                throw parameterError(i1, "@QueryMap parameter type must be Map.", new Object[0]);
            }
            aparamusage[i1] = ParamUsage.QUERY_MAP;
            k1 = j;
            j = k;
            k = k1;
        } else
        if (class2 == retrofit/http/EncodedQueryMap)
        {
            if (!java/util/Map.isAssignableFrom(class1))
            {
                throw parameterError(i1, "@EncodedQueryMap parameter type must be Map.", new Object[0]);
            }
            aparamusage[i1] = ParamUsage.ENCODED_QUERY_MAP;
            k1 = j;
            j = k;
            k = k1;
        } else
        if (class2 == retrofit/http/Header)
        {
            obj = ((Header)obj).value();
            if (class1 != java/lang/String)
            {
                throw parameterError(i1, "@Header parameter type must be String. Found: %s.", new Object[] {
                    class1.getSimpleName()
                });
            }
            as[i1] = ((String) (obj));
            aparamusage[i1] = ParamUsage.HEADER;
            k1 = j;
            j = k;
            k = k1;
        } else
        if (class2 == retrofit/http/Field)
        {
            if (requestType != RequestType.FORM_URL_ENCODED)
            {
                throw parameterError(i1, "@Field parameters can only be used with form encoding.", new Object[0]);
            }
            as[i1] = ((Field)obj).value();
            aparamusage[i1] = ParamUsage.FIELD;
            j = k;
            k = 1;
        } else
        if (class2 == retrofit/http/FieldMap)
        {
            if (requestType != RequestType.FORM_URL_ENCODED)
            {
                throw parameterError(i1, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
            }
            if (!java/util/Map.isAssignableFrom(class1))
            {
                throw parameterError(i1, "@FieldMap parameter type must be Map.", new Object[0]);
            }
            aparamusage[i1] = ParamUsage.FIELD_MAP;
            j = k;
            k = 1;
        } else
        if (class2 == retrofit/http/Part)
        {
            if (requestType != RequestType.MULTIPART)
            {
                throw parameterError(i1, "@Part parameters can only be used with multipart encoding.", new Object[0]);
            }
            as[i1] = ((Part)obj).value();
            aparamusage[i1] = ParamUsage.PART;
            k = j;
            j = 1;
        } else
        if (class2 == retrofit/http/PartMap)
        {
            if (requestType != RequestType.MULTIPART)
            {
                throw parameterError(i1, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
            }
            if (!java/util/Map.isAssignableFrom(class1))
            {
                throw parameterError(i1, "@PartMap parameter type must be Map.", new Object[0]);
            }
            aparamusage[i1] = ParamUsage.PART_MAP;
            k = j;
            j = 1;
        } else
        if (class2 == retrofit/http/Body)
        {
            if (requestType != RequestType.SIMPLE)
            {
                throw parameterError(i1, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
            }
            if (i != 0)
            {
                throw methodError("Multiple @Body method annotations found.", new Object[0]);
            }
            i = 1;
            aparamusage[i1] = ParamUsage.BODY;
            k1 = j;
            j = k;
            k = k1;
        } else
        {
            int l1 = j;
            j = k;
            k = l1;
        }
        k1 = j1 + 1;
        j1 = k;
        k = j;
        j = j1;
        j1 = k1;
        if (true) goto _L4; else goto _L2
_L2:
        if (aparamusage[i1] == null)
        {
            throw parameterError(i1, "No Retrofit annotation found.", new Object[0]);
        }
        i1++;
        i = k1;
        k = i2;
        j = j2;
        if (true) goto _L6; else goto _L5
_L5:
        if (requestType == RequestType.SIMPLE && !requestHasBody && i != 0)
        {
            throw methodError("Non-body HTTP method cannot contain @Body or @TypedOutput.", new Object[0]);
        }
        if (requestType == RequestType.FORM_URL_ENCODED && j == 0)
        {
            throw methodError("Form-encoded method must contain at least one @Field.", new Object[0]);
        }
        if (requestType == RequestType.MULTIPART && k == 0)
        {
            throw methodError("Multipart method must contain at least one @Part.", new Object[0]);
        } else
        {
            return;
        }
    }

    private void parsePath(String s)
    {
        if (s == null || s.length() == 0 || s.charAt(0) != '/')
        {
            throw methodError("URL path \"%s\" must start with '/'.", new Object[] {
                s
            });
        }
        String s1 = null;
        int i = s.indexOf('?');
        String s2;
        if (i != -1 && i < s.length() - 1)
        {
            s2 = s.substring(0, i);
            String s3 = s.substring(i + 1);
            s1 = s3;
            if (PARAM_URL_REGEX.matcher(s3).find())
            {
                throw methodError("URL query string \"%s\" must not have replace block.", new Object[] {
                    s3
                });
            }
        } else
        {
            s2 = s;
        }
        s = parsePathParameters(s);
        requestUrl = s2;
        requestUrlParamNames = s;
        requestQuery = s1;
    }

    static Set parsePathParameters(String s)
    {
        s = PARAM_URL_REGEX.matcher(s);
        LinkedHashSet linkedhashset = new LinkedHashSet();
        for (; s.find(); linkedhashset.add(s.group(1))) { }
        return linkedhashset;
    }

    private ResponseType parseResponseType()
    {
        Type type1 = method.getGenericReturnType();
        Type atype[] = method.getGenericParameterTypes();
        Object obj;
        Type type;
        if (atype.length > 0)
        {
            type = atype[atype.length - 1];
            boolean flag;
            boolean flag1;
            if (type instanceof ParameterizedType)
            {
                obj = ((ParameterizedType)type).getRawType();
            } else
            {
                obj = type;
            }
            if (obj instanceof Class)
            {
                obj = (Class)obj;
            } else
            {
                obj = null;
            }
        } else
        {
            obj = null;
            type = null;
        }
        if (type1 != Void.TYPE)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (obj != null && retrofit/Callback.isAssignableFrom(((Class) (obj))))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag && flag1)
        {
            throw methodError("Must have return type or Callback as last argument, not both.", new Object[0]);
        }
        if (!flag && !flag1)
        {
            throw methodError("Must have either a return type or Callback as last argument.", new Object[0]);
        }
        if (flag)
        {
            if (Platform.HAS_RX_JAVA)
            {
                obj = Types.getRawType(type1);
                if (RxSupport.isObservable(((Class) (obj))))
                {
                    responseObjectType = getParameterUpperBound((ParameterizedType)RxSupport.getObservableType(type1, ((Class) (obj))));
                    return ResponseType.OBSERVABLE;
                }
            }
            responseObjectType = type1;
            return ResponseType.OBJECT;
        }
        obj = Types.getSupertype(type, Types.getRawType(type), retrofit/Callback);
        if (obj instanceof ParameterizedType)
        {
            responseObjectType = getParameterUpperBound((ParameterizedType)obj);
            return ResponseType.VOID;
        } else
        {
            throw methodError("Last parameter must be of type Callback<X> or Callback<? super X>.", new Object[0]);
        }
    }

    private void validatePathName(int i, String s)
    {
        if (!PARAM_NAME_REGEX.matcher(s).matches())
        {
            throw parameterError(i, "@Path parameter name must match %s. Found: %s", new Object[] {
                PARAM_URL_REGEX.pattern(), s
            });
        }
        if (!requestUrlParamNames.contains(s))
        {
            throw parameterError(i, "URL \"%s\" does not contain \"{%s}\".", new Object[] {
                requestUrl, s
            });
        } else
        {
            return;
        }
    }

    void init()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = loaded;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        parseMethodAnnotations();
        parseParameters();
        loaded = true;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    List parseHeaders(String as[])
    {
        ArrayList arraylist = new ArrayList();
        int j = as.length;
        int i = 0;
        while (i < j) 
        {
            String s1 = as[i];
            int k = s1.indexOf(':');
            if (k == -1 || k == 0 || k == s1.length() - 1)
            {
                throw methodError("@Headers value must be in the form \"Name: Value\". Found: \"%s\"", new Object[] {
                    s1
                });
            }
            String s = s1.substring(0, k);
            s1 = s1.substring(k + 1).trim();
            if ("Content-Type".equalsIgnoreCase(s))
            {
                contentTypeHeader = s1;
            } else
            {
                arraylist.add(new retrofit.client.Header(s, s1));
            }
            i++;
        }
        return arraylist;
    }


    private class RequestType extends Enum
    {

        private static final RequestType $VALUES[];
        public static final RequestType FORM_URL_ENCODED;
        public static final RequestType MULTIPART;
        public static final RequestType SIMPLE;

        public static RequestType valueOf(String s)
        {
            return (RequestType)Enum.valueOf(retrofit/RestMethodInfo$RequestType, s);
        }

        public static RequestType[] values()
        {
            return (RequestType[])$VALUES.clone();
        }

        static 
        {
            SIMPLE = new RequestType("SIMPLE", 0);
            MULTIPART = new RequestType("MULTIPART", 1);
            FORM_URL_ENCODED = new RequestType("FORM_URL_ENCODED", 2);
            $VALUES = (new RequestType[] {
                SIMPLE, MULTIPART, FORM_URL_ENCODED
            });
        }

        private RequestType(String s, int i)
        {
            super(s, i);
        }
    }


    private class ResponseType extends Enum
    {

        private static final ResponseType $VALUES[];
        public static final ResponseType OBJECT;
        public static final ResponseType OBSERVABLE;
        public static final ResponseType VOID;

        public static ResponseType valueOf(String s)
        {
            return (ResponseType)Enum.valueOf(retrofit/RestMethodInfo$ResponseType, s);
        }

        public static ResponseType[] values()
        {
            return (ResponseType[])$VALUES.clone();
        }

        static 
        {
            VOID = new ResponseType("VOID", 0);
            OBSERVABLE = new ResponseType("OBSERVABLE", 1);
            OBJECT = new ResponseType("OBJECT", 2);
            $VALUES = (new ResponseType[] {
                VOID, OBSERVABLE, OBJECT
            });
        }

        private ResponseType(String s, int i)
        {
            super(s, i);
        }
    }


    private class ParamUsage extends Enum
    {

        private static final ParamUsage $VALUES[];
        public static final ParamUsage BODY;
        public static final ParamUsage ENCODED_PATH;
        public static final ParamUsage ENCODED_QUERY;
        public static final ParamUsage ENCODED_QUERY_MAP;
        public static final ParamUsage FIELD;
        public static final ParamUsage FIELD_MAP;
        public static final ParamUsage HEADER;
        public static final ParamUsage PART;
        public static final ParamUsage PART_MAP;
        public static final ParamUsage PATH;
        public static final ParamUsage QUERY;
        public static final ParamUsage QUERY_MAP;

        public static ParamUsage valueOf(String s)
        {
            return (ParamUsage)Enum.valueOf(retrofit/RestMethodInfo$ParamUsage, s);
        }

        public static ParamUsage[] values()
        {
            return (ParamUsage[])$VALUES.clone();
        }

        static 
        {
            PATH = new ParamUsage("PATH", 0);
            ENCODED_PATH = new ParamUsage("ENCODED_PATH", 1);
            QUERY = new ParamUsage("QUERY", 2);
            ENCODED_QUERY = new ParamUsage("ENCODED_QUERY", 3);
            QUERY_MAP = new ParamUsage("QUERY_MAP", 4);
            ENCODED_QUERY_MAP = new ParamUsage("ENCODED_QUERY_MAP", 5);
            FIELD = new ParamUsage("FIELD", 6);
            FIELD_MAP = new ParamUsage("FIELD_MAP", 7);
            PART = new ParamUsage("PART", 8);
            PART_MAP = new ParamUsage("PART_MAP", 9);
            BODY = new ParamUsage("BODY", 10);
            HEADER = new ParamUsage("HEADER", 11);
            $VALUES = (new ParamUsage[] {
                PATH, ENCODED_PATH, QUERY, ENCODED_QUERY, QUERY_MAP, ENCODED_QUERY_MAP, FIELD, FIELD_MAP, PART, PART_MAP, 
                BODY, HEADER
            });
        }

        private ParamUsage(String s, int i)
        {
            super(s, i);
        }
    }


    private class RxSupport
    {

        public static Type getObservableType(Type type, Class class1)
        {
            return Types.getSupertype(type, class1, rx/Observable);
        }

        public static boolean isObservable(Class class1)
        {
            return class1 == rx/Observable;
        }

        private RxSupport()
        {
        }
    }

}
