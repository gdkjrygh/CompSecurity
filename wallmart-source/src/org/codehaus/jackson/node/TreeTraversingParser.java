// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.node;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.codehaus.jackson.Base64Variant;
import org.codehaus.jackson.JsonLocation;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonStreamContext;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.ObjectCodec;
import org.codehaus.jackson.impl.JsonParserMinimalBase;

// Referenced classes of package org.codehaus.jackson.node:
//            NodeCursor, POJONode, BinaryNode

public class TreeTraversingParser extends JsonParserMinimalBase
{

    protected boolean _closed;
    protected JsonToken _nextToken;
    protected NodeCursor _nodeCursor;
    protected ObjectCodec _objectCodec;
    protected boolean _startContainer;

    public TreeTraversingParser(JsonNode jsonnode)
    {
        this(jsonnode, null);
    }

    public TreeTraversingParser(JsonNode jsonnode, ObjectCodec objectcodec)
    {
        super(0);
        _objectCodec = objectcodec;
        if (jsonnode.isArray())
        {
            _nextToken = JsonToken.START_ARRAY;
            _nodeCursor = new NodeCursor.Array(jsonnode, null);
            return;
        }
        if (jsonnode.isObject())
        {
            _nextToken = JsonToken.START_OBJECT;
            _nodeCursor = new NodeCursor.Object(jsonnode, null);
            return;
        } else
        {
            _nodeCursor = new NodeCursor.RootValue(jsonnode, null);
            return;
        }
    }

    protected void _handleEOF()
        throws JsonParseException
    {
        _throwInternal();
    }

    public void close()
        throws IOException
    {
        if (!_closed)
        {
            _closed = true;
            _nodeCursor = null;
            _currToken = null;
        }
    }

    protected JsonNode currentNode()
    {
        if (_closed || _nodeCursor == null)
        {
            return null;
        } else
        {
            return _nodeCursor.currentNode();
        }
    }

    protected JsonNode currentNumericNode()
        throws JsonParseException
    {
        Object obj = currentNode();
        if (obj == null || !((JsonNode) (obj)).isNumber())
        {
            if (obj == null)
            {
                obj = null;
            } else
            {
                obj = ((JsonNode) (obj)).asToken();
            }
            throw _constructError((new StringBuilder()).append("Current token (").append(obj).append(") not numeric, can not use numeric value accessors").toString());
        } else
        {
            return ((JsonNode) (obj));
        }
    }

    public BigInteger getBigIntegerValue()
        throws IOException, JsonParseException
    {
        return currentNumericNode().getBigIntegerValue();
    }

    public byte[] getBinaryValue(Base64Variant base64variant)
        throws IOException, JsonParseException
    {
        base64variant = currentNode();
        if (base64variant != null)
        {
            byte abyte0[] = base64variant.getBinaryValue();
            if (abyte0 != null)
            {
                return abyte0;
            }
            if (base64variant.isPojo())
            {
                base64variant = ((Base64Variant) (((POJONode)base64variant).getPojo()));
                if (base64variant instanceof byte[])
                {
                    return (byte[])(byte[])base64variant;
                }
            }
        }
        return null;
    }

    public ObjectCodec getCodec()
    {
        return _objectCodec;
    }

    public JsonLocation getCurrentLocation()
    {
        return JsonLocation.NA;
    }

    public String getCurrentName()
    {
        if (_nodeCursor == null)
        {
            return null;
        } else
        {
            return _nodeCursor.getCurrentName();
        }
    }

    public BigDecimal getDecimalValue()
        throws IOException, JsonParseException
    {
        return currentNumericNode().getDecimalValue();
    }

    public double getDoubleValue()
        throws IOException, JsonParseException
    {
        return currentNumericNode().getDoubleValue();
    }

    public Object getEmbeddedObject()
    {
        if (!_closed)
        {
            JsonNode jsonnode = currentNode();
            if (jsonnode != null)
            {
                if (jsonnode.isPojo())
                {
                    return ((POJONode)jsonnode).getPojo();
                }
                if (jsonnode.isBinary())
                {
                    return ((BinaryNode)jsonnode).getBinaryValue();
                }
            }
        }
        return null;
    }

    public float getFloatValue()
        throws IOException, JsonParseException
    {
        return (float)currentNumericNode().getDoubleValue();
    }

