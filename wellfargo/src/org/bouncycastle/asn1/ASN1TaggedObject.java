// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.IOException;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Primitive, ASN1TaggedObjectParser, ASN1Choice, ASN1Encodable, 
//            ASN1Set, ASN1Sequence, ASN1OctetString, DERTaggedObject, 
//            DLTaggedObject, ASN1OutputStream

public abstract class ASN1TaggedObject extends ASN1Primitive
    implements ASN1TaggedObjectParser
{

    boolean empty;
    boolean explicit;
    ASN1Encodable obj;
    int tagNo;

    public ASN1TaggedObject(boolean flag, int i, ASN1Encodable asn1encodable)
    {
        empty = false;
        explicit = true;
        obj = null;
        if (asn1encodable instanceof ASN1Choice)
        {
            explicit = true;
        } else
        {
            explicit = flag;
        }
        tagNo = i;
        if (explicit)
        {
            obj = asn1encodable;
            return;
        } else
        {
            if (!(asn1encodable.toASN1Primitive() instanceof ASN1Set));
            obj = asn1encodable;
            return;
        }
    }

    public static ASN1TaggedObject getInstance(Object obj1)
    {
        if (obj1 == null || (obj1 instanceof ASN1TaggedObject))
        {
            return (ASN1TaggedObject)obj1;
        }
        if (obj1 instanceof byte[])
        {
            try
            {
                obj1 = getInstance(fromByteArray((byte[])(byte[])obj1));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("failed to construct tagged object from byte[]: ").append(((IOException) (obj1)).getMessage()).toString());
            }
            return ((ASN1TaggedObject) (obj1));
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("unknown object in getInstance: ").append(obj1.getClass().getName()).toString());
        }
    }

    public static ASN1TaggedObject getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        if (flag)
        {
            return (ASN1TaggedObject)asn1taggedobject.getObject();
        } else
        {
            throw new IllegalArgumentException("implicitly tagged tagged object");
        }
    }

    boolean asn1Equals(ASN1Primitive asn1primitive)
    {
        if (asn1primitive instanceof ASN1TaggedObject) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (tagNo != ((ASN1TaggedObject) (asn1primitive = (ASN1TaggedObject)asn1primitive)).tagNo || empty != ((ASN1TaggedObject) (asn1primitive)).empty || explicit != ((ASN1TaggedObject) (asn1primitive)).explicit) goto _L1; else goto _L3
_L3:
        if (obj != null) goto _L5; else goto _L4
_L4:
        if (((ASN1TaggedObject) (asn1primitive)).obj != null) goto _L1; else goto _L6
_L6:
        return true;
_L5:
        if (!obj.toASN1Primitive().equals(((ASN1TaggedObject) (asn1primitive)).obj.toASN1Primitive()))
        {
            return false;
        }
        if (true) goto _L6; else goto _L7
_L7:
    }

    abstract void encode(ASN1OutputStream asn1outputstream);

    public ASN1Primitive getLoadedObject()
    {
        return toASN1Primitive();
    }

    public ASN1Primitive getObject()
    {
        if (obj != null)
        {
            return obj.toASN1Primitive();
        } else
        {
            return null;
        }
    }

    public ASN1Encodable getObjectParser(int i, boolean flag)
    {
        switch (i)
        {
        default:
            if (flag)
            {
                return getObject();
            } else
            {
                throw new RuntimeException((new StringBuilder()).append("implicit tagging not implemented for tag: ").append(i).toString());
            }

        case 17: // '\021'
            return ASN1Set.getInstance(this, flag).parser();

        case 16: // '\020'
            return ASN1Sequence.getInstance(this, flag).parser();

        case 4: // '\004'
            return ASN1OctetString.getInstance(this, flag).parser();
        }
    }

    public int getTagNo()
    {
        return tagNo;
    }

    public int hashCode()
    {
        int j = tagNo;
        int i = j;
        if (obj != null)
        {
            i = j ^ obj.hashCode();
        }
        return i;
    }

    public boolean isEmpty()
    {
        return empty;
    }

    public boolean isExplicit()
    {
        return explicit;
    }

    ASN1Primitive toDERObject()
    {
        return new DERTaggedObject(explicit, tagNo, obj);
    }

    ASN1Primitive toDLObject()
    {
        return new DLTaggedObject(explicit, tagNo, obj);
    }

    public String toString()
    {
        return (new StringBuilder()).append("[").append(tagNo).append("]").append(obj).toString();
    }
}
