package com.TryCloud.pages;

import com.TryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class FilePage {

        public FilePage(){

                PageFactory.initElements(Driver.getDriver(), this);
        }

        @FindBy(xpath = "//label[@for='select_all_files']")
        public WebElement leftTopCheckBox;


        @FindBy(xpath = "//a[.='Favorites']")
        public WebElement favoritesBtn;

        @FindBy (xpath = "//a[@class='action action-menu permanent']")
        public List<WebElement> threeDot;


        @FindBy(xpath = "//span[.='Add to favorites']")
        public WebElement AddToFavorite;

        @FindBy(xpath = "//table[@id='filestable']//tr[@data-id='30759']")
        public WebElement ExpectedFavorite;

        @FindBy(xpath = "//table[@id='filestable']//tr[@data-id='27416']")
        public WebElement actualFavorite;

        @FindBy(xpath = "//span[.='Details']")
        public WebElement detailsBtn;

        @FindBy (id = "commentsTabView")
        public WebElement commentsBtn;

        @FindBy(xpath = "//div[@class='message']")
        public WebElement inputCommentBox;

        @FindBy(xpath = "//input[@class='submit icon-confirm has-tooltip']")
        public WebElement submitBtn;

        @FindBy(xpath = "(//div[@class='message'])[2]")
        public WebElement postMessageText;

        @FindBy(xpath = "//table[@id='filestable']//tbody//tr/td//input")
        public List<WebElement> allCheckBox;

        @FindBy(xpath ="//table[@id='filestable']//tbody//tr" )
        public List<WebElement> allRowOfTheTable;

        @FindBy(xpath = "//div[@class='viewcontainer has-comments']//table//tbody//tr")
        public List<WebElement> allRowAfterInFavorite;

        @FindBy(xpath = "//span[.='Remove from favorites'] ")
        public WebElement removeFromFavorite;

        @FindBy(xpath = "//a[@class='button new']")
        public WebElement addIcon;


        @FindBy(xpath = "//label[@data-action='upload']")
        public WebElement uploadFile;




        // US_07 elements
        /////////
        @FindBy(xpath = "//a[@aria-label='Files']")
        public WebElement fileBtn;

        @FindBy(xpath = "//a[@class='button new']")
        public WebElement addBtn;

        @FindBy(xpath = "//a[@data-action='folder']")
        public WebElement newFolderBtn;

        @FindBy(xpath = "//input[@class='icon-confirm']")
        public WebElement arrowBtn;

        @FindBy(id = "view13-input-folder")
        public WebElement inputFolder;

        @FindBy(xpath = "//span[@class='innernametext']")
        public List<WebElement> folderNameList;

        @FindBy(xpath = "//span[@id ='selectedActionsList']")
        public WebElement actionsBtn;

        @FindBy(xpath = "//span[.='Delete']")
        public WebElement deleteBtn;

        @FindBy(xpath = "//*[@id='file_upload_start']")
        public WebElement inputFile;

        @FindBy(css = "#uploadprogressbar")
        public WebElement loadBar;

        @FindBy(xpath = "//span[@class='innernametext']")
        public List <WebElement> listOfFoldersNamesText;

        //Inside the New Folder
        @FindBy(xpath="//tr[@data-type='file']")
        public List <WebElement> listOfUploadedFiles;

        // End of US_07 elements

}