    public int getIntValue()
        throws IOException, JsonParseException
    {
        return currentNumericNode().getIntValue();
    }

    public long getLongValue()
        throws IOException, JsonParseException
    {
        return currentNumericNode().getLongValue();
    }

    public org.codehaus.jackson.JsonParser.NumberType getNumberType()
        throws IOException, JsonParseException
    {
        JsonNode jsonnode = currentNumericNode();
        if (jsonnode == null)
        {
            return null;
        } else
        {
            return jsonnode.getNumberType();
        }
    }

    public Number getNumberValue()
        throws IOException, JsonParseException
    {
        return currentNumericNode().getNumberValue();
    }

    public JsonStreamContext getParsingContext()
    {
        return _nodeCursor;
    }

    public String getText()
    {
        if (!_closed) goto _L2; else goto _L1
_L1:
        return null;
_L2:
    /* anonymous class not found */
    class _anm1 {}

        _cls1..SwitchMap.org.codehaus.jackson.JsonToken[_currToken.ordinal()];
        JVM INSTR tableswitch 1 5: default 56
    //                   1 71
    //                   2 79
    //                   3 87
    //                   4 87
    //                   5 98;
           goto _L3 _L4 _L5 _L6 _L6 _L7
_L3:
        if (_currToken != null)
        {
            return _currToken.asString();
        }
          goto _L8
_L4:
        return _nodeCursor.getCurrentName();
_L5:
        return currentNode().getTextValue();
_L6:
        return String.valueOf(currentNode().getNumberValue());
_L7:
        JsonNode jsonnode = currentNode();
        if (jsonnode != null && jsonnode.isBinary())
        {
            return jsonnode.asText();
        }
        if (true) goto _L3; else goto _L8
_L8:
        if (true) goto _L1; else goto _L9
_L9:
    }

    public char[] getTextCharacters()
        throws IOException, JsonParseException
    {
        return getText().toCharArray();
    }

    public int getTextLength()
        throws IOException, JsonParseException
    {
        return getText().length();
    }

    public int getTextOffset()
        throws IOException, JsonParseException
    {
        return 0;
    }

    public JsonLocation getTokenLocation()
    {
        return JsonLocation.NA;
    }

    public boolean hasTextCharacters()
    {
        return false;
    }

    public boolean isClosed()
    {
        return _closed;
    }

    public JsonToken nextToken()
        throws IOException, JsonParseException
    {
        if (_nextToken != null)
        {
            _currToken = _nextToken;
            _nextToken = null;
            return _currToken;
        }
        if (_startContainer)
        {
            _startContainer = false;
            if (!_nodeCursor.currentHasChildren())
            {
                JsonToken jsontoken;
                if (_currToken == JsonToken.START_OBJECT)
                {
                    jsontoken = JsonToken.END_OBJECT;
                } else
                {
                    jsontoken = JsonToken.END_ARRAY;
                }
                _currToken = jsontoken;
                return _currToken;
            }
            _nodeCursor = _nodeCursor.iterateChildren();
            _currToken = _nodeCursor.nextToken();
            if (_currToken == JsonToken.START_OBJECT || _currToken == JsonToken.START_ARRAY)
            {
                _startContainer = true;
            }
            return _currToken;
        }
        if (_nodeCursor == null)
        {
            _closed = true;
            return null;
        }
        _currToken = _nodeCursor.nextToken();
        if (_currToken != null)
        {
            if (_currToken == JsonToken.START_OBJECT || _currToken == JsonToken.START_ARRAY)
            {
                _startContainer = true;
            }
            return _currToken;
        } else
        {
            _currToken = _nodeCursor.endToken();
            _nodeCursor = _nodeCursor.getParent();
            return _currToken;
        }
    }

    public void setCodec(ObjectCodec objectcodec)
    {
        _objectCodec = objectcodec;
    }

    public JsonParser skipChildren()
        throws IOException, JsonParseException
    {
        if (_currToken == JsonToken.START_OBJECT)
        {
            _startContainer = false;
            _currToken = JsonToken.END_OBJECT;
        } else
        if (_currToken == JsonToken.START_ARRAY)
        {
            _startContainer = false;
            _currToken = JsonToken.END_ARRAY;
            return this;
        }
        return this;
    }
}
