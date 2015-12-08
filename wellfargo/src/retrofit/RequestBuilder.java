// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import retrofit.client.Header;
import retrofit.client.Request;
import retrofit.converter.Converter;
import retrofit.mime.FormUrlEncodedTypedOutput;
import retrofit.mime.MultipartTypedOutput;
import retrofit.mime.TypedOutput;
import retrofit.mime.TypedString;

// Referenced classes of package retrofit:
//            RestMethodInfo

final class RequestBuilder
    implements RequestInterceptor.RequestFacade
{

    private final String apiUrl;
    private TypedOutput body;
    private String contentTypeHeader;
    private final Converter converter;
    private final FormUrlEncodedTypedOutput formBody;
    private List headers;
    private final boolean isObservable;
    private final boolean isSynchronous;
    private final MultipartTypedOutput multipartBody = null;
    private final String paramNames[];
    private final RestMethodInfo.ParamUsage paramUsages[];
    private StringBuilder queryParams;
    private String relativeUrl;
    private final String requestMethod;

    RequestBuilder(String s, RestMethodInfo restmethodinfo, Converter converter1)
    {
        apiUrl = s;
        converter = converter1;
        paramNames = restmethodinfo.requestParamNames;
        paramUsages = restmethodinfo.requestParamUsage;
        requestMethod = restmethodinfo.requestMethod;
        isSynchronous = restmethodinfo.isSynchronous;
        isObservable = restmethodinfo.isObservable;
        if (restmethodinfo.headers != null)
        {
            headers = new ArrayList(restmethodinfo.headers);
        }
        contentTypeHeader = restmethodinfo.contentTypeHeader;
        relativeUrl = restmethodinfo.requestUrl;
        s = restmethodinfo.requestQuery;
        if (s != null)
        {
            queryParams = (new StringBuilder()).append('?').append(s);
        }
        switch (_cls1..SwitchMap.retrofit.RestMethodInfo.RequestType[restmethodinfo.requestType.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown request type: ").append(restmethodinfo.requestType).toString());

        case 1: // '\001'
            formBody = new FormUrlEncodedTypedOutput();
            multipartBody = null;
            body = formBody;
            return;

        case 2: // '\002'
            formBody = null;
            multipartBody = new MultipartTypedOutput();
            body = multipartBody;
            return;

        case 3: // '\003'
            formBody = null;
            break;
        }
    }

    private void addPathParam(String s, String s1, boolean flag)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Path replacement name must not be null.");
        }
        if (s1 == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Path replacement \"").append(s).append("\" value must not be null.").toString());
        }
        if (flag)
        {
            try
            {
                String s2 = URLEncoder.encode(String.valueOf(s1), "UTF-8").replace("+", "%20");
                relativeUrl = relativeUrl.replace((new StringBuilder()).append("{").append(s).append("}").toString(), s2);
                return;
            }
            catch (UnsupportedEncodingException unsupportedencodingexception)
            {
                throw new RuntimeException((new StringBuilder()).append("Unable to convert path parameter \"").append(s).append("\" value to UTF-8:").append(s1).toString(), unsupportedencodingexception);
            }
        }
        relativeUrl = relativeUrl.replace((new StringBuilder()).append("{").append(s).append("}").toString(), String.valueOf(s1));
        return;
    }

    private void addQueryParam(String s, String s1, boolean flag)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Query param name must not be null.");
        }
        if (s1 == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Query param \"").append(s).append("\" value must not be null.").toString());
        }
        String s2 = s1;
        if (flag)
        {
            String s3 = s1;
            char c;
            try
            {
                s2 = URLEncoder.encode(String.valueOf(s1), "UTF-8");
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw new RuntimeException((new StringBuilder()).append("Unable to convert query parameter \"").append(s).append("\" value to UTF-8: ").append(s3).toString(), s1);
            }
        }
        s3 = s2;
        s1 = queryParams;
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        s3 = s2;
        s1 = new StringBuilder();
        s3 = s2;
        queryParams = s1;
        s3 = s2;
        if (s1.length() > 0)
        {
            c = '&';
        } else
        {
            c = '?';
        }
        s3 = s2;
        s1.append(c);
        s3 = s2;
        s1.append(s).append('=').append(s2);
        return;
    }

    public void addEncodedPathParam(String s, String s1)
    {
        addPathParam(s, s1, false);
    }

    public void addEncodedQueryParam(String s, String s1)
    {
        addQueryParam(s, s1, false);
    }

    public void addHeader(String s, String s1)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Header name must not be null.");
        }
        if ("Content-Type".equalsIgnoreCase(s))
        {
            contentTypeHeader = s1;
            return;
        }
        List list = headers;
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList(2);
            headers = ((List) (obj));
        }
        ((List) (obj)).add(new Header(s, s1));
    }

    public void addPathParam(String s, String s1)
    {
        addPathParam(s, s1, true);
    }

    public void addQueryParam(String s, String s1)
    {
        addQueryParam(s, s1, true);
    }

    Request build()
    {
        if (multipartBody != null && multipartBody.getPartCount() == 0)
        {
            throw new IllegalStateException("Multipart requests must contain at least one part.");
        }
        Object obj = apiUrl;
        StringBuilder stringbuilder = new StringBuilder(((String) (obj)));
        if (((String) (obj)).endsWith("/"))
        {
            stringbuilder.deleteCharAt(stringbuilder.length() - 1);
        }
        stringbuilder.append(relativeUrl);
        obj = queryParams;
        if (obj != null)
        {
            stringbuilder.append(((CharSequence) (obj)));
        }
        obj = body;
        if (obj != null && contentTypeHeader != null)
        {
            obj = new MimeOverridingTypedOutput(((TypedOutput) (obj)), contentTypeHeader);
        }
        return new Request(requestMethod, stringbuilder.toString(), headers, ((TypedOutput) (obj)));
    }

    void setArguments(Object aobj[])
    {
        if (aobj != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i;
        int j;
        i = aobj.length;
        if (!isSynchronous && !isObservable)
        {
            i--;
        }
        j = 0;
_L15:
        if (j >= i) goto _L1; else goto _L3
_L3:
        Object obj;
        Object obj1;
        Object obj2;
        obj = paramNames[j];
        obj1 = aobj[j];
        obj2 = paramUsages[j];
        _cls1..SwitchMap.retrofit.RestMethodInfo.ParamUsage[((RestMethodInfo.ParamUsage) (obj2)).ordinal()];
        JVM INSTR tableswitch 1 12: default 132
    //                   1 161
    //                   2 216
    //                   3 265
    //                   4 265
    //                   5 414
    //                   6 414
    //                   7 505
    //                   8 521
    //                   9 656
    //                   10 731
    //                   11 807
    //                   12 948;
           goto _L4 _L5 _L6 _L7 _L7 _L8 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L14:
        break MISSING_BLOCK_LABEL_948;
_L4:
        throw new IllegalArgumentException((new StringBuilder()).append("Unknown parameter usage: ").append(obj2).toString());
_L5:
        if (obj1 == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Path parameter \"").append(((String) (obj))).append("\" value must not be null.").toString());
        }
        addPathParam(((String) (obj)), obj1.toString());
