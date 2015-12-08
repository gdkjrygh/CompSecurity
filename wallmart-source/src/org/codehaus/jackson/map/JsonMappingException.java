// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.codehaus.jackson.JsonLocation;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;

public class JsonMappingException extends JsonProcessingException
{

    static final int MAX_REFS_TO_LIST = 1000;
    private static final long serialVersionUID = 1L;
    protected LinkedList _path;

    public JsonMappingException(String s)
    {
        super(s);
    }

    public JsonMappingException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public JsonMappingException(String s, JsonLocation jsonlocation)
    {
        super(s, jsonlocation);
    }

    public JsonMappingException(String s, JsonLocation jsonlocation, Throwable throwable)
    {
        super(s, jsonlocation, throwable);
    }

    public static JsonMappingException from(JsonParser jsonparser, String s)
    {
        return new JsonMappingException(s, jsonparser.getTokenLocation());
    }

    public static JsonMappingException from(JsonParser jsonparser, String s, Throwable throwable)
    {
        return new JsonMappingException(s, jsonparser.getTokenLocation(), throwable);
    }

    public static JsonMappingException wrapWithPath(Throwable throwable, Object obj, int i)
    {
    /* block-local class not found */
    class Reference {}

        return wrapWithPath(throwable, new Reference(obj, i));
    }

    public static JsonMappingException wrapWithPath(Throwable throwable, Object obj, String s)
    {
        return wrapWithPath(throwable, new Reference(obj, s));
    }

    public static JsonMappingException wrapWithPath(Throwable throwable, Reference reference)
    {
        if (!(throwable instanceof JsonMappingException)) goto _L2; else goto _L1
_L1:
        throwable = (JsonMappingException)throwable;
_L4:
        throwable.prependPath(reference);
        return throwable;
_L2:
        String s;
label0:
        {
            String s1 = throwable.getMessage();
            if (s1 != null)
            {
                s = s1;
                if (s1.length() != 0)
                {
                    break label0;
                }
            }
            s = (new StringBuilder()).append("(was ").append(throwable.getClass().getName()).append(")").toString();
        }
        throwable = new JsonMappingException(s, null, throwable);
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void _appendPathDesc(StringBuilder stringbuilder)
    {
        Iterator iterator = _path.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            stringbuilder.append(((Reference)iterator.next()).toString());
            if (iterator.hasNext())
            {
                stringbuilder.append("->");
            }
        } while (true);
    }

    public String getMessage()
    {
        Object obj = super.getMessage();
        if (_path == null)
        {
            return ((String) (obj));
        }
        if (obj == null)
        {
            obj = new StringBuilder();
        } else
        {
            obj = new StringBuilder(((String) (obj)));
        }
        ((StringBuilder) (obj)).append(" (through reference chain: ");
        _appendPathDesc(((StringBuilder) (obj)));
        ((StringBuilder) (obj)).append(')');
        return ((StringBuilder) (obj)).toString();
    }

    public List getPath()
    {
        if (_path == null)
        {
            return Collections.emptyList();
        } else
        {
            return Collections.unmodifiableList(_path);
        }
    }

    public void prependPath(Object obj, int i)
    {
        prependPath(new Reference(obj, i));
    }

    public void prependPath(Object obj, String s)
    {
        prependPath(new Reference(obj, s));
    }

    public void prependPath(Reference reference)
    {
        if (_path == null)
        {
            _path = new LinkedList();
        }
        if (_path.size() < 1000)
        {
            _path.addFirst(reference);
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getName()).append(": ").append(getMessage()).toString();
    }
}
