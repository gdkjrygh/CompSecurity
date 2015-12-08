// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.node;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.TypeSerializer;

// Referenced classes of package org.codehaus.jackson.node:
//            ContainerNode, ObjectNode, MissingNode, BaseJsonNode, 
//            JsonNodeFactory

public final class ArrayNode extends ContainerNode
{

    protected ArrayList _children;

    public ArrayNode(JsonNodeFactory jsonnodefactory)
    {
        super(jsonnodefactory);
    }

    private void _add(JsonNode jsonnode)
    {
        if (_children == null)
        {
            _children = new ArrayList();
        }
        _children.add(jsonnode);
    }

    private void _insert(int i, JsonNode jsonnode)
    {
        if (_children == null)
        {
            _children = new ArrayList();
            _children.add(jsonnode);
            return;
        }
        if (i < 0)
        {
            _children.add(0, jsonnode);
            return;
        }
        if (i >= _children.size())
        {
            _children.add(jsonnode);
            return;
        } else
        {
            _children.add(i, jsonnode);
            return;
        }
    }

    private boolean _sameChildren(ArrayList arraylist)
    {
        int j = arraylist.size();
        if (size() != j)
        {
            return false;
        }
        for (int i = 0; i < j; i++)
        {
            if (!((JsonNode)_children.get(i)).equals(arraylist.get(i)))
            {
                return false;
            }
        }

        return true;
    }

    public JsonNode _set(int i, JsonNode jsonnode)
    {
        if (_children == null || i < 0 || i >= _children.size())
        {
            throw new IndexOutOfBoundsException((new StringBuilder()).append("Illegal index ").append(i).append(", array size ").append(size()).toString());
        } else
        {
            return (JsonNode)_children.set(i, jsonnode);
        }
    }

    public void add(double d)
    {
        _add(numberNode(d));
    }

    public void add(float f)
    {
        _add(numberNode(f));
    }

    public void add(int i)
    {
        _add(numberNode(i));
    }

    public void add(long l)
    {
        _add(numberNode(l));
    }

    public void add(Boolean boolean1)
    {
        if (boolean1 == null)
        {
            addNull();
            return;
        } else
        {
            _add(booleanNode(boolean1.booleanValue()));
            return;
        }
    }

    public void add(Double double1)
    {
        if (double1 == null)
        {
            addNull();
            return;
        } else
        {
            _add(numberNode(double1.doubleValue()));
            return;
        }
    }

    public void add(Float float1)
    {
        if (float1 == null)
        {
            addNull();
            return;
        } else
        {
            _add(numberNode(float1.floatValue()));
            return;
        }
    }

    public void add(Integer integer)
    {
        if (integer == null)
        {
            addNull();
            return;
        } else
        {
            _add(numberNode(integer.intValue()));
            return;
        }
    }

    public void add(Long long1)
    {
        if (long1 == null)
        {
            addNull();
            return;
        } else
        {
            _add(numberNode(long1.longValue()));
            return;
        }
    }

    public void add(String s)
    {
        if (s == null)
        {
            addNull();
            return;
        } else
        {
            _add(textNode(s));
            return;
        }
    }

    public void add(BigDecimal bigdecimal)
    {
        if (bigdecimal == null)
        {
            addNull();
            return;
        } else
        {
            _add(numberNode(bigdecimal));
            return;
        }
    }

    public void add(JsonNode jsonnode)
    {
        Object obj = jsonnode;
        if (jsonnode == null)
        {
            obj = nullNode();
        }
        _add(((JsonNode) (obj)));
    }

    public void add(boolean flag)
    {
        _add(booleanNode(flag));
    }

    public void add(byte abyte0[])
    {
        if (abyte0 == null)
        {
            addNull();
            return;
        } else
        {
            _add(binaryNode(abyte0));
            return;
        }
    }

    public JsonNode addAll(Collection collection)
    {
label0:
        {
            if (collection.size() > 0)
            {
                if (_children != null)
                {
                    break label0;
                }
                _children = new ArrayList(collection);
            }
            return this;
        }
        _children.addAll(collection);
        return this;
    }

    public JsonNode addAll(ArrayNode arraynode)
    {
        int i = arraynode.size();
        if (i > 0)
        {
            if (_children == null)
            {
                _children = new ArrayList(i + 2);
            }
            arraynode.addContentsTo(_children);
        }
        return this;
    }

    public ArrayNode addArray()
    {
        ArrayNode arraynode = arrayNode();
        _add(arraynode);
        return arraynode;
    }

