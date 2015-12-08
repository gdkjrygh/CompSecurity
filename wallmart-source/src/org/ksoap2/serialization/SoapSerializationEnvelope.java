// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.ksoap2.serialization;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.SoapFault;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

// Referenced classes of package org.ksoap2.serialization:
//            DM, PropertyInfo, Marshal, SoapObject, 
//            KvmSerializable, SoapPrimitive, FwdRef, AttributeInfo

public class SoapSerializationEnvelope extends SoapEnvelope
{

    private static final String ANY_TYPE_LABEL = "anyType";
    private static final String ARRAY_MAPPING_NAME = "Array";
    private static final String ARRAY_TYPE_LABEL = "arrayType";
    static final Marshal DEFAULT_MARSHAL = new DM();
    private static final String HREF_LABEL = "href";
    private static final String ID_LABEL = "id";
    private static final String ITEM_LABEL = "item";
    private static final String NIL_LABEL = "nil";
    private static final String NULL_LABEL = "null";
    protected static final int QNAME_MARSHAL = 3;
    protected static final int QNAME_NAMESPACE = 0;
    protected static final int QNAME_TYPE = 1;
    private static final String ROOT_LABEL = "root";
    private static final String TYPE_LABEL = "type";
    protected boolean addAdornments;
    protected Hashtable classToQName;
    public boolean dotNet;
    Hashtable idMap;
    public boolean implicitTypes;
    Vector multiRef;
    public Hashtable properties;
    protected Hashtable qNameToClass;

    public SoapSerializationEnvelope(int i)
    {
        super(i);
        properties = new Hashtable();
        idMap = new Hashtable();
        qNameToClass = new Hashtable();
        classToQName = new Hashtable();
        addAdornments = true;
        addMapping(enc, "Array", PropertyInfo.VECTOR_CLASS);
        DEFAULT_MARSHAL.register(this);
    }

    private int getIndex(String s, int i, int j)
    {
        while (s == null || s.length() - i < 3) 
        {
            return j;
        }
        return Integer.parseInt(s.substring(i + 1, s.length() - 1));
    }

    private void writeElement(XmlSerializer xmlserializer, Object obj, PropertyInfo propertyinfo, Object obj1)
        throws IOException
    {
        if (obj1 != null)
        {
            ((Marshal)obj1).writeInstance(xmlserializer, obj);
            return;
        }
        if (obj instanceof SoapObject)
        {
            writeObjectBody(xmlserializer, (SoapObject)obj);
            return;
        }
        if (obj instanceof KvmSerializable)
        {
            writeObjectBody(xmlserializer, (KvmSerializable)obj);
            return;
        }
        if (obj instanceof Vector)
        {
            writeVectorBody(xmlserializer, (Vector)obj, propertyinfo.elementType);
            return;
        } else
        {
            throw new RuntimeException((new StringBuilder()).append("Cannot serialize: ").append(obj).toString());
        }
    }

    public void addMapping(String s, String s1, Class class1)
    {
        addMapping(s, s1, class1, null);
    }

    public void addMapping(String s, String s1, Class class1, Marshal marshal)
    {
        Hashtable hashtable = qNameToClass;
        SoapPrimitive soapprimitive = new SoapPrimitive(s, s1, null);
        Object obj;
        if (marshal == null)
        {
            obj = class1;
        } else
        {
            obj = marshal;
        }
        hashtable.put(soapprimitive, obj);
        classToQName.put(class1.getName(), ((Object) (new Object[] {
            s, s1, null, marshal
        })));
    }

    public void addTemplate(SoapObject soapobject)
    {
        qNameToClass.put(new SoapPrimitive(soapobject.namespace, soapobject.name, null), soapobject);
    }

    public Object[] getInfo(Object obj, Object obj1)
    {
        Object obj2;
        obj2 = obj;
        if (obj == null)
        {
            if ((obj1 instanceof SoapObject) || (obj1 instanceof SoapPrimitive))
            {
                obj2 = obj1;
            } else
            {
                obj2 = obj1.getClass();
            }
        }
        if (!(obj2 instanceof SoapObject)) goto _L2; else goto _L1
_L1:
        obj1 = (SoapObject)obj2;
        obj = ((Object) (new Object[4]));
        obj[0] = ((SoapObject) (obj1)).getNamespace();
        obj[1] = ((SoapObject) (obj1)).getName();
        obj[2] = null;
        obj[3] = null;
_L4:
        return ((Object []) (obj));
_L2:
        if (obj2 instanceof SoapPrimitive)
        {
            obj = (SoapPrimitive)obj2;
            return (new Object[] {
                ((SoapPrimitive) (obj)).getNamespace(), ((SoapPrimitive) (obj)).getName(), null, DEFAULT_MARSHAL
            });
        }
        if (!(obj2 instanceof Class) || obj2 == PropertyInfo.OBJECT_CLASS)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = ((Object) ((Object[])(Object[])classToQName.get(((Class)obj2).getName())));
        obj = obj1;
        if (obj1 != null) goto _L4; else goto _L3
_L3:
        return (new Object[] {
            xsd, "anyType", null, null
        });
    }

