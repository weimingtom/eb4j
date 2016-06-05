package io.github.eb4j;

import org.testng.annotations.Test;

import java.io.File;

import static org.testng.Assert.*;

/**
 * Created by miurahr on 16/06/05.
 */
public class SubBookTest {
    Book book;
    SubBook[] subbooks;

    @Test(groups = "init")
    public void testSubBookConstructor() throws Exception {
        File bookPath = new File(this.getClass().getResource("/data/epwing").getFile());
        File appendixPath = null;
        book = new Book(bookPath, appendixPath);
        subbooks = book.getSubBooks();
        assertNotNull(subbooks, "Subbook constructor should not return null.");
    }

    @Test(dependsOnGroups = {"init"})
    public void testGetBook() throws Exception {
        assertEquals(subbooks[0].getBook(), book, "getBook() returns parent book.");
    }

    @Test(dependsOnGroups = {"init"})
    public void testSetAppendix() throws Exception {
        // TODO: need test data
    }

    @Test(dependsOnGroups = {"init"})
    public void testGetSubAppendix() throws Exception {
        // TODO: need test data
    }

    @Test(dependsOnGroups = {"init"})
    public void testGetTitle() throws Exception {
        assertEquals(subbooks[0].getTitle(), "test");
    }

    @Test(dependsOnGroups = {"init"})
    public void testGetName() throws Exception {
        assertEquals(subbooks[0].getName(), "test");
    }

    @Test(dependsOnGroups = {"init"})
    public void testGetFont() throws Exception {
        // TODO: need test data
        // this method returns GAIJI font.
    }

    @Test(dependsOnGroups = {"init"})
    public void testGetFont1() throws Exception {
        // TODO: need test data
        // this method returns GAIJI font.
    }

    @Test(dependsOnGroups = {"init"})
    public void testSetFont() throws Exception {
        subbooks[0] .setFont(ExtFont.FONT_48);
    }

    @Test(dependsOnGroups = {"init"})
    public void testGetGraphicData() throws Exception {

    }

    @Test
    public void testGetSoundData() throws Exception {

    }

    @Test
    public void testGetTextFile() throws Exception {

    }

    @Test
    public void testGetGraphicFile() throws Exception {

    }

    @Test
    public void testGetSoundFile() throws Exception {

    }

    @Test
    public void testGetMovieFileList() throws Exception {

    }

    @Test
    public void testGetMovieFile() throws Exception {

    }

    @Test
    public void testGetHeading() throws Exception {

    }

    @Test
    public void testGetNextHeadingPosition() throws Exception {

    }

    @Test
    public void testGetText() throws Exception {

    }

    @Test
    public void testGetMenu() throws Exception {

    }

    @Test
    public void testGetImageMenu() throws Exception {

    }

    @Test
    public void testGetCopyright() throws Exception {

    }

    @Test
    public void testGetWordIndexStyle() throws Exception {

    }

    @Test
    public void testGetEndwordIndexStyle() throws Exception {

    }

    @Test
    public void testSearchExactword() throws Exception {

    }

    @Test
    public void testSearchWord() throws Exception {

    }

    @Test
    public void testSearchEndword() throws Exception {

    }

    @Test
    public void testSearchKeyword() throws Exception {

    }

    @Test
    public void testSearchCross() throws Exception {

    }

    @Test
    public void testSearchMulti() throws Exception {

    }

    @Test
    public void testHasMenu() throws Exception {

    }

    @Test
    public void testHasImageMenu() throws Exception {

    }

    @Test
    public void testHasCopyright() throws Exception {

    }

    @Test
    public void testHasExactwordSearch() throws Exception {

    }

    @Test
    public void testHasWordSearch() throws Exception {

    }

    @Test
    public void testHasEndwordSearch() throws Exception {

    }

    @Test
    public void testHasKeywordSearch() throws Exception {

    }

    @Test
    public void testHasCrossSearch() throws Exception {

    }

    @Test
    public void testHasMultiSearch() throws Exception {

    }

    @Test
    public void testGetMultiCount() throws Exception {

    }

    @Test
    public void testGetMultiTitle() throws Exception {

    }

    @Test
    public void testGetMultiEntryCount() throws Exception {

    }

    @Test
    public void testGetMultiEntryLabel() throws Exception {

    }

    @Test
    public void testGetCandidate() throws Exception {

    }

    @Test
    public void testHasMultiEntryCandidate() throws Exception {

    }

    @Test(dependsOnGroups = {"init"})
    public void testToString() throws Exception {
        assertEquals(subbooks[0].toString(), subbooks[0].getName());
    }

}