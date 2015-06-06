package unitTests;

import junit.framework.TestCase;
import org.junit.Test;
import org.ozsoft.texasholdem.gui.ResourceManager;

import javax.swing.*;

import static org.junit.Assert.*;

/**
 * Created by matheus on 6/6/15.
 */
public class ResourceManagerTest extends TestCase {

    @Test
    public void testGetIcon() throws Exception {
        // Not sure about this...
        assert ResourceManager.getIcon("/images/card_00.png") instanceof ImageIcon;
    }
}