    public Object getResponse()
        throws SoapFault
    {
        if (bodyIn instanceof SoapFault)
        {
            throw (SoapFault)bodyIn;
        }
        KvmSerializable kvmserializable = (KvmSerializable)bodyIn;
        if (kvmserializable.getPropertyCount() == 0)
        {
            return null;
        } else
        {
            return kvmserializable.getProperty(0);
        }
    }

    public Object getResult()
    {
        KvmSerializable kvmserializable = (KvmSerializable)bodyIn;
        if (kvmserializable.getPropertyCount() == 0)
        {
            return null;
        } else
        {
            return kvmserializable.getProperty(0);
        }
    }

    public boolean isAddAdornments()
    {
        return addAdornments;
    }

    public void parseBody(XmlPullParser xmlpullparser)
        throws IOException, XmlPullParserException
    {
        bodyIn = null;
        xmlpullparser.nextTag();
        if (xmlpullparser.getEventType() == 2 && xmlpullparser.getNamespace().equals(env) && xmlpullparser.getName().equals("Fault"))
        {
            SoapFault soapfault = new SoapFault();
            soapfault.parse(xmlpullparser);
            bodyIn = soapfault;
        } else
        {
            while (xmlpullparser.getEventType() == 2) 
            {
                String s = xmlpullparser.getAttributeValue(enc, "root");
                Object obj = read(xmlpullparser, null, -1, xmlpullparser.getNamespace(), xmlpullparser.getName(), PropertyInfo.OBJECT_TYPE);
                if ("1".equals(s) || bodyIn == null)
                {
                    bodyIn = obj;
                }
                xmlpullparser.nextTag();
            }
        }
    }