_L16:
        j++;
          goto _L15
_L6:
        if (obj1 == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Path parameter \"").append(((String) (obj))).append("\" value must not be null.").toString());
        }
        addEncodedPathParam(((String) (obj)), obj1.toString());
          goto _L16
_L7:
        if (obj1 != null)
        {
            boolean flag;
            if (obj2 == RestMethodInfo.ParamUsage.QUERY)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (obj1 instanceof Iterable)
            {
                obj1 = ((Iterable)obj1).iterator();
                while (((Iterator) (obj1)).hasNext()) 
                {
                    obj2 = ((Iterator) (obj1)).next();
                    if (obj2 != null)
                    {
                        addQueryParam(((String) (obj)), obj2.toString(), flag);
                    }
                }
            } else
            if (obj1.getClass().isArray())
            {
                int i1 = Array.getLength(obj1);
                int k = 0;
                while (k < i1) 
                {
                    obj2 = Array.get(obj1, k);
                    if (obj2 != null)
                    {
                        addQueryParam(((String) (obj)), obj2.toString(), flag);
                    }
                    k++;
                }
            } else
            {
                addQueryParam(((String) (obj)), obj1.toString(), flag);
            }
        }
          goto _L16
_L8:
        if (obj1 != null)
        {
            boolean flag1;
            if (obj2 == RestMethodInfo.ParamUsage.QUERY_MAP)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            obj = ((Map)obj1).entrySet().iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                obj1 = (java.util.Map.Entry)((Iterator) (obj)).next();
                Object obj3 = ((java.util.Map.Entry) (obj1)).getValue();
                if (obj3 != null)
                {
                    addQueryParam(((java.util.Map.Entry) (obj1)).getKey().toString(), obj3.toString(), flag1);
                }
            }
        }
          goto _L16
