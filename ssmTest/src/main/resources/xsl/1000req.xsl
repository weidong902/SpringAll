<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output version="1.0" method="xml" encoding="UTF-8"/>
    <xsl:param name="cstNo"></xsl:param>
    <xsl:param name="userId"></xsl:param>

    <xsl:variable name="apNode" select="ap"/>
    <xsl:variable name="headNode" select="ap/head"/>
    <xsl:variable name="bodyNode" select="ap/body"/>
    <xsl:variable name="reqNoNode" select="ap/head/req_no"/>

    <xsl:template match="ap">
        <xsl:copy-of select="$apNode"/>
    </xsl:template>

</xsl:stylesheet>