    public Object read(XmlPullParser xmlpullparser, Object obj, int i, String s, String s1, PropertyInfo propertyinfo)
        throws IOException, XmlPullParserException
    {
        String s2;
        String s5;
        s5 = xmlpullparser.getName();
        s2 = xmlpullparser.getAttributeValue(null, "href");
        if (s2 == null) goto _L2; else goto _L1
_L1:
label0:
        {
            if (obj == null)
            {
                throw new RuntimeException("href at root level?!?");
            }
            propertyinfo = s2.substring(1);
            s1 = ((String) (idMap.get(propertyinfo)));
            if (s1 != null)
            {
                s = s1;
                if (!(s1 instanceof FwdRef))
                {
                    break label0;
                }
            }
            s = new FwdRef();
            s.next = (FwdRef)s1;
            s.obj = obj;
            s.index = i;
            idMap.put(propertyinfo, s);
            s = null;
        }
        xmlpullparser.nextTag();
        xmlpullparser.require(3, null, s5);
        obj = s;
_L8:
        xmlpullparser.require(3, null, s5);
        return obj;
_L2:
        String s3 = xmlpullparser.getAttributeValue(xsi, "nil");
        String s6 = xmlpullparser.getAttributeValue(null, "id");
        obj = s3;
        if (s3 == null)
        {
            obj = xmlpullparser.getAttributeValue(xsi, "null");
        }
        if (obj != null && SoapEnvelope.stringToBoolean(((String) (obj))))
        {
            s = null;
            xmlpullparser.nextTag();
            xmlpullparser.require(3, null, s5);
        } else
        {
            String s7 = xmlpullparser.getAttributeValue(xsi, "type");
            String s4;
            if (s7 != null)
            {
                i = s7.indexOf(':');
                s4 = s7.substring(i + 1);
                if (i == -1)
                {
                    obj = "";
                } else
                {
                    obj = s7.substring(0, i);
                }
                obj = xmlpullparser.getNamespace(((String) (obj)));
            } else
            {
                obj = s;
                s4 = s1;
                if (s1 == null)
                {
                    obj = s;
                    s4 = s1;
                    if (s == null)
                    {
                        if (xmlpullparser.getAttributeValue(enc, "arrayType") != null)
                        {
                            obj = enc;
                            s4 = "Array";
                        } else
                        {
                            s = ((String) (getInfo(propertyinfo.type, null)));
                            obj = (String)s[0];
                            s4 = (String)s[1];
                        }
                    }
                }
            }
            if (s7 == null)
            {
                implicitTypes = true;
            }
            s1 = ((String) (readInstance(xmlpullparser, ((String) (obj)), s4, propertyinfo)));
            s = s1;
            if (s1 == null)
            {
                s = ((String) (readUnknown(xmlpullparser, ((String) (obj)), s4)));
            }
        }
        obj = s;
        if (s6 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = idMap.get(s6);
        if (!(obj instanceof FwdRef)) goto _L4; else goto _L3
_L3:
        obj = (FwdRef)obj;
        do
        {
            if (((FwdRef) (obj)).obj instanceof KvmSerializable)
            {
                ((KvmSerializable)((FwdRef) (obj)).obj).setProperty(((FwdRef) (obj)).index, s);
            } else
            {
                ((Vector)((FwdRef) (obj)).obj).setElementAt(s, ((FwdRef) (obj)).index);
            }
            s1 = ((FwdRef) (obj)).next;
            obj = s1;
        } while (s1 != null);
_L6:
        idMap.put(s6, s);
        obj = s;
        continue; /* Loop/switch isn't completed */
_L4:
        if (obj == null) goto _L6; else goto _L5
_L5:
        throw new RuntimeException("double ID");
        if (true) goto _L8; else goto _L7
_L7:
    }

    public Object readInstance(XmlPullParser xmlpullparser, String s, String s1, PropertyInfo propertyinfo)
        throws IOException, XmlPullParserException
    {
        Object obj = qNameToClass.get(new SoapPrimitive(s, s1, null));
        if (obj == null)
        {
            return null;
        }
        if (obj instanceof Marshal)
        {
            return ((Marshal)obj).readInstance(xmlpullparser, s, s1, propertyinfo);
        }
        if (obj instanceof SoapObject)
        {
            s = ((SoapObject)obj).newInstance();
        } else
        if (obj == org/ksoap2/serialization/SoapObject)
        {
            s = new SoapObject(s, s1);
        } else
        {
            try
            {
                s = ((String) (((Class)obj).newInstance()));
            }
            // Misplaced declaration of an exception variable
            catch (XmlPullParser xmlpullparser)
            {
                throw new RuntimeException(xmlpullparser.toString());
            }
        }
        if (s instanceof SoapObject)
        {
            readSerializable(xmlpullparser, (SoapObject)s);
            return s;
        }
        if (s instanceof KvmSerializable)
        {
            readSerializable(xmlpullparser, (KvmSerializable)s);
            return s;
        }
        if (s instanceof Vector)
        {
            readVector(xmlpullparser, (Vector)s, propertyinfo.elementType);
            return s;
        } else
        {
            throw new RuntimeException((new StringBuilder()).append("no deserializer for ").append(s.getClass()).toString());
        }
    }

    protected void readSerializable(XmlPullParser xmlpullparser, KvmSerializable kvmserializable)
        throws IOException, XmlPullParserException
    {
        int i = -1;
        int j1 = kvmserializable.getPropertyCount();
        PropertyInfo propertyinfo = new PropertyInfo();
label0:
        do
        {
            String s;
label1:
            {
                if (xmlpullparser.nextTag() == 3)
                {
                    break label0;
                }
                s = xmlpullparser.getName();
                int l = j1;
                int k = i;
                int j = l;
                if (implicitTypes)
                {
                    if (kvmserializable instanceof SoapObject)
                    {
                        break label1;
                    }
                    j = l;
                    k = i;
                }
label2:
                do
                {
                    int i1;
                    do
                    {
                        i1 = j - 1;
                        if (j == 0)
                        {
                            throw new RuntimeException((new StringBuilder()).append("Unknown Property: ").append(s).toString());
                        }
                        j = k + 1;
                        i = j;
                        if (j >= j1)
                        {
                            i = 0;
                        }
                        kvmserializable.getPropertyInfo(i, properties, propertyinfo);
                        if (propertyinfo.namespace == null && s.equals(propertyinfo.name) || propertyinfo.name == null && i == 0)
                        {
                            break label2;
                        }
                        k = i;
                        j = i1;
                    } while (!s.equals(propertyinfo.name));
                    k = i;
                    j = i1;
                } while (!xmlpullparser.getNamespace().equals(propertyinfo.namespace));
                kvmserializable.setProperty(i, read(xmlpullparser, kvmserializable, i, null, null, propertyinfo));
                continue;
            }
            ((SoapObject)kvmserializable).addProperty(xmlpullparser.getName(), read(xmlpullparser, kvmserializable, kvmserializable.getPropertyCount(), ((SoapObject)kvmserializable).getNamespace(), s, PropertyInfo.OBJECT_TYPE));
        } while (true);
        xmlpullparser.require(3, null, null);
    }

    protected void readSerializable(XmlPullParser xmlpullparser, SoapObject soapobject)
        throws IOException, XmlPullParserException
    {
        for (int i = 0; i < xmlpullparser.getAttributeCount(); i++)
        {
            soapobject.addAttribute(xmlpullparser.getAttributeName(i), xmlpullparser.getAttributeValue(i));
        }

        readSerializable(xmlpullparser, ((KvmSerializable) (soapobject)));
    }

    protected Object readUnknown(XmlPullParser xmlpullparser, String s, String s1)
        throws IOException, XmlPullParserException
    {
        String s3 = xmlpullparser.getName();
        String s4 = xmlpullparser.getNamespace();
        xmlpullparser.next();
        Object obj = null;
        Object obj1 = null;
        String s2;
        if (xmlpullparser.getEventType() == 4)
        {
            s2 = xmlpullparser.getText();
            obj = new SoapPrimitive(s, s1, s2);
            xmlpullparser.next();
        } else
        {
            s2 = obj1;
            if (xmlpullparser.getEventType() == 3)
            {
                obj = new SoapObject(s, s1);
                s2 = obj1;
            }
        }
        if (xmlpullparser.getEventType() == 2)
        {
            if (s2 != null && s2.trim().length() != 0)
            {
                throw new RuntimeException("Malformed input: Mixed content");
            }
            obj = new SoapObject(s, s1);
            for (; xmlpullparser.getEventType() != 3; xmlpullparser.nextTag())
            {
                ((SoapObject) (obj)).addProperty(xmlpullparser.getName(), read(xmlpullparser, obj, ((SoapObject) (obj)).getPropertyCount(), null, null, PropertyInfo.OBJECT_TYPE));
            }

        }
        xmlpullparser.require(3, s4, s3);
        return obj;
    }

    protected void readVector(XmlPullParser xmlpullparser, Vector vector, PropertyInfo propertyinfo)
        throws IOException, XmlPullParserException
    {
        String s = null;
        String s1 = null;
        int i = vector.size();
        int k = 1;
        String s3 = xmlpullparser.getAttributeValue(enc, "arrayType");
        int j = k;
        if (s3 != null)
        {
            i = s3.indexOf(':');
            j = s3.indexOf("[", i);
            Object obj = s3.substring(i + 1, j);
            String s2;
            int l;
            if (i == -1)
            {
                s = "";
            } else
            {
                s = s3.substring(0, i);
            }
            s2 = xmlpullparser.getNamespace(s);
            l = getIndex(s3, j, -1);
            s = s2;
            s1 = ((String) (obj));
            j = k;
            i = l;
            if (l != -1)
            {
                vector.setSize(l);
                j = 0;
                i = l;
                s1 = ((String) (obj));
                s = s2;
            }
        }
        obj = propertyinfo;
        if (propertyinfo == null)
        {
            obj = PropertyInfo.OBJECT_TYPE;
        }
        xmlpullparser.nextTag();
        l = getIndex(xmlpullparser.getAttributeValue(enc, "offset"), 0, 0);
        while (xmlpullparser.getEventType() != 3) 
        {
            l = getIndex(xmlpullparser.getAttributeValue(enc, "position"), 0, l);
            k = i;
            if (j != 0)
            {
                k = i;
                if (l >= i)
                {
                    k = l + 1;
                    vector.setSize(k);
                }
            }
            vector.setElementAt(read(xmlpullparser, vector, l, s, s1, ((PropertyInfo) (obj))), l);
            l++;
            xmlpullparser.nextTag();
            i = k;
        }
        xmlpullparser.require(3, null, null);
    }

    public void setAddAdornments(boolean flag)
    {
        addAdornments = flag;
    }

    public void writeBody(XmlSerializer xmlserializer)
        throws IOException
    {
        multiRef = new Vector();
        multiRef.addElement(bodyOut);
        Object aobj[] = getInfo(null, bodyOut);
        String s;
        if (dotNet)
        {
            s = "";
        } else
        {
            s = (String)aobj[0];
        }
        xmlserializer.startTag(s, (String)aobj[1]);
        if (dotNet)
        {
            xmlserializer.attribute(null, "xmlns", (String)aobj[0]);
        }
        if (addAdornments)
        {
            if (aobj[2] == null)
            {
                s = "o0";
            } else
            {
                s = (String)aobj[2];
            }
            xmlserializer.attribute(null, "id", s);
            xmlserializer.attribute(enc, "root", "1");
        }
        writeElement(xmlserializer, bodyOut, null, aobj[3]);
        if (dotNet)
        {
            s = "";
        } else
        {
            s = (String)aobj[0];
        }
        xmlserializer.endTag(s, (String)aobj[1]);
    }

    public void writeObjectBody(XmlSerializer xmlserializer, KvmSerializable kvmserializable)
        throws IOException
    {
        PropertyInfo propertyinfo = new PropertyInfo();
        int j = kvmserializable.getPropertyCount();
        for (int i = 0; i < j; i++)
        {
            kvmserializable.getPropertyInfo(i, properties, propertyinfo);
            if ((propertyinfo.flags & 1) == 0)
            {
                xmlserializer.startTag(propertyinfo.namespace, propertyinfo.name);
                writeProperty(xmlserializer, kvmserializable.getProperty(i), propertyinfo);
                xmlserializer.endTag(propertyinfo.namespace, propertyinfo.name);
            }
        }

    }

    public void writeObjectBody(XmlSerializer xmlserializer, SoapObject soapobject)
        throws IOException
    {
        for (int i = 0; i < soapobject.getAttributeCount(); i++)
        {
            AttributeInfo attributeinfo = new AttributeInfo();
            soapobject.getAttributeInfo(i, attributeinfo);
            xmlserializer.attribute(attributeinfo.getNamespace(), attributeinfo.getName(), attributeinfo.getValue().toString());
        }

        writeObjectBody(xmlserializer, ((KvmSerializable) (soapobject)));
    }

    protected void writeProperty(XmlSerializer xmlserializer, Object obj, PropertyInfo propertyinfo)
        throws IOException
    {
        if (obj == null)
        {
            propertyinfo = xsi;
            if (version >= 120)
            {
                obj = "nil";
            } else
            {
                obj = "null";
            }
            xmlserializer.attribute(propertyinfo, ((String) (obj)), "true");
            return;
        }
        Object aobj[] = getInfo(null, obj);
        if (propertyinfo.multiRef || aobj[2] != null)
        {
            int j = multiRef.indexOf(obj);
            int i = j;
            if (j == -1)
            {
                i = multiRef.size();
                multiRef.addElement(obj);
            }
            if (aobj[2] == null)
            {
                obj = (new StringBuilder()).append("#o").append(i).toString();
            } else
            {
                obj = (new StringBuilder()).append("#").append(aobj[2]).toString();
            }
            xmlserializer.attribute(null, "href", ((String) (obj)));
            return;
        }
        if (!implicitTypes || obj.getClass() != propertyinfo.type)
        {
            String s = xmlserializer.getPrefix((String)aobj[0], true);
            xmlserializer.attribute(xsi, "type", (new StringBuilder()).append(s).append(":").append(aobj[1]).toString());
        }
        writeElement(xmlserializer, obj, propertyinfo, aobj[3]);
    }

    protected void writeVectorBody(XmlSerializer xmlserializer, Vector vector, PropertyInfo propertyinfo)
        throws IOException
    {
        PropertyInfo propertyinfo1 = propertyinfo;
        if (propertyinfo == null)
        {
            propertyinfo1 = PropertyInfo.OBJECT_TYPE;
        }
        int j = vector.size();
        propertyinfo = ((PropertyInfo) (getInfo(propertyinfo1.type, null)));
        xmlserializer.attribute(enc, "arrayType", (new StringBuilder()).append(xmlserializer.getPrefix((String)propertyinfo[0], false)).append(":").append(propertyinfo[1]).append("[").append(j).append("]").toString());
        boolean flag = false;
        int i = 0;
        while (i < j) 
        {
            if (vector.elementAt(i) == null)
            {
                flag = true;
            } else
            {
                xmlserializer.startTag(null, "item");
                boolean flag1 = flag;
                if (flag)
                {
                    xmlserializer.attribute(enc, "position", (new StringBuilder()).append("[").append(i).append("]").toString());
                    flag1 = false;
                }
                writeProperty(xmlserializer, vector.elementAt(i), propertyinfo1);
                xmlserializer.endTag(null, "item");
                flag = flag1;
            }
            i++;
        }
    }

}
