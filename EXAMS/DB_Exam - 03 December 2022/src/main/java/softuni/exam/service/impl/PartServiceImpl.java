package softuni.exam.service.impl;

import org.springframework.stereotype.Service;
import softuni.exam.service.PartService;

import java.io.IOException;
// TODO: Implement all methods
@Service
public class PartServiceImpl implements PartService {
    @Override
    public boolean areImported() {
        return false;
    }

    @Override
    public String readPartsFileContent() throws IOException {
        return null;
    }

    @Override
    public String importParts() throws IOException {
        return null;
    }
}
