/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.mihosoft.jcmd;

/**
 *
 * @author miho
 */
public class CMDConfig {
    private String jdkHomeFolder;
    private String cdPath;

    /**
     * @return the jdkHomeFolder
     */
    public String getJdkHomeFolder() {
        return jdkHomeFolder;
    }

    /**
     * @param jdkHomeFolder the jdkHomeFolder to set
     */
    public void setJdkHomeFolder(String jdkHomeFolder) {
        this.jdkHomeFolder = jdkHomeFolder;
    }

    /**
     * @return the cdPath
     */
    public String getCdPath() {
        return cdPath;
    }

    /**
     * @param cdPath the cdPath to set
     */
    public void setCdPath(String cdPath) {
        this.cdPath = cdPath;
    }
}
