package com.example;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.UI;
import com.vaadin.ui.themes.ValoTheme;
import org.vaadin.openesignforms.ckeditor.CKEditorConfig;
import org.vaadin.openesignforms.ckeditor.CKEditorTextField;

/**
 * @author Nikolay Shabak (nikolay)
 * @since 24/05/16
 */
@SpringUI
@Theme(ValoTheme.THEME_NAME)
public class SimpleUI extends UI {
    @Override
    protected void init(VaadinRequest vaadinRequest) {

        final String editorInitialValue =
                "<p>Thanks TinyMCEEditor for getting us started on the CKEditor integration.</p>\n\n<h1>Like TinyMCEEditor said, &quot;Vaadin rocks!&quot;</h1>\n\n<h1>And CKEditor is no slouch either.</h1>\n";

        CKEditorConfig config = new CKEditorConfig();
        config.useCompactTags();
        config.disableElementsPath();
        config.setResizeDir(CKEditorConfig.RESIZE_DIR.HORIZONTAL);
        config.disableSpellChecker();
        config.setWidth("100%");

        final CKEditorTextField ckEditorTextField = new CKEditorTextField(config);
        ckEditorTextField.setValue(editorInitialValue);

        setContent(ckEditorTextField);
    }
}