_L9:
        if (obj1 != null)
        {
            addHeader(((String) (obj)), obj1.toString());
        }
          goto _L16
_L10:
        if (obj1 != null)
        {
            if (obj1 instanceof Iterable)
            {
                obj1 = ((Iterable)obj1).iterator();
                while (((Iterator) (obj1)).hasNext()) 
                {
                    Object obj4 = ((Iterator) (obj1)).next();
                    if (obj4 != null)
                    {
                        formBody.addField(((String) (obj)), obj4.toString());
                    }
                }
            } else
            if (obj1.getClass().isArray())
            {
                int j1 = Array.getLength(obj1);
                int l = 0;
                while (l < j1) 
                {
                    Object obj5 = Array.get(obj1, l);
                    if (obj5 != null)
                    {
                        formBody.addField(((String) (obj)), obj5.toString());
                    }
                    l++;
                }
            } else
            {
                formBody.addField(((String) (obj)), obj1.toString());
            }
        }
          goto _L16
_L11:
        if (obj1 != null)
        {
            obj = ((Map)obj1).entrySet().iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                obj1 = (java.util.Map.Entry)((Iterator) (obj)).next();
                Object obj6 = ((java.util.Map.Entry) (obj1)).getValue();
                if (obj6 != null)
                {
                    formBody.addField(((java.util.Map.Entry) (obj1)).getKey().toString(), obj6.toString());
                }
            }
        }
          goto _L16
_L12:
        if (obj1 != null)
        {
            if (obj1 instanceof TypedOutput)
            {
                multipartBody.addPart(((String) (obj)), (TypedOutput)obj1);
            } else
            if (obj1 instanceof String)
            {
                multipartBody.addPart(((String) (obj)), new TypedString((String)obj1));
            } else
            {
                multipartBody.addPart(((String) (obj)), converter.toBody(obj1));
            }
        }
          goto _L16
