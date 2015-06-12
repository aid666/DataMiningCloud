package net.dmcloud.loader.gae;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.Set;

import net.dmcloud.loader.client.IDMServiceExLoader;
import net.dmcloud.loader.core.DMServiceLoader;
import net.dmcloud.loader.core.exception.LoadInputException;
import net.dmcloud.loader.core.exception.LoadOutputException;
import net.dmcloud.loader.model.DMServiceMetadata;


public class GAEDMServiceLoader extends DMServiceLoader implements IDMServiceExLoader
{
	private Set<String> keys;
	
	public GAEDMServiceLoader()
	{
		keys = new HashSet<String>();
	}

	@Override
	public Set<String> getServiceKeys()
	{
		return keys;
	}

	@Override
	protected InputStream getInputStream(String key) throws LoadInputException
	{
		InputStream is = null;
	   

		return is;
	}

	@Override
	protected OutputStream getOutputStream(String key)
			throws LoadOutputException
	{
		return null;
	}

	@Override
	public DMServiceMetadata getDMServiceMetadata(String key)
	{
		return null;
	}

	@Override
	public void addDMServiceMetadata(String key, DMServiceMetadata meta)
	{
		
	}

	@Override
	public boolean deleteDMServiceMetadata(String key)
	{
		return false;
	}
}
