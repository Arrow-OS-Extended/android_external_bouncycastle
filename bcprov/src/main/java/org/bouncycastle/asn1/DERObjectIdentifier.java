package org.bouncycastle.asn1;

import java.nio.charset.StandardCharsets;

/**
 *
 * @deprecated Use ASN1ObjectIdentifier instead of this,
 */
public class DERObjectIdentifier
    extends ASN1ObjectIdentifier
{
    public DERObjectIdentifier(String identifier)
    {
        super(identifier);
    }

    DERObjectIdentifier(byte[] bytes)
    {
        super(new String(bytes, StandardCharsets.UTF_8));
    }

    DERObjectIdentifier(ASN1ObjectIdentifier oid, String branch)
    {
        super(oid, branch);
    }
}