_L13:
        if (obj1 != null)
        {
            Iterator iterator = ((Map)obj1).entrySet().iterator();
            while (iterator.hasNext()) 
            {
                Object obj7 = (java.util.Map.Entry)iterator.next();
                obj1 = ((java.util.Map.Entry) (obj7)).getKey().toString();
                obj7 = ((java.util.Map.Entry) (obj7)).getValue();
                if (obj7 != null)
                {
                    if (obj7 instanceof TypedOutput)
                    {
                        multipartBody.addPart(((String) (obj1)), (TypedOutput)obj7);
                    } else
                    if (obj7 instanceof String)
                    {
                        multipartBody.addPart(((String) (obj1)), new TypedString((String)obj7));
                    } else
                    {
                        multipartBody.addPart(((String) (obj1)), converter.toBody(obj7));
                    }
                }
            }
        }
          goto _L16
        if (obj1 == null)
        {
            throw new IllegalArgumentException("Body parameter value must not be null.");
        }
        if (obj1 instanceof TypedOutput)
        {
            body = (TypedOutput)obj1;
        } else
        {
            body = converter.toBody(obj1);
        }
          goto _L16
    }

    private class _cls1
    {

        static final int $SwitchMap$retrofit$RestMethodInfo$ParamUsage[];
        static final int $SwitchMap$retrofit$RestMethodInfo$RequestType[];

        static 
        {
            $SwitchMap$retrofit$RestMethodInfo$ParamUsage = new int[RestMethodInfo.ParamUsage.values().length];
            try
            {
                $SwitchMap$retrofit$RestMethodInfo$ParamUsage[RestMethodInfo.ParamUsage.PATH.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror14) { }
            try
            {
                $SwitchMap$retrofit$RestMethodInfo$ParamUsage[RestMethodInfo.ParamUsage.ENCODED_PATH.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror13) { }
            try
            {
                $SwitchMap$retrofit$RestMethodInfo$ParamUsage[RestMethodInfo.ParamUsage.QUERY.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror12) { }
            try
            {
                $SwitchMap$retrofit$RestMethodInfo$ParamUsage[RestMethodInfo.ParamUsage.ENCODED_QUERY.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror11) { }
            try
            {
                $SwitchMap$retrofit$RestMethodInfo$ParamUsage[RestMethodInfo.ParamUsage.QUERY_MAP.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror10) { }
            try
            {
                $SwitchMap$retrofit$RestMethodInfo$ParamUsage[RestMethodInfo.ParamUsage.ENCODED_QUERY_MAP.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror9) { }
            try
            {
                $SwitchMap$retrofit$RestMethodInfo$ParamUsage[RestMethodInfo.ParamUsage.HEADER.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror8) { }
            try
            {
                $SwitchMap$retrofit$RestMethodInfo$ParamUsage[RestMethodInfo.ParamUsage.FIELD.ordinal()] = 8;
            }
            catch (NoSuchFieldError nosuchfielderror7) { }
            try
            {
                $SwitchMap$retrofit$RestMethodInfo$ParamUsage[RestMethodInfo.ParamUsage.FIELD_MAP.ordinal()] = 9;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                $SwitchMap$retrofit$RestMethodInfo$ParamUsage[RestMethodInfo.ParamUsage.PART.ordinal()] = 10;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                $SwitchMap$retrofit$RestMethodInfo$ParamUsage[RestMethodInfo.ParamUsage.PART_MAP.ordinal()] = 11;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$retrofit$RestMethodInfo$ParamUsage[RestMethodInfo.ParamUsage.BODY.ordinal()] = 12;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            $SwitchMap$retrofit$RestMethodInfo$RequestType = new int[RestMethodInfo.RequestType.values().length];
            try
            {
                $SwitchMap$retrofit$RestMethodInfo$RequestType[RestMethodInfo.RequestType.FORM_URL_ENCODED.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$retrofit$RestMethodInfo$RequestType[RestMethodInfo.RequestType.MULTIPART.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$retrofit$RestMethodInfo$RequestType[RestMethodInfo.RequestType.SIMPLE.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class MimeOverridingTypedOutput
        implements TypedOutput
    {

        private final TypedOutput _flddelegate;
        private final String mimeType;

        public String fileName()
        {
            return _flddelegate.fileName();
        }

        public long length()
        {
            return _flddelegate.length();
        }

        public String mimeType()
        {
            return mimeType;
        }

        public void writeTo(OutputStream outputstream)
        {
            _flddelegate.writeTo(outputstream);
        }

        MimeOverridingTypedOutput(TypedOutput typedoutput, String s)
        {
            _flddelegate = typedoutput;
            mimeType = s;
        }
    }

}