    protected void addContentsTo(List list)
    {
        if (_children != null)
        {
            for (Iterator iterator = _children.iterator(); iterator.hasNext(); list.add((JsonNode)iterator.next())) { }
        }
    }

    public void addNull()
    {
        _add(nullNode());
    }

    public ObjectNode addObject()
    {
        ObjectNode objectnode = objectNode();
        _add(objectnode);
        return objectnode;
    }

    public void addPOJO(Object obj)
    {
        if (obj == null)
        {
            addNull();
            return;
        } else
        {
            _add(POJONode(obj));
            return;
        }
    }

    public JsonToken asToken()
    {
        return JsonToken.START_ARRAY;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj == null)
            {
                return false;
            }
            if (obj.getClass() != getClass())
            {
                return false;
            }
            obj = (ArrayNode)obj;
            if (_children == null || _children.size() == 0)
            {
                if (((ArrayNode) (obj)).size() != 0)
                {
                    return false;
                }
            } else
            {
                return ((ArrayNode) (obj))._sameChildren(_children);
            }
        }
        return true;
    }

    public volatile JsonNode findParent(String s)
    {
        return findParent(s);
    }

    public ObjectNode findParent(String s)
    {
label0:
        {
            if (_children == null)
            {
                break label0;
            }
            Iterator iterator = _children.iterator();
            JsonNode jsonnode;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                jsonnode = ((JsonNode)iterator.next()).findParent(s);
            } while (jsonnode == null);
            return (ObjectNode)jsonnode;
        }
        return null;
    }

    public List findParents(String s, List list)
    {
        List list1 = list;
        if (_children != null)
        {
            Iterator iterator = _children.iterator();
            do
            {
                list1 = list;
                if (!iterator.hasNext())
                {
                    break;
                }
                list = ((JsonNode)iterator.next()).findParents(s, list);
            } while (true);
        }
        return list1;
    }

    public JsonNode findValue(String s)
    {
label0:
        {
            if (_children == null)
            {
                break label0;
            }
            Iterator iterator = _children.iterator();
            JsonNode jsonnode;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                jsonnode = ((JsonNode)iterator.next()).findValue(s);
            } while (jsonnode == null);
            return jsonnode;
        }
        return null;
    }

    public List findValues(String s, List list)
    {
        List list1 = list;
        if (_children != null)
        {
            Iterator iterator = _children.iterator();
            do
            {
                list1 = list;
                if (!iterator.hasNext())
                {
                    break;
                }
                list = ((JsonNode)iterator.next()).findValues(s, list);
            } while (true);
        }
        return list1;
    }

    public List findValuesAsText(String s, List list)
    {
        List list1 = list;
        if (_children != null)
        {
            Iterator iterator = _children.iterator();
            do
            {
                list1 = list;
                if (!iterator.hasNext())
                {
                    break;
                }
                list = ((JsonNode)iterator.next()).findValuesAsText(s, list);
            } while (true);
        }
        return list1;
    }

    public JsonNode get(int i)
    {
        if (i >= 0 && _children != null && i < _children.size())
        {
            return (JsonNode)_children.get(i);
        } else
        {
            return null;
        }
    }

    public JsonNode get(String s)
    {
        return null;
    }

    public Iterator getElements()
    {
        if (_children == null)
        {
            return ContainerNode.NoNodesIterator.instance();
        } else
        {
            return _children.iterator();
        }
    }

    public int hashCode()
    {
        if (_children != null) goto _L2; else goto _L1
_L1:
        int j = 1;
_L4:
        return j;
_L2:
        int i = _children.size();
        Iterator iterator = _children.iterator();
        do
        {
            j = i;
            if (!iterator.hasNext())
            {
                continue;
            }
            JsonNode jsonnode = (JsonNode)iterator.next();
            if (jsonnode != null)
            {
                i ^= jsonnode.hashCode();
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void insert(int i, double d)
    {
        _insert(i, numberNode(d));
    }

    public void insert(int i, float f)
    {
        _insert(i, numberNode(f));
    }

    public void insert(int i, int j)
    {
        _insert(i, numberNode(j));
    }

    public void insert(int i, long l)
    {
        _insert(i, numberNode(l));
    }

    public void insert(int i, Boolean boolean1)
    {
        if (boolean1 == null)
        {
            insertNull(i);
            return;
        } else
        {
            _insert(i, booleanNode(boolean1.booleanValue()));
            return;
        }
    }

    public void insert(int i, Double double1)
    {
        if (double1 == null)
        {
            insertNull(i);
            return;
        } else
        {
            _insert(i, numberNode(double1.doubleValue()));
            return;
        }
    }

    public void insert(int i, Float float1)
    {
        if (float1 == null)
        {
            insertNull(i);
            return;
        } else
        {
            _insert(i, numberNode(float1.floatValue()));
            return;
        }
    }

    public void insert(int i, Integer integer)
    {
        if (integer == null)
        {
            insertNull(i);
            return;
        } else
        {
            _insert(i, numberNode(integer.intValue()));
            return;
        }
    }

    public void insert(int i, Long long1)
    {
        if (long1 == null)
        {
            insertNull(i);
            return;
        } else
        {
            _insert(i, numberNode(long1.longValue()));
            return;
        }
    }

    public void insert(int i, String s)
    {
        if (s == null)
        {
            insertNull(i);
            return;
        } else
        {
            _insert(i, textNode(s));
            return;
        }
    }

    public void insert(int i, BigDecimal bigdecimal)
    {
        if (bigdecimal == null)
        {
            insertNull(i);
            return;
        } else
        {
            _insert(i, numberNode(bigdecimal));
            return;
        }
    }

    public void insert(int i, JsonNode jsonnode)
    {
        Object obj = jsonnode;
        if (jsonnode == null)
        {
            obj = nullNode();
        }
        _insert(i, ((JsonNode) (obj)));
    }

    public void insert(int i, boolean flag)
    {
        _insert(i, booleanNode(flag));
    }

    public void insert(int i, byte abyte0[])
    {
        if (abyte0 == null)
        {
            insertNull(i);
            return;
        } else
        {
            _insert(i, binaryNode(abyte0));
            return;
        }
    }

    public ArrayNode insertArray(int i)
    {
        ArrayNode arraynode = arrayNode();
        _insert(i, arraynode);
        return arraynode;
    }

    public void insertNull(int i)
    {
        _insert(i, nullNode());
    }

    public ObjectNode insertObject(int i)
    {
        ObjectNode objectnode = objectNode();
        _insert(i, objectnode);
        return objectnode;
    }

    public void insertPOJO(int i, Object obj)
    {
        if (obj == null)
        {
            insertNull(i);
            return;
        } else
        {
            _insert(i, POJONode(obj));
            return;
        }
    }

    public boolean isArray()
    {
        return true;
    }

    public JsonNode path(int i)
    {
        if (i >= 0 && _children != null && i < _children.size())
        {
            return (JsonNode)_children.get(i);
        } else
        {
            return MissingNode.getInstance();
        }
    }

    public JsonNode path(String s)
    {
        return MissingNode.getInstance();
    }

    public JsonNode remove(int i)
    {
        if (i >= 0 && _children != null && i < _children.size())
        {
            return (JsonNode)_children.remove(i);
        } else
        {
            return null;
        }
    }

    public ArrayNode removeAll()
    {
        _children = null;
        return this;
    }

    public volatile ContainerNode removeAll()
    {
        return removeAll();
    }

    public final void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonProcessingException
    {
        jsongenerator.writeStartArray();
        if (_children != null)
        {
            for (Iterator iterator = _children.iterator(); iterator.hasNext(); ((BaseJsonNode)(JsonNode)iterator.next()).serialize(jsongenerator, serializerprovider)) { }
        }
        jsongenerator.writeEndArray();
    }

    public void serializeWithType(JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException, JsonProcessingException
    {
        typeserializer.writeTypePrefixForArray(this, jsongenerator);
        if (_children != null)
        {
            for (Iterator iterator = _children.iterator(); iterator.hasNext(); ((BaseJsonNode)(JsonNode)iterator.next()).serialize(jsongenerator, serializerprovider)) { }
        }
        typeserializer.writeTypeSuffixForArray(this, jsongenerator);
    }

    public JsonNode set(int i, JsonNode jsonnode)
    {
        Object obj = jsonnode;
        if (jsonnode == null)
        {
            obj = nullNode();
        }
        return _set(i, ((JsonNode) (obj)));
    }

    public int size()
    {
        if (_children == null)
        {
            return 0;
        } else
        {
            return _children.size();
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder((size() << 4) + 16);
        stringbuilder.append('[');
        if (_children != null)
        {
            int i = 0;
            for (int j = _children.size(); i < j; i++)
            {
                if (i > 0)
                {
                    stringbuilder.append(',');
                }
                stringbuilder.append(((JsonNode)_children.get(i)).toString());
            }

        }
        stringbuilder.append(']');
        return stringbuilder.toString();
    }
}
