package org.wisdom.myth.it;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Check the correct generation of the CSS files.
 */
public class CheckIT {

    private File target = new File("target");
    private File classes = new File(target, "classes");
    private File internalAssets = new File(classes, "assets");
    private File wisdom = new File(target, "wisdom");
    private File externalAssets = new File(wisdom, "assets");

    @Test
    public void testInternalStylesheets() throws IOException {
        File style1 = new File(internalAssets, "int-style1.css");
        File style2 = new File(internalAssets, "sub/int-style2.css");

        assertThat(FileUtils.readFileToString(style1))
                .contains("color: #847AD1;")
                .contains("padding: 10px;");

        assertThat(FileUtils.readFileToString(style2))
                .contains("color: rgb(157, 149, 218);")
                .contains("-webkit-transition: color .2s;")
                .contains("transition: color .2s;");
    }

    @Test
    public void testExternalStylesheets() throws IOException {
        File style1 = new File(externalAssets, "ext-style1.css");
        File style2 = new File(externalAssets, "sub/ext-style2.css");

        assertThat(FileUtils.readFileToString(style1))
                .contains("color: #847AD1;")
                .contains("padding: 10px;");

        assertThat(FileUtils.readFileToString(style2))
                .contains("color: rgb(157, 149, 218);")
                .contains("-webkit-transition: color .2s;")
                .contains("transition: color .2s;");
    }

}
