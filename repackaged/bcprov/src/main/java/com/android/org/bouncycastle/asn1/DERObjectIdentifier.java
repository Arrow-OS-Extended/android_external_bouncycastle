/* GENERATED SOURCE. DO NOT MODIFY. */
// Android-added: keep DER classes for backwards compatibility
package com.android.org.bouncycastle.asn1;

import java.nio.charset.StandardCharsets;

/**
 *
 * @deprecated Use ASN1ObjectIdentifier instead of this,
 * @hide This class is not part of the Android public SDK API
 */
public class DERObjectIdentifier
    extends ASN1ObjectIdentifier
{
    @android.compat.annotation.UnsupportedAppUsage(maxTargetSdk = 30, trackingBug = 170729553)
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
// Android-added: keep DER classes for backwards compatibility
