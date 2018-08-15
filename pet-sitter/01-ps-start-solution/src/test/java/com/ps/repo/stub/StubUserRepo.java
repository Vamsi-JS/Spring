package com.ps.repo.stub;

import com.ps.ents.User;
import com.ps.repos.UserRepo;
import org.apache.commons.lang3.NotImplementedException;

import java.util.Set;

public class StubUserRepo extends  StubAbstractRepo<User> implements UserRepo {

    @Override
    public Set<User> findAllByUserName(String username, boolean exactMatch) {
        throw new NotImplementedException("Not needed for this stub.");
    }

    @Override
    public Set<User> findByRating(double startRating, double endRating) {
        throw new NotImplementedException("Not needed for this stub.");
    }
